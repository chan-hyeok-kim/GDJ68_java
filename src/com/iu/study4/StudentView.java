package com.iu.study4;

public class StudentView {
	
	//Student 정보를 출력
	//view

 	public void view(Student student) {
		
		System.out.println(student.name);
		System.out.println(student.gender);
	}

 	//viewAll
 	//모든 student 정보를 출력
 	//단, viewAll의 매개변수 딱 한개만 선언
 	
 	public void viewAll(Student[] student) {
 		for(int i=0; i<student.length; i++) {
 		System.out.println(student[i].name);
 		System.out.println(student[i].gender);
 		}
 	}
 	
}
