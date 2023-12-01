package com.example.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Vechile")
public class Vechile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String vName;
	private int modelNumber;
	private String ownerName;

	public Vechile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vechile(Long id, String vName, int modelNumber, String ownerName) {
		super();
		this.id = id;
		this.vName = vName;
		this.modelNumber = modelNumber;
		this.ownerName = ownerName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getvName() {
		return vName;
	}

	public void setvName(String vName) {
		this.vName = vName;
	}

	public int getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return "Vechile [id=" + id + ", vName=" + vName + ", modelNumber=" + modelNumber + ", ownerName=" + ownerName
				+ "]";
	}

}
