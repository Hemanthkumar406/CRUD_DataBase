package com.Data.Service;

import java.util.List;

import com.Data.Entity.Student;

public interface StudentService {
	List<Student> getAllStudentd();
	Student saveStudent(Student s);
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
