package com.iu.study4.s5;

public class S5Main {

	public static void main(String[] args) {
		//static
        //1. 클래스 변수
		//객체를 생성하지 않고도 사용 가능
        //2. 선언
//		  클래스명.클래스변수명
		StaticTest.staticNum = 20;
//		  클래스명.메서드명
		StaticTest.staticMethod();
		
		MyCar.company = "KIA";
		
		MyCar myCar = new MyCar();
		myCar.brand = "A7";
		
		System.out.println(MyCar.company);
		System.out.println(myCar.brand);
		
		MyCar myCar2 = new MyCar();
		myCar.brand = "SL8";
		
		System.out.println(MyCar.company);
		System.out.println(myCar.brand);
	}
}
//static은 힙까지 가지 않고 메서드에서 만들어짐
//메모리 영역 3가지.
//메서드(클래스변수) - 스택(지역변수) - 힙(인스턴스변수) 순서
