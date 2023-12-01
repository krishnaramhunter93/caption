package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.Student;
import com.example.service.StudentService;

@RestController
@RequestMapping("/abc")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@GetMapping("/test")
	public String testA() {
		return "test test";
	}

	@GetMapping("/getAllStudent")
	public List<Student> getAllStudentList(@RequestBody Student student) {

		return studentService.getAllStudentList(student);

	}

	@GetMapping("/{id}")
	public Student getStudentByID(@PathVariable Long id) {
		return studentService.getStudentById(id);
	}

	@PostMapping("/create")
	public Student createStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}

	@DeleteMapping("/{id}")
	public void deleteStuddenById(@PathVariable Long id) {

		studentService.deleteStuddenById(id);

	}

	@PutMapping("/updateStudent")
	public Student updateStudent(@PathVariable Long id, @RequestBody Student studentUpdate) {
		Student student = studentService.getStudentById(id);
		if (student != null) {

			student.setFullName(studentUpdate.getFullName());
			student.setEmail(studentUpdate.getEmail());
			student.setParentName(studentUpdate.getParentName());

			return studentService.saveStudent(student);

		}

		return null;
	}

}
