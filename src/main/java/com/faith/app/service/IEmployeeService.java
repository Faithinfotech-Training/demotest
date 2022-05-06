package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.dto.EmployeeDeptDTO;
import com.faith.app.entity.Employee;

public interface IEmployeeService {

	// List
	public List<Employee> getEmployees();

	// Insert/Update
	public void saveEmployee(Employee employee);

	// Search By Id
	public Optional<Employee> getEmployee(int id);

	// Delete
	public void deleteEmployee(int id);
	

	//Find By EmployeeName -Custom Method
	public List<Employee> getEmployeesByEmployeeName(String name);
	
	//Get All Employee using ViewModel -- InnerJoin
	public List<EmployeeDeptDTO> getAllDTOEmployees();
	
}
