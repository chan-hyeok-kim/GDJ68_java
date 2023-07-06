package com.iu.study4.s3;

import java.util.Scanner;

public class S3Main {

	public static void main(String[] args) {
		
//		Test test1 = new Test(); //레퍼런스 변수이기 때문에 초기값 자동
//		test1.num1 = 2;
//		test1.num2 = 1.2;
//		test1.method1();
//		System.out.println(test1);
//		
//		Test test2 = new Test();
//		test2.num1 = 2;
//		test2.num2 = 1.2;
//		test2.method1();
//		System.out.println(test2);
//		
//		System.out.println(test1.same(test2));
//		
		Test test = new Test(); 
//		      -> Test()는 대문자로 시작하지만 클래스가 아니라 메서드다
//		                     생성자(Constructor)라고 함
		
//		test.hap(10, 2.1F);
		
		//오버로딩.
		//필요성: 매개변수 타입이나 갯수가 다를 경우,  
        //		 일일이 메서드를 작성해줘야 함.
		//편하게 같은 이름으로 쓸 수 있는 메서드가 필요해짐
		//그것이 오버로딩
		//hap메서드만 알고 있으면 타입이나 갯수가 달라도 편하게 계산 가능
		//리턴이 달라도됨
		
		//-------------------------------------
		Car car = new Car();
//		car.company = "AUDI";
//		car.brand = "A7";
//		car.color = "SKYBLUE";
//		car.price = 4;
		car.info();
		
		Car car2 = new Car("S8");
		car2.info();
		
		Car car3 = new Car("SL2", "BLACK");
		car3.info();
		
		Car car4 = new Car("Q8", "GREEN", 50000);
		car4.info();
		
		
		Scanner sc = new Scanner(System.in);
		// Scanner()처럼 기본 생성자를 아예 안 만드는 경우도 있다
		//
		
		
		
	}

}
