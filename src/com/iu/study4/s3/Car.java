package com.iu.study4.s3;

public class Car {
	String company;
	String brand;
	public String color;
	int price;
	
	//생성자(constructor)
	//1. 선언 방법
	//접근지정자 클래스명과 동일한 이름([매개변수들 선언]){}
	//생성자는 메서드지만 (그외지정자), (리턴타입)이 없다
	public Car() {
		//2. 매개변수가 없는 생성자: 기본생성자
		//따로 생성자를 만들어주지 않으면 컴파일러가 구성하는 형태
		//3. new연산자와 같이 쓰임 
		//4. 생성자의 첫줄에만 사용 가능
		this("A7");
//	생성자 내에서 다른 생성자를 호출하려면 this()으로 해야 함
		System.out.println("자동차를 만듭니다");
		

//		company = "AUDI";
//		brand = "A7";
//		color = "SKYBLUE";
//		price = 9985;
	}
	
	public Car(String brand) {
		this(brand, "SKYBLUE");
//		company = "AUDI";
//	    this.brand = brand;
//	    color = "SKYBLUE";
//	    price = 9985;
	}
	
	public Car(String brand, String color) {
		this(brand, color, 9985);
//	    company = "AUDI";
//	    this.brand = brand;
//	    this.color = color;
//	    price = 9985;
	}
	
	public Car(String brand, String color, int price) {
		company = "AUDI";
	    this.brand = brand;
	    this.color = color;
	    this.price = price;
	    
	}
	
	
	
	public void info() {
		System.out.println("Company : "+company);
		System.out.println("Brand : "+brand);
		System.out.println("Color : "+color);
		System.out.println("Price : "+price+"만원");
	}

}
