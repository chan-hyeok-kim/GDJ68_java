package com.iu.study2;

import java.util.Scanner;

public class Study5_while_ex1 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int id = 1234;
        int pw = 5678;
        
        //while
        //1. 로그인 시도 2. 프로그램 종료
        boolean b = true;
        
        while(b) {
        	System.out.println("1. 로그인 시도 2.프로그램 종료");
            int log = sc.nextInt();
            
            switch(log) {
            case 1:
            	System.out.println("아이디 입력");
             	int id1=sc.nextInt();
            	System.out.println("패스워드 입력");
            	int pw1=sc.nextInt();
        	
        	    if(id==id1 && pw==pw1) {
        		System.out.println("로그인 성공");
        		b=!b;
        		break;
        	    } else {
        	    	continue;
        	    }
            case 2:
        	    System.out.println("프로그램 종료");
              	b=!b;
        	    break;
            }
        }//while끝
    
        //로그인 성공했을 때만 진행
        //MMORPG
        //시작레벨:1
        //모든 몬스터의 경험치 동일
        //최대레벨:15
        //처음 소지 GOLD : 0
        //5레벨 달성시: 1000GOLD 지급
        //10레벨 달성시: 2000GOLD 지급
        //15레벨 달성시: 3000GOLD 지급
        
        //1 -> 2 : 3마리 사냥
        //2 -> 3 : 6마리
        //3 -> 4 : 9마리 
        //...
        //14 -> 15 : 42마리
        //레벨업 시 계속 게임을 할지 종료할지 선택
        
        
        //현재레벨, 골드가 출력
        
        int gold = 0;
         
        for(int i=1; i<15;) {
        	 System.out.println("게임을 계속하시겠습니까? 1.진행 2.종료");
             int start = sc.nextInt(); 
             
             if(start==1) {
        	    for(int hunt=1; hunt<=3*i; hunt++) {
                   System.out.println(hunt+"마리 잡았습니다");
        	          if(3*i==hunt){
        	             System.out.println(i+1+"으로 레벨업하셨습니다");
        	             i++;
        	             if(i%5==0) {
        		            gold += 1000*(i/5);
        	             } 
        	             break;
        	          }
               }
             }else {
             break;
             }
             System.out.println("현재 레벨: "+i);
             System.out.println("현재 골드: "+gold);
             
        }
        System.out.println("프로그램 종료");
    }
}
	//종료시에 레벨 골드 출력되게끔 바꾸면 
    // i++이랑 골드출력 내부에 안넣어도 됨. break를 continue로 바꾸면 되니까


