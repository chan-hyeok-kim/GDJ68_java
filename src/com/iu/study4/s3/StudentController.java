package com.iu.study4.s3;

import java.util.Scanner;

public class StudentController {

	
	public void start() {
		//1. 학생정보 생성-- makeStudents 호출
		//2. 학생정보 출력-- SV에서 출력
		
		//3. 프로그램 종료   
		
		//종료를 누를 때까지 반복. while문?
		int select = 0;
		
		boolean btn = true;
	
		
		while(true){
		Scanner sc = new Scanner(System.in);
		System.out.println("1.생성 2.출력 3.종료");
		select = sc.nextInt();
			
		System.out.println("학생 수 입력");
		int count = sc.nextInt();
		StudentService ss = new StudentService();
             
//		switch(select) {
//		
//		    case 1:
//			    Student[] student = new Student[count];
//			    student = ss.makeStudents();
//			    break;
//		    case 2:	
//			    StudentView sv = new StudentView();
//	            sv.view(student);
//	            break;
//		   default:
//			    btn = !btn;
//			    break;
//			
//		
//		
//		}
		  Student[] students = new Student[count];
		
		  if(select==1) {	
			  
	         Student[] student = ss.makeStudents(count);
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
