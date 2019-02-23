package com.cg.sms.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import com.cg.sms.dto.Student;

public class StudentDAOImpl implements StudentDAO {
	
HashMap<Integer, Student> studentMap= new HashMap<Integer,Student>();
	

	@Override
	public int addStudent(Student student) {
		// TODO Auto-generated method stub
		int rollNo = (int) (1000 * Math.random());
		student.setRollNo(rollNo);
		studentMap.put(rollNo, student);
		return rollNo;
	}

	@Override
	public Student getStudent(int rn) {
		
		Student studs = studentMap.get(rn);
		return studs;
	}

	@Override
	public Student updateStudent(Student student) {
		
		studentMap.put(student.getRollNo(), student);
		return student;
	}

	@Override
	public ArrayList<Student> getStudentList(String courseName) {
		
		Iterator<Student> iterator = studentMap.values().iterator();
		ArrayList<Student> students = new ArrayList<Student>();
		while(iterator.hasNext()) {
			Student stu=iterator.next();
			if(stu.getCourseName().equals(courseName)) {
				students.add(stu);
			}
		}
		return students;
	}

}
