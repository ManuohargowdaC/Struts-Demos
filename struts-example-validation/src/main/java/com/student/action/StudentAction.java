package com.student.action;

import java.util.Arrays;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

@ResultPath(value = "/WEB-INF/content/")
@Action(value = "/studform",results = {
		@Result(name = "none",location = "/studform.jsp")
		})
public class StudentAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Student student;
	private List<String> hobbies;
	
	
	public StudentAction() {
		hobbies =Arrays.asList("sports","music");
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public List<String> getHobbies() {
		return hobbies;
	}


	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	
	@Action(value = "studform",results = {
			@Result(name = "success",location = "/WEB-INF/content/studform.jsp")
	})
	public String studForm() {
		return NONE;
	}
	
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		if(student.getStudentName().length()<=0)
			addFieldError("student.name", "Name is required");
		if(student.getAge()<20||student.getAge()>70)
			addFieldError("student.age", "Age should be Between 21 to 70");
		if(student.getCity().length()<=0)
			addFieldError("student.city", "City is Required");
		if(student.getAllowance()<=0)
			addFieldError("student.salary", "Salary is Required");
		if(student.getEmail().length()<=0)
			addFieldError("student.email", "Email is Required");
		if(!student.getEmail().contains("@gmail.com"))
			addFieldError("student.email", "City is Required");
		super.validate();
	}

}
