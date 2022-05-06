package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.dao.IEmployeeRepository;
import com.faith.app.dto.EmployeeDeptDTO;
import com.faith.app.entity.Employee;

@Service
public class EmployeeServiceImplementation implements IEmployeeService {

	@Autowired
	private IEmployeeRepository employeeRepo;
		
	//Get all Employees
	@Override
	public List<Employee> getEmployees() {
				
		return (List<Employee>) employeeRepo.findAll();
	}

	//Insert or Update
	@Override
	public void saveEmployee(Employee employee) {
		System.out.println("Service");
		System.out.println(employee);
		employeeRepo.save(employee);
	}

	//Get Employee By Id
	@Override
	public Optional<Employee> getEmployee(int id) {
		
		return employeeRepo.findById(id);
		
		
	}

	//Delete Employee
	@Override
	public void deleteEmployee(int id) {
		employeeRepo.deleteById(id);
	}

	@Override
	public List<Employee> getEmployeesByEmployeeName(String name) {
		
		return (List<Employee>) employeeRepo.findByEmployeeName(name);
	}

	@Override
	public List<EmployeeDeptDTO> getAllDTOEmployees() {
		
		return (List<EmployeeDeptDTO>) employeeRepo.findAllDTOEmployees();
	}
	
}
