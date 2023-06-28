package com.iu.study2;

import java.util.Scanner;

public class Study4_for2_ex1 {

	public static void main(String[] args) {
		
		//FPS
		//30발, 3탄창
		//M16, 2가지: 단발, 3점사
		
		//1. 단발, 2. 점사
		//탕, 타타탕
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0; i<3; i++) {
			System.out.println("사격 방법 1. 단발 2. 점사");
			int shot = sc.nextInt();
			
		    if(shot==1) {
		    	System.out.println("탄알이 장전되었습니다");
		        for(int j=0; j<30; j++) {
		        System.out.println("탕");
		       } 
		        System.out.println("탄알이 없습니다");
		    
		    }else if(shot==2){
		    	System.out.println("탄알이 장전되었습니다");
	            for(int x=0; x<30; x+=3) {
	    	    System.out.println("타타탕");
               }
	            System.out.println("탄알이 없습니다");
		    
		    }else {
                System.out.println("잘못 눌렀습니다");
                i=3;  // i=3쓰면 아래 출력문(for문의 {})까지는 출력되고 종료됨
            }
		    
		  }
//		  System.out.println("탄창이 없습니다");

//		  for문 따로 빼기, 내용 줄이기

		for(int i=0; i<3; i++) {
			System.out.println("사격 방법 1. 단발 2. 점사");
			int shot = sc.nextInt();
			int count = 10;
			String sound = "타타탕";
			
		    if(shot==1) {
		    	sound="탕";
		        count=30;
//		    }else {
//		    	sound="탕";
//		    	count=10;
//		    }
		    for(int j=0; j<count; j++) {
		    	System.out.println(sound);
		    }
		
		}
	}
}
}

