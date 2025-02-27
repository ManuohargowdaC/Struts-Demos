package com.employee.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport{
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
	@Action(value = "studregister",results = {
			@Result(name = "success",location = "studsuccess.jsp"),
			@Result(name = "input",location = "studform.jsp"),
	})
	public String execute() throws Exception{
		if(employee.getEmployeeName().equals("Manohar"))
			return SUCCESS;
		return INPUT;
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		if(employee.getEmployeeName().length()<=0)
			addFieldError("employee.name", "Name is required");
		if(employee.getAge()<20||employee.getAge()>70)
			addFieldError("employee.age", "Age should be Between 21 to 70");
		if(employee.getCity().length()<=0)
			addFieldError("employee.city", "City is Required");
		if(employee.getSalary()<=0)
			addFieldError("employee.salary", "Salary is Required");
		if(employee.getEmail().length()<=0)
			addFieldError("employee.email", "Email is Required");
		if(!employee.getCity().contains("@gmail.com"))
			addFieldError("employee.email", "City is Required");
		super.validate();
	}
	
	
	

}
