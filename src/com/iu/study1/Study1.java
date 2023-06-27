package com.iu.study1;

public class Study1 {

	public static void main(String[] args) {
		System.out.println("Program Start");
        
		//변하는 Data => 변수 <=>상수
		//변수 선언
		//데이터타입명 변수명;
		byte num1;
		short num2;
		int num3;
		long num4;
		
		//변수에 Data를 대입
		num1 = 3;
		num2 = 130;
		num3 = 200000000;
		num4 = 30000000000L;
		
		//초기화
		//변수를 선언하고 최초로 값을 대입하는 것
		num1=5;
		int num5=20;
		
		int num6;
		
		//변수는 초기화하지 않고 사용이 불가
//		System.out.println(num6);
	 
		float f1 = 3.2F;
		double d1 = 3.2;
		
	    //문자는 한글자만 가능
		char ch = '한';
		//오라클에선 ''를 문자열과 날짜에 썼음
		
		//논리
		boolean check=true;//false
		
		//위 8가지가 primitive type
		//아래부터는 reference(참조타입)
		
		//문자열
		String name="winter";
	    	
		
		System.out.println("Program Finish");
	}
}
