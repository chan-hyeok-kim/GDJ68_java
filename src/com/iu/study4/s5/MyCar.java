package com.iu.study4.s5;

public class MyCar {

	public static String company;
	public String brand;
	
	{} //객체 생성시
	public MyCar() {}//객체 생성시
	//setter : 객체 생성 후
	//static은 객체 없으므로 다른 초기화 방법 씀
	static{
		MyCar.company = "AUDI";
	}
     	
	
	
}
