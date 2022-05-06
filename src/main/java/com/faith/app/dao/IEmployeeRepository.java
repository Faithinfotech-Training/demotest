package com.faith.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.dto.EmployeeDeptDTO;
import com.faith.app.entity.Employee;

@Repository
public interface IEmployeeRepository extends CrudRepository<Employee, Integer> {

	//Custom Methods - 1 using JPQL
	@Query("from Employee where employeeName like %?1%")
	public List<Employee> findByEmployeeName(String name);
	
	//Custom Methods - 1 using JPQL + ViewModel
	
	@Query("SELECT new com.faith.app.dto.EmployeeDeptDTO(e.id,e.employeeName,e.designation,"
			+ "d.departmentName) FROM Employee e INNER JOIN e.department d ORDER BY e.id")
	public List<EmployeeDeptDTO> findAllDTOEmployees();
	
	
	
}
