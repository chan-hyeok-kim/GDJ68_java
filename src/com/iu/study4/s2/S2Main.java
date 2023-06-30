package com.iu.study4.s2;

public class S2Main {

	public static void main(String[] args) {
		
		StudentService sv = new StudentService();
	    Student[] student = sv.makeStudents();
		 
	    for(int i=0; i<student.length; i++) {
	    System.out.println(student[i].avg);
	    }
	}

}
