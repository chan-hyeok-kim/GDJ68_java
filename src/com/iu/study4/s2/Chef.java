package com.iu.study4.s2;

public class Chef {
	
	String name;
	
	public void makeRamyun2(Ramyun[] ramyuns2) {
		for(int i=0; i<ramyuns2.length; i++) {
			Ramyun ramyun = new Ramyun();
			ramyun.title = "진라면";
			ramyun.price = 3000;
			ramyuns2[i] = ramyun;
			
		    //메인에서 만든 주소에 담았기 때문에 리턴해주지 않아도 된다
		  
		    
		}
	}
	
	public Ramyun[] makeRamyun(int count) {
		
//		Ramyun ramyun = new Ramyun();
//		Ramyun ramyun2 = new Ramyun();
//		ramyun2 = ramyun;
//		ramyun2 = new Ramyun(); 이렇게 새로운 객체를 생성할 수도 있다
	 
		Ramyun[] ramyuns = new Ramyun[count];
		
		for(int i=0; i<count; i++) {
			Ramyun ramyun = new Ramyun();
			ramyun.title = "진라면";
			ramyun.price = 3000;
			
			ramyuns[i] = ramyun;	
		}
		//  다른 방법
//   		ramyuns[i] = ramyun;
//	        ramyuns[i].title = "진라면";
//		    ramyuns[i].price = 3000; 이렇게 할 수도 있고
		    
//	     	ramyuns[i] = ramyun;	
//		    ramyun.title = "진라면";
//		    ramyun.price = 3000;  이렇게 해도 된다
		
		return ramyuns;	
		
	}
	
	public void makeKimbap() {
		
	}

}
