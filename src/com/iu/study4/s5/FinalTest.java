package com.iu.study4.s5;

public final class FinalTest {  //상속 불가
	
	public static final int SIZE = 50;
	
	
	
	
	
	public final int MAX_NUM; //상수 - 한번 입력한 값은 변경이 불가
	                         //값을 주지 않으면 에러
	
//	{
//		this.num=20;
//	}
	
	public FinalTest() {
		this.MAX_NUM = 20;
	}
	
	
	public final void finalMethod() {  //오버라이딩 불가
		final int a = 10; //상수 - 한번 입력한 값은 변경 불가
	}

}
//Final로 시작하는 클래스 상속하지 말라는 개념
//메서드는 오버라이딩 불가