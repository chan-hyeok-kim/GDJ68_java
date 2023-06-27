package com.iu.study1;

public class Study_ex1 {
   
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		//자기정보를 변수에 담아서 출력
		//이름, 나이, 키, 전화번호, 혈액형, 졸업학점
		String name = "김찬혁";
		int age = 29;
		double height = 174.0;
		String tel = "010-4534-6117";
		//0으로 시작하면 16진수로 
		//인식하기 때문에 long으로도 전화번호 표시 안됨
		char bloodtype = 'O';
		double score = 3.7;
		
	    System.out.println("당신의 이름은 "+name+"입니다.");
	    System.out.println("나이는 "+age+"살입니다.");
	    System.out.println("키는 "+height+"cm입니다.");
	    System.out.println("전화번호는 "+tel+"입니다.");
	    System.out.println("혈액형은 "+bloodtype+"형입니다.");
	    System.out.println("졸업학점은 "+score+"입니다.");

		System.out.println("프로그램 종료");
	}
}
