package com.studentapp.model;

public class Student {
	private String studentName;
	private int studentUSN;
	private int department;
	private int marks;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentUSN() {
		return studentUSN;
	}
	public void setStudentUSN(int studentUSN) {
		this.studentUSN = studentUSN;
	}
	public int getDepartment() {
		return department;
	}
	public void setDepartment(int department) {
		this.department = department;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
	public String execute() {
		return "success";
	}
	

}
