package com.atguigu.springcloud.service;

import java.util.List;

import com.atguigu.cloud.entities.Dept;

public interface DeptService {

	List<Dept> findAll();

	Dept findById(Integer deptNo);

	boolean addDept(Dept dept);

}
