package com.iu.study4.s2;

import java.util.Scanner;

public class StudentService {
	
	public Student findByNum(Student[] students) {
		Scanner sc = new Scanner(System.in);
		System.out.println("찾을려는 학생의 번호를 입력하세요.");
		int num = sc.nextInt();
		Student student = new Student();
		
		for(int i=0; i<students.length; i++) {
  	      if(students[i].getNum()==num) {
  	    	 student = students[i];
  	      }
  	  }
		return student;
	}
	

	public Student[] makeStudents() { //Student[]
		//학생수 입력
		//학생수만큼 학생들이 만들어짐 
		//이름, 번호, 국어, 영어, 수학 점수 입력
		//총점, 평균 계산 
		//학생들을 리턴
		
		//1. 학생 배열을 생성
		//2. 학생수만큼 반복문 실행
		//3. 반복문 내에서 이름, 번호, 국어, 영어, 수학 입력 총점 평균
		//4. 해당 학생을 배열에 대입
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수 입력");
		int count = sc.nextInt();
		
		Student[] students = new Student[count];
		
		for(int i=0; i<count; i++) {
		 Student student = new Student();
		 System.out.println("이름을 입력");
		 student.setName(sc.next()); 
		 System.out.println("번호를 입력");
		 student.setNum(sc.nextInt());
		 System.out.println("국어 점수를 입력");
		 student.setKor(sc.nextInt());
		 System.out.println("영어 점수를 입력");
		 student.setEng(sc.nextInt());
	     System.out.println("수학 점수를 입력");
	     student.setMath(sc.nextInt());
	     student.cal();
	                             //3.0으로 넣어야만 오류가 안날 것임
	     students[i]=student;
	     
	     
		}
		return students;
					
	}
}
