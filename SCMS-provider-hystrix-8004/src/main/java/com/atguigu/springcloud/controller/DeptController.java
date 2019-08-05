package com.atguigu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.cloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DeptController {

	@Autowired
	private DeptService deptService;
	
	@RequestMapping(value="/dept/add",method=RequestMethod.POST)
	public boolean add(
				@RequestBody Dept dept
			){
		
		return deptService.addDept(dept);
	}
	
	@RequestMapping(value="/dept/get/{deptNo}",method={RequestMethod.GET})
	@HystrixCommand(fallbackMethod="hystrixGet")
	public Dept get(
				@PathVariable("deptNo") Integer deptNo
			){
		
		if(deptNo == 1){
			throw new RuntimeException("无效");
		}
		return deptService.findById(deptNo);
	}
	
	@RequestMapping(value="/dept/get/all",method={RequestMethod.GET})
	public List<Dept> getAll(){
		
		return deptService.findAll();
	}
	
	
	public Dept hystrixGet(@PathVariable("deptNo") Integer deptNo){
		
		return new Dept(deptNo,"错误","null");
	}
}
