package com.faith.app.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employeeid")
	private Integer id;
	
	@Column(name = "employeename",nullable = false,length=40)
	private String employeeName;
	
	@Column(name = "designation",nullable = false,length=40)
	private String designation;
	
	@Column(name = "dateofjoining")
	private LocalDate dateOfJoining;
	
	
	private Integer departmentid;
	
	
	@ManyToOne
	@JoinColumn(name = "departmentid",insertable = false, updatable = false)
	private Department department;
	
		
	public Employee() {
		super();
	}
	
	public Employee(Integer id, String employeeName, String designation, LocalDate dateofjoining, Department department) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.designation = designation;
		this.dateOfJoining = dateofjoining;
		this.department = department;
	}

	//getters and setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	@JsonBackReference	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	//department id
	
	public Integer getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", designation=" + designation + ", DOJ=" + dateOfJoining
				+ ", department=" + departmentid + "]";
	}
	
	
}
