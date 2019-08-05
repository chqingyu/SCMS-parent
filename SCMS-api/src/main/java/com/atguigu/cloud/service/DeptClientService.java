package com.atguigu.cloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.atguigu.cloud.entities.Dept;
import com.atguigu.cloud.factory.DeptClientServiceFallBackFactory;

@FeignClient(value="atguigu-scms-provider",fallbackFactory=DeptClientServiceFallBackFactory.class)
public interface DeptClientService {
	
	@RequestMapping(value="/dept/add",method=RequestMethod.POST)
	public boolean add(Dept dept);
	
	@RequestMapping(value="/dept/get/{deptNo}",method=RequestMethod.GET)
	public Dept get(
				@PathVariable("deptNo") Integer deptNo
			);
	
	@RequestMapping(value="/dept/get/all")
	public List<Dept> getAll();
}
