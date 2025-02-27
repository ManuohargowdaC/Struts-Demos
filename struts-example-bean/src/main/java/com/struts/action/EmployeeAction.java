package com.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.model.Employee;

public class EmployeeAction  {
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	@Override
	public String toString() {
		return "EmployeeAction [employee=" + employee + "]";
	}

	public String execute() {
		if(employee.getEmployeeName().equals("Manohar"))
			return "success";
		else if(employee.getEmployeeName().equals(""))
			throw new NullPointerException();
		else
			return "error";
	}
	

}
