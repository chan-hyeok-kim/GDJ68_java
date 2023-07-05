package com.iu.study4.s4;

import java.util.Scanner;

public class StudentController {

	
	public void start() {
		//1. 학생정보 생성-- makeStudents 호출
		//2. 학생정보 출력-- SV에서 출력
		
		//3. 프로그램 종료   
		
		//종료를 누를 때까지 반복. while문?
		
		Scanner sc =new Scanner(System.in);
	
		
		Student[] students= new Student[0];
		
		while(true) {
			System.out.println("다음 중 선택하세요 1.생성 2.출력 3.종료");
			int btn = sc.nextInt();
			
		        if(btn==1) {
		        	 StudentService ss = new StudentService();
		        	 Student[] student = ss.makeStudents();
		        	 students = student;
		       }else if(btn==2) {
		        	 StudentView sv = new StudentView();
		    	     sv.view(students);
		       }else {
		    	     break;
		       }
			
		}
		
		
	
	}
	
}
