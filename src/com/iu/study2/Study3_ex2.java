package com.iu.study2;

import java.util.Scanner;

public class Study3_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//회원가입 시 입력한 Data
		int id=1234;
		int pw=5678;
		
		System.out.println("아이디를 입력하세요");
		int id1= sc.nextInt();
		System.out.println("비밀번호를 입력하세요");
		int pw1= sc.nextInt();
		
		String msg ="";
		//로그인 과정
		//ID와 PW를 입력받아서 로그인 처리
		//로그인 성공 메세지, 로그인 실패
		
		msg= (id==id1 && pw==pw1) ? "로그인 성공" : "로그인 실패";
		  System.out.println(msg);
		
		  if(msg.equals("로그인 성공")) {
		    System.out.println("다음 중 선택하세요 1. 정규직 2. 계약직");
			int job = sc.nextInt();
		
			System.out.println("급여를 입력하세요");
			int pay = sc.nextInt();
			
			switch(job) {
	        case 1:
				pay*=0.93;
				System.out.println("실급여는 "+pay+"입니다");
				break;
			case 2:
				pay*=0.967;
				System.out.println("실급여는 "+pay+"입니다");
				break;
		    default:
		    	System.out.println("잘못 눌렀습니다");
		   
			}
//			System.out.println("실급여는 "+pay+"입니다"); 
//			밖으로 빼고 싶으면 if괄호안을 false로 만드는 조건을 default에 넣으면 됨.
//			이후 조금 추가할 것도 있긴 함
		}
		
		//--- 로그인 처리 후 작성
		//로그인이 성공한 사람만 실행 가능
	    //1. 정규직, 2. 계약직 
		//급여 입력
		//정규직 : 건강보험 3%, 국민연금 2%, 고용보험 1%, 산재보험 1%
	    //계약직 : 원천징수 3.3%
	    //실급여 출력
		 System.out.println("프로그램이 종료");
	}
}
