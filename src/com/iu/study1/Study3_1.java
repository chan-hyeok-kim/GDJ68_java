package com.iu.study1;

public class Study3_1 {

	public static void main(String[] args) {
		int num1 = 17;
		double avg = (double)num1/2;
//		연산 시 큰 타입을 따라가기 때문에 
//		2는 double타입으로 자동 형변환됨 
		avg = num1/2.0;
		
		char ch='a';
		
		num1 = ch;
		
		num1 = 115;
		ch = (char)num1;
		
		ch = '1';
		num1 = ch;

		num1 = ch+1;
//		ch의 타입이 int로 변환
//		num1의 답은?
		
		
		System.out.println(avg);
		System.out.println(num1);
		System.out.println(ch);
		
		System.out.println(1+"1");
		System.out.println(1+"1"+'1');
		System.out.println(1+'1'+"1");
		System.out.println("1"+1+'1');
	}
}

/*
  전부 결과값이 어떻게 되는지 써보기
  
 */
 
