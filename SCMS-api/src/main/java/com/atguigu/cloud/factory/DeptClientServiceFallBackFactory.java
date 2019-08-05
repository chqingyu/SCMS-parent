package com.atguigu.cloud.factory;

import java.util.List;

import org.springframework.stereotype.Component;

import com.atguigu.cloud.entities.Dept;
import com.atguigu.cloud.service.DeptClientService;

import feign.hystrix.FallbackFactory;

@Component
public class DeptClientServiceFallBackFactory implements FallbackFactory<DeptClientService>{

	@Override
	public DeptClientService create(Throwable throwable) {
		
		return new DeptClientService(){

			@Override
			public boolean add(Dept dept) {
				return false;
			}

			@Override
			public Dept get(Integer deptNo) {
				
				return new Dept(1,"无效","null");
			}

			@Override
			public List<Dept> getAll() {
				return null;
			}
			
		};
	}
	
	
}
