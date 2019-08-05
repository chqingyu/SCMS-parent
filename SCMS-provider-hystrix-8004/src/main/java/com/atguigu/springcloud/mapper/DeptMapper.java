package com.atguigu.springcloud.mapper;

import java.util.List;

import com.atguigu.cloud.entities.Dept;

public interface DeptMapper {

	Dept findById(Integer deptNo);
	
	List<Dept> findAll();
	
	boolean addDept(Dept dept);
}
