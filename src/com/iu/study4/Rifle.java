package com.iu.study4;

public class Rifle {

	boolean mod; //true면 단발, false면 점사
	
	//메서드 선언 공식
	// 접근지정자 [그외지정자] 리턴타입 메서드명([매개변수들 선언]){실행 코드}
	// []는 옵션. 써도 되고 안 써도 됨
	// public static void main(String[] args){}
	
	public void shoot1(int count) {  //int count도 지역변수
		      //갈색은 지역변수, 파란색은 멤버(인스턴스)변수다
		int damage = 20;   //지역변수는 {}지나는 순간
		                   //stack영역에서 소멸(다른 곳에서 못 씀)
		for(int i=0; i<count; i++) {
		    System.out.println("탕");
		    
		}
		count=10; 
	} 
  	
    //shoot2
	
	public void shoot2(int c, String n, int[] ar) {
		System.out.println("타타탕");
	}
	
	
}
