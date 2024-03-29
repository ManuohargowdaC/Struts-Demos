package com.studentapp.action;

import com.opensymphony.xwork2.ActionSupport;
import com.studentapp.model.Student;

public class StudentAction extends ActionSupport {
	
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	public String execute() {
		if(student.getStudentName().equals("Manohar"))
			return "success";
		else
			return "error";
	}

}
