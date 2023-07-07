package com.iu.study5.s2;

public class S2Main {
	
	public static void main(String[] args){
		Computer computer = new Computer();
		computer.setCompany("SAMSUNG");
		computer.setModelName("갤럭시노트");
		computer.setCpu("i9");
		computer.setColor("WHITE");
		computer.setPrice(50);
		computer.setPoint(30);
		
		Tv tv = new Tv();
		tv.setCompany("LG");
		tv.setModelName("OLED-A");
		tv.setInch(48);
		tv.setColor("BLUE");
		tv.setPrice(100);
		tv.setPoint(40);
		
		Phone phone = new Phone();
		phone.setCompany("APPLE");
		phone.setModelName("IPHONE3");
		phone.setOs("IOS");
		phone.setColor("BLACK");
		phone.setPrice(10);
		phone.setPoint(20);
		
		Customer winter = new Customer();
		
		winter.buy(computer);
		
		//2개 
		Product[] products = new Product[2];
		products[0]=computer;
		products[1]=phone;
		winter.buy(products);
	
		
	}
}
