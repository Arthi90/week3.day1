package org.student;

import org.college.College;
import org.department.Department;

public class Student {
	public void studentName() {
		System.out.println("Student Name:Arthi");
	}
	public void studentDept() {
		System.out.println("Student Department : CSE");
	}
    public void studentID() {
    	System.out.println("Student ID: 9021");
    }
	public static void main(String[] args) {
		/*  Package   :org.student
		     Class        :Student
		     Methods   :studentName(),studentDept(),studentId()
*/
		College college=new College();	
		college.collegeName();
		college.collegeCode();
		college.collegeRank();
		
		Department department= new Department();
		department.deptName();
		
		Student student=new Student();
		student.studentName();
		student.studentDept();
		student.studentID();
	}

}
