package com.iu.study2;

import java.util.Scanner;

public class Study3_ex1 {

	public static void main(String[] args) {
		//국어, 영어 ,수학 입력
		//총점 평균 계산(평균은 int)
		//90:A, 80:B, 70:C, 60:D, 그외:F
		//switch사용
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("국어 점수 입력");
	    int	kor= sc1.nextInt();
	    Scanner sc2 = new Scanner(System.in);
	    System.out.println("영어 점수 입력");
	    int	eng= sc2.nextInt();
	    Scanner sc3 = new Scanner(System.in);
	    System.out.println("수학 점수 입력");
	    int	mat= sc3.nextInt();
		
		int sum= kor+eng+mat;
		int avg= sum/3;
		String grade="F";

		switch(avg/10) {
		case 10:
			grade="A";
			break;
		case 9:
			grade="A";
			break;
		case 8:
			grade="B";
			break;
		case 7:
			grade="C";
			break;
		case 6:	
			grade="D";
		}
		System.out.println(grade);
	}

}
