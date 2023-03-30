package com.Data.Repostory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Data.Entity.Student;

public interface StudentRep extends JpaRepository<Student, Long> {

}
