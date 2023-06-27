package com.iu.study2;

import java.util.Scanner;

public class Condition1 {

	public static void main(String[] args) {
		//if(조건식){조건식이 true일때만 실행}
		
		//국어, 영어, 수학 입력
		//총점과 평균 계산
		//단일 if를 사용해서 평균이 90점 이상이면 A
		//80점 이상이면 B, 70점 이상이면 C, 60점
		//이상이면 D, 나머지는 F 출력
		Scanner sc1 = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요");
		int kor = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("영어 점수를 입력하세요");
		int eng = sc2.nextInt();
		Scanner sc3 = new Scanner(System.in);
		System.out.println("수학 점수를 입력하세요");
		int mat = sc3.nextInt();
		
		int sum = kor+eng+mat;
		int avg = sum/3;
		if(avg>=90) {
			System.out.println("학점은 A입니다");
		}if(avg>=80 && avg<90) {
			System.out.println("학점은 B입니다");
		}if(avg>=70 && avg<80) {
			System.out.println("학점은 C입니다");
		}if(avg>=60 && avg<70) {
			System.out.println("학점은 D입니다");
		}if(avg<60) {
	    System.out.println("학점은 F입니다");
		}
		
		//
	
		String grade="F";
		if(avg>=90) {
			grade="A";
		}if(avg>=80 && avg<90) {
			grade="B";
		}if(avg>=70 && avg<80) {
			grade="C";
		}if(avg>=60 && avg<70) {
			grade="D";
		}
		
		System.out.println(grade);
	
		
		
	}
}
