package com.example.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.Student;
import com.example.repository.StudentRepository;
import com.example.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).orElse(null);
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public void deleteStuddenById(Long id) {

		studentRepository.deleteById(id);

	}

	@Override
	public List<Student> getAllStudentList(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

}
