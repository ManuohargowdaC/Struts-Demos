package com.struts.action;

public class Student {
	private String studentName;
	private String city;
	private double stifound;
	private String email;
	private int age;
	private String course;
	private String hobby;
	private String gender;
	
	
	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public double getStifound() {
		return stifound;
	}


	public void setStifound(double stifound) {
		this.stifound = stifound;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public String getHobby() {
		return hobby;
	}


	public void setHobby(String hobby) {
		this.hobby = hobby;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", stifound=" + stifound + ", email=" + email
				+ ", age=" + age + ", course=" + course + ", hobby=" + hobby + ", gender=" + gender + "]";
	}


	public String execute() {
		return "success";
	}

}
