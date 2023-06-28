package com.iu.study2;

import java.util.Scanner;

public class Study4_for {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			System.out.println("hello");
		}
		
		int j=567;
		for(j=3; j>0; j--) {
		
		}
		
		
		//---------
		Scanner sc =new Scanner(System.in);
		//hello 출력
		//키보드로부터 출력 횟수를 입력받음
		System.out.println("숫자를 입력하세요");
		
		for(int i=sc.nextInt(); i>0; i--) {
			System.out.println("Hello");
		}
		
	}
}
