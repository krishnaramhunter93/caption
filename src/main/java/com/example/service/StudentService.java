package com.example.service;

import java.util.List;

import com.example.dao.Student;

public interface StudentService {

	Student getStudentById(Long id);

	Student saveStudent(Student student);

	void deleteStuddenById(Long id);

	List<Student> getAllStudentList(Student student);

}
