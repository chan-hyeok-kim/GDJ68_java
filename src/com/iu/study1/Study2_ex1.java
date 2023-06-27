package com.iu.study1;

public class Study2_ex1 {

	public static void main(String[] args) {
		System.out.println("start");
//		int n = 1623;
//		int result = n%1000;
		
//		System.out.println("Result : "+result);
		
		//물건의합계값
		int value=35240;
		
		//손님이 낸돈
		int don=50000;
		
		//잔돈 계산
		int jandon=don-value;//14760
		
		//
		int man=0;
		int cheon=0;
		int back=0;
		int sib=0;
		
		man = jandon/10000;
		cheon = jandon%10000/1000;
		back = jandon%1000/100;
		sib = jandon%100/10;
	
		System.out.println("만원 : "+man+" 장");
		System.out.println("천원 : "+cheon+" 장");
		System.out.println("백원 : "+back+" 개");
		System.out.println("십원 : "+sib+" 개");
		System.out.println("Finish");
	}
}
