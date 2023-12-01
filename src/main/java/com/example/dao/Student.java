package com.example.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String fullName;
	private String email;
	private String parentName;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Long id, String fullName, String email, String parentName) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.parentName = parentName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fullName=" + fullName + ", email=" + email + ", parentName=" + parentName + "]";
	}

}
