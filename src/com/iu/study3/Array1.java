package com.iu.study3;

public class Array1 {

	public static void main(String[] args) {
		// 배열(array)
		int num = 0; 
		int num2 = 2;
		double d = 3.12;
		
		//모으려고하는 데이터타입 [] 변수명 = new 모으려고하는 데이터타입[갯수];
		//갯수 = 인덱스+1
        //new연산자 뜻: heap영역에 객체를 만드세요
		
		int [] nums = new int [2];	
		double [] avgs = new double[3];
		char [] chs = new char[3];
		boolean [] checks = new boolean[3];
		
		System.out.println(num);
		System.out.println(nums);

		//배열 사용 : 배열의 변수명[인덱스번호], index번호는 정수타입(int)
		System.out.println(nums[0]);
		System.out.println(avgs[0]);
		System.out.println(chs[0]);
		System.out.println(checks[0]);

		
		//문자열 3개를 모을 배열 선언
		String [] str = new String[3];
		System.out.println(str);
		System.out.println(str[0]);  
		//String을 비롯한 참조타입의 초기값은 null
		
		
		int [] nums2 = {1,2,3};
		
		int nums3 [] = new int [3];
		nums = nums2;  //변수값이 아니라 주소값을 대입하는 것
		               //nums2의 주소값이 nums에 대입됨
	}

}
