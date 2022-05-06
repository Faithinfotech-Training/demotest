package com.faith.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.entity.Department;

@Repository
public interface IDepartmentRepository extends CrudRepository<Department, Integer> {

}
