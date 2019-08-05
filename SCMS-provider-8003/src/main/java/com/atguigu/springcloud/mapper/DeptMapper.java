package com.atguigu.springcloud.mapper;

import java.util.List;

import com.atguigu.cloud.entities.Dept;

public interface DeptMapper {

	List<Dept> findAll();

	Dept findById(Integer deptNo);

	boolean addDept(Dept dept);

}
