package com.iu.study4;

import java.util.Scanner;

public class RifleMain {

	public static void main(String[] args) {
		
		Rifle rifle = new Rifle();
		
		//멤버들 사용법
		//1. 멤버변수 변수명.멤버변수명
		//2. 멤버메서드 변수명.멤버메서드명()
		
		//메서드 호출
		Scanner sc = new Scanner(System.in);
		System.out.println("1.단발 2.점사");
		int select = sc.nextInt();
		System.out.println("총알 수 입력");
		int b = sc.nextInt();
		
		if(select==1) {
		   rifle.shoot1(b);
		   System.out.println(b);  //b는 여전히 30
		}else {
		   rifle.shoot2(1,"sss",null);
		}
		
	}

}


// 클래스가 실행되면 stack은 LIFO(late in first out)구조이기 때문에
// 나중에 적재된 메서드가 먼저 실행된다