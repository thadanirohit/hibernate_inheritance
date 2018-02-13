package com.artek.perconcreteclass;

public class Developer extends Employee {
	
	private Integer serialNo;
	private String developerProject;
	
	public Integer getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}
	
	public String getDeveloperProject() {
		return developerProject;
	}
	public void setDeveloperProject(String developerProject) {
		this.developerProject = developerProject;
	}		
}
