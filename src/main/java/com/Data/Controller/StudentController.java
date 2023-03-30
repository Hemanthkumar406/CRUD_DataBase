package com.Data.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Data.Entity.Student;
import com.Data.Imp.StudentImp;
import com.Data.Service.StudentService;

@Controller
public class StudentController {

	private StudentService s;

	public StudentController(StudentService s) {
		super();
		this.s = s;
	}
	@GetMapping("/students")
	public String listStudents(Model m)
	{
		m.addAttribute("students",s.getAllStudentd());
		return "students";
		
	}
	@GetMapping("/students/new")
	public String CreateStudentForm(Model m)
	{
		Student s = new Student();
		m.addAttribute("student",s);
		return "create_student";
		
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		s.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", s.getStudentById(id));
		return "edit_student";
	}

	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("student") Student student,
			Model model) {
		
		// get student from database by id
		Student existingStudent = s.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		
		// save updated student object
		s.updateStudent(existingStudent);
		return "redirect:/students";		
	}
	
	// handler method to handle delete student request
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		s.deleteStudentById(id);
		return "redirect:/students";
	}
}
