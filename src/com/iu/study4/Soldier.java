package com.iu.study4;

import com.sun.tools.javac.Main;

public class Soldier {
	
	String grade; //계급
	int num;
//	Rifle rifle; //클래스는 데이터타입이기도 하므로 가능
	int [] ar;
	
	public void attack(int count) {
		Rifle rifle = new Rifle();
		rifle.shoot1(count);
		
	}
	
  
}
