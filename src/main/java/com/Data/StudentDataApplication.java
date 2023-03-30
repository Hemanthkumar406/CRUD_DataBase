package com.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Data.Entity.Student;
import com.Data.Repostory.StudentRep;

@SpringBootApplication
public class StudentDataApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentDataApplication.class, args);
	}
	
	@Autowired
	private StudentRep s;
	@Override
	public void run(String... args) throws Exception {
//		Student s1 = new Student("kalayn","kumar","kumar@gmail.com");
//		s.save(s1);
//		Student s2 = new Student("Pardhu","vas","Pardhu@gmail.com");
//		s.save(s2);
//		
//		Student s3 = new Student("Dem","kFar","Famil@gmail.com");
//		s.save(s3);
		
	}

}
