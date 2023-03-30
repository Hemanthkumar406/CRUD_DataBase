package com.Data.Imp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Data.Entity.Student;
import com.Data.Repostory.StudentRep;
import com.Data.Service.StudentService;

@Service
public class StudentImp implements StudentService {

	private StudentRep srep;
	
	public StudentImp(StudentRep s) {
		super();
		srep = s;
	}

	@Override
	public List<Student> getAllStudentd() {
		
		return srep.findAll();
	}

	@Override
	public Student saveStudent(Student s) {
		
		return srep.save(s);
	}
	@Override
	public Student getStudentById(Long id) {
		return srep.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return srep.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		srep.deleteById(id);	
	}

}
