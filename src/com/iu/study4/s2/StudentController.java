package com.iu.study4.s2;

import java.util.Scanner;

public class StudentController {

	
	public void start() {
		//1. 학생정보 생성-- makeStudents 호출
		//2. 학생정보 출력-- SV에서 출력
		//3. 프로그램 종료   
		
		//종료를 누를 때까지 반복. while문?
		Scanner sc = new Scanner(System.in);
		int select = 0;
		StudentService studentService = new StudentService();
		StudentView studentView = new StudentView();
	    Student[] students = new Student[0];
	    //강사님은 new Student 대신에 null넣으셨음
	    
	    do
		{
			
		System.out.println("1.생성 2.출력 3.정보 검색 4.종료");
		select = sc.nextInt();
			
		  if(select==1) {	
	          students = studentService.makeStudents();     
		  }else if(select==2){
		      studentView.view(students);
	      }else if(select==3){
	          studentView.view(studentService.findByNum(students));
	      }else{
			  System.out.println("프로그램을 종료합니다");
			  break;
		  }
		}while(true);  //do-while문 한번은 무조건 실행
	
	}
	
}
