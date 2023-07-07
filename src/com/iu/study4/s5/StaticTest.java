package com.iu.study4.s5;

public class StaticTest {
	
	public int instanceNum;
	
	public static int staticNum;

	public void instanceMethod() {
		StaticTest.staticNum = 50;
		instanceNum = 20;
		StaticTest.staticMethod();
		System.out.println("멤버메서드");
	}
	
	public static void staticMethod() {
		StaticTest.staticNum = 20;
		System.out.println("클래스메서드"); 
		
		//this.staticNum;  - 에러
		//객체를 만들지 않기 때문에 this쓸 수 없음
//		instanceNum = 20; - 에러
		//객체없음
//		instanceMethod(); - 에러
		//객체없음
		
//		일반 메서드는 무조건 힙 영역에서 객체 생성
//		static메서드는 객체 생성 x
//		System.out 도 클래스명.변수명 -> 클래스 변수
		
	}
}
