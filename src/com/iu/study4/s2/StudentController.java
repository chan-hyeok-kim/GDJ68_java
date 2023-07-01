package com.iu.study4.s2;

import java.util.Scanner;

public class StudentController {

	
	public void start() {
		//1. 학생정보 생성-- makeStudents 호출
		//2. 학생정보 출력-- SV에서 출력
		//3. 프로그램 종료   
		
		//종료를 누를 때까지 반복. while문?
		int select = 0;
		int count = 0;
	    Student[] students = new Student[count];
		
		while(true){
		Scanner sc = new Scanner(System.in);
		System.out.println("1.생성 2.출력 3.종료");
		select = sc.nextInt();
			
		StudentService ss = new StudentService();
		 
		  if(select==1) {	
	         Student[] student = ss.makeStudents();
	         students = student;
	         
		  }else if(select==2){
			  StudentView sv = new StudentView();
		      sv.view(students);
	      }else {
			  System.out.println("프로그램을 종료합니다");
			  break;
		  }
		}
	
	}
	
}
