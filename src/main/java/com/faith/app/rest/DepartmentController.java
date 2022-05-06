package com.faith.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.entity.Department;
import com.faith.app.service.IDepartmentService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class DepartmentController {

	@Autowired
	private IDepartmentService departmentService;

	// Get all Employees
	@GetMapping("/departments")
	public List<Department> getAllDepartments() {

		return departmentService.getDepartments();
	}
}
