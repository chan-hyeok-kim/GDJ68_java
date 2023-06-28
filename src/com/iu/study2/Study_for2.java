package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study_for2 {

	public static void main(String[] args) {
 		Random random = new Random();
        Scanner sc = new Scanner(System.in);
// 		for(int dan=2; dan<10; dan++) {
// 	      	for(int i=1; i<10; i++) {
// 			System.out.println(dan+"*"+i+"="+dan*i);
// 			}
// 		}         ->구구단
 		
        //종료할 분, 초를 입력받아서 
        //해당 분초가 되면 종료
        System.out.println("분을 입력하세요");
        int min1= sc.nextInt();
        System.out.println("초를 입력하세요");
        int sec1= sc.nextInt();
        
 		for(int min=0; min<6; min++) {
 			for(int sec=0; sec<60; sec++) {
 				System.out.println(min+":"+sec);
 				
 				if(min1==min && sec1==sec) {
 	 			  min=6;
 	 			  sec=60;
 	 			}
 			}
 			
 		}
 		
 		
 		
 		
 		
// 		for(int i=0; i<5; i++) {
//			int num=random.nextInt(3); //0~3 미만의 정수 한개를 랜덤
//			
//			switch(num) {
//			case 0:
//				System.out.println(num);
//				i=5;
//			    break;       //반복문 내에 break 있어도 스위치문이 있으면 스위치문만 벗어남
//			    // 따라서 반복문을 종료시키려면 break대신에 i=5붙이면 됨
//			case 1:
//				System.out.println(num);
//		    default:
//		    	System.out.println(num);
//			}
//		}
 		System.out.println("프로그램 종료");

	}

}
