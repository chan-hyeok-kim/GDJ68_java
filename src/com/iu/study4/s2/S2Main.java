package com.iu.study4.s2;

import java.util.Scanner;

public class S2Main {

	public static void main(String[] args) {
		//메인 메서드의 역할
		//1. 프로그램 실행
		//2. 테스트 용도
		
		//객체 생성
		//객체 생성하지 않고 했을 때 NullPointer예외
		
		//라면 예시
		Chef chef = new Chef();
		Ramyun[] ramyuns = chef.makeRamyun(3);
		//1. 손님 숫자만 알려주기
		
        Ramyun[] ramyuns2 = new Ramyun[2];
		chef.makeRamyun2(ramyuns2);
		
		//2. 쟁반 만들어서 보내기
		//애초부터 배열을 보낼 수도 있다(라면이 들어갈 공간(쟁반)만들고 보내기)
		
		
		StudentController studentController = new StudentController();
		studentController.start();
	    
	}

}


//StudentService sv = new StudentService();
//Student[] student = sv.makeStudents();
// 
//for(int i=0; i<student.length; i++) {
//System.out.println(student[i].avg);