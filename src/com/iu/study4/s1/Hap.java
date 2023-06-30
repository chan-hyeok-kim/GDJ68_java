package com.iu.study4.s1;

public class Hap {

	public int h1(int num1, int num2) {
		int sum = num1 + num2;
		
		System.out.println(sum);
		return sum;
	}
	
	public boolean h2(int num) {
		//홀수면 true, 짝수면 false
		if(num%2!=0) {
			return true;
		}else {
			return false;
		}
	}
	
	public int[] h3(int count) {
		//count 수만큼 정수를 담을 배열을 만들어서 리턴
		int[] result = new int[count];
		return result;
//      return new int[count]; 로도 됨. 
//		대신 이 경우엔 주소값이 바로넘어가서 없음
	}
	
	
	
}
