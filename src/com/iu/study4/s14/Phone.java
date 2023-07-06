package com.iu.study4.s14;

public class Phone {
	
	String company = "APPLE";
	String brand = "IPHONE15"; 
	//초기화 순서 1
	{
		//인스턴스 초기화 블럭 2
		this.company = "LG";
		this.brand = "가로본능";
	}
	
	public Phone() {
		this.company = "SAMSUNG";
		this.brand = "s20";
	}        // 생성자에서 초기화 3
	
	public void info() {
		System.out.println("Company : "+this.company);
		System.out.println("Brand : "+this.brand);
		
	}
}
