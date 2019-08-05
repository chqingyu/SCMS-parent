package com.atguigu.cloud.entities;

public class Dept {

	private Integer detpNo;
	private String deptName;
	private String dbSource;
	
	
	public Dept() {
		super();
	}
	
	
	public Dept(Integer detpNo, String deptName, String dbSource) {
		super();
		this.detpNo = detpNo;
		this.deptName = deptName;
		this.dbSource = dbSource;
	}


	@Override
	public String toString() {
		return "Dept [detpNo=" + detpNo + ", deptName=" + deptName + ", dbSource=" + dbSource + "]";
	}


	public Integer getDetpNo() {
		return detpNo;
	}
	public void setDetpNo(Integer detpNo) {
		this.detpNo = detpNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDbSource() {
		return dbSource;
	}
	public void setDbSource(String dbSource) {
		this.dbSource = dbSource;
	}
	
	
}
