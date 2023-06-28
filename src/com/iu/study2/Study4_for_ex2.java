package com.iu.study2;

import java.util.Scanner;

public class Study4_for_ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		boolean log= false;
		int pay = 1000000;
		//로그인 시도 최대 5번까지
		
		for(int i=0; i<5; i++) {
		System.out.println("id를 입력하세요");
		int id1= sc.nextInt();
		System.out.println("password를 입력하세요");
		int pw1= sc.nextInt();	
		
//     msg = (id==id1 && pw==pw1) ? "로그인 성공" : "로그인 실패";	
//        System.out.println(msg);
//        if(msg.equals("로그인 성공")) 
//			break;
//		}
//		
		
//		위는 삼항연산자로 풀이
//		아래는 if문으로 풀이
		
        if(id==id1 && pw==pw1) {
		   System.out.println("로그인 성공");
		   log=true; //log=!log라고 해도 됨
		   i=4; // break;라고 해도 됨
	    }else {
		   System.out.println("로그인 실패");
		    }
		}
		
		//로그인 성공시 급여계산 출력
		if(log) {
			System.out.println("급여 : "+pay);
		}
		
	    
		
		System.out.println("프로그램을 종료합니다");
	}

}
