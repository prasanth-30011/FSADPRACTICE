package com.klu.demo.model;

public class CourseRegistration {
private  int rollno;
private String studentName;
private String CourseName;
private int semester;
public CourseRegistration(int rollno,String studentName) {
	this.rollno=rollno;
	this.studentName=studentName;
}
public void setCourseName(String CourseName) {
	this.CourseName=CourseName;
	
}
public void setsemester(int semester) {
	this.semester = semester;
}
public void display() {
	System.out.println("RollNo:"+rollno);
}


}