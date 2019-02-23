package com.cg.sms.dto;

public class Student {
	private int rollNo;
	private String name;
	private String courseName;
	private int age;
	private String mobNo;

	/**
	 * @param rollNo
	 * @param name
	 * @param courseName
	 * @param age
	 * @param mobNo
	 */
	public Student() {
	
	}
	public Student(int rollNo, String name, String courseName, int age, String mobNo) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.courseName = courseName;
		this.age = age;
		this.mobNo = mobNo;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

}
