package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dao.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	

}
