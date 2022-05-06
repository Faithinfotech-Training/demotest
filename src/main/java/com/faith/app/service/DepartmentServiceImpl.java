package com.faith.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.dao.IDepartmentRepository;
import com.faith.app.entity.Department;

@Service
public class DepartmentServiceImpl implements IDepartmentService {

	@Autowired
	private IDepartmentRepository departmentRepo;
		
	//Get all Departments
	@Override
	public List<Department> getDepartments() {
		// TODO Auto-generated method stub
		return (List<Department>) departmentRepo.findAll();
	}

}
