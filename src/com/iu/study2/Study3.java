package com.iu.study2;

public class Study3 {

	public static void main(String[] args) {
		//if, if-else, if-else if-else
        //switch() case
		
		int num = 5;
		
		switch(num*2) {
		case 10:
			System.out.println("num 10");
			break;
		case 20:
			System.out.println("num 20");
			break;
		default: //10도 20도 아닌 값들
			System.out.println("num 모름");
			//마지막은 break안 써도 됨
		}
		
		
		//위 switch문을 if else if문으로 바꾸면
		
		if(num*2==10) {
			
		}else if(num*2==20) {
			
		}else {
	}
		
	}
}
