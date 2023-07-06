package com.iu.study4.s3;

public class Test {
	
	int num1;
	double num2;
	
	public void hap(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	public void hap(int n1, float n2) {
		System.out.println(n1+n2);
	}
	
	public void hap(int n1, int n2, int n3) {
		
	}
	
	public void hap(int num1) {
		System.out.println(this.num1+num1);  
		//위에 num1은 힙영역 생성
		//이 매개변수 선언은 스택 영역
		//따라서 중복선언 아님
		//구별하려면 this사용
	} 
	

	public boolean same(Test t) {
		//num1과 다른 객체의 num1이 같고
		//num2와 다른 객체의 num2가 같으면 true 리턴,
		//아니면 false 리턴
	    boolean result=false;
		
	    result=(t.num1==num1 && t.num2==this.num2)? true : false;
	                    //이런 식으로 this를 사용할 수도 있다
		return result;
		
	}
	
	public void method1() {
		//참조변수명.멤버변수명
		System.out.println(this.num1+num2);
		//this->참조변수
		//보통 this는 num2처럼 생략되어 있다
		//생략할 수 없는 상황도 있다
		System.out.println(this);
	    method2();	
	}
	
	public void method2() {
		System.out.println("method2");
	}

	
	
}
