package com.iu.study1;

import java.util.Scanner;

public class Study_ex2 {

	public static void main(String[] args) {
		System.out.println("start");
		Scanner sc = new Scanner(System.in);
		
		//입력  출력
		//1    1
		//5    11
		//6    12
		//8    20
		//9    21
		//10   22
		//16   40     
		System.out.println("입력하세요 ");
		int input= sc.nextInt();
		int output= (input/4)*10+(input%4);
		int output2= (input/4)*6+input;
		
		System.out.println("Input : "+input+", Output : "+output);
		System.out.println("Input : "+input+", Output2 : "+output2);
		System.out.println("finish");
	}

}
