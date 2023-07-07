package com.iu.study5.s2;

public class Customer {

	private int money;
	private int point;
	
	public Customer() {
		this.money = 1000;
		this.point = 50;
	}
	
	public void buy(Product product) {
		money -= product.getPrice();
		point += product.getPoint();
		System.out.println(money);
		System.out.println(point);
	}
	
	public void buy(Product[] products) {
		for(int i=0; i<products.length; i++) {
//		   money -= products[i].getPrice();
//		   point += products[i].getPoint();
//		   System.out.println(money);
//		   System.out.println(point);
			buy(products[i]);
		}
	}
}
