package com.iu.study4.s4;

public class Product {

	public String name;
	public int price;
	
	public void setPrice(int price){
		if(price<1) {
			this.price = 1000;
		}
		this.price = price;
	}
	//메서드명이 
	// set으로 시작 -> 값을 집어넣음
	// get으로 시작 -> 값을 가져옴
	public int getPrice() {
		if(price<1) {
			this.price = 1000;
		}
		return this.price;
	}
	
	
	public void info() {
		System.out.println(this.name);
		System.out.println(this.price);
	
	}
	
}
