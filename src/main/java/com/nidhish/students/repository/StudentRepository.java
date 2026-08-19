package com.nidhish.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nidhish.students.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
        
}
