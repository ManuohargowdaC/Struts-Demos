package com.struts.action;

import java.util.Arrays;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport{
	private Student student;
	
	private List<String> hobbies;

	public  StudentAction() {
		hobbies = Arrays.asList("sports","music","dance");
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
		this.hobbies = Arrays.asList("sports","music","dance");
	}
	public String studForm() {
		return NONE;
	}
	
	public String execute() {
		if(student.getStudentName().equals("Manohar"))
			return SUCCESS;
		return "error";
	}
}
