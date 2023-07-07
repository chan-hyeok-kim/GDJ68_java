package com.iu.study5.s1;

public class S1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Warrior warrior = new Warrior();
		warrior.getItem();
		Magician magician = new Magician();
		magician.getItem();
		
		warrior.attack();
		
//		warrior.axe.name
		Character character = magician;
//		위에서 매지션 객체가 먼저 만들어졌기에
//		매지션의 mp항목은 있지만 접근이 불가.
		character = warrior;
		
		Character[] w = new Character[2];
		w[0] = warrior;
		w[1] = magician;
//		다형성
//		: 데이터타입(클래스)끼리의 형변환
			
		warrior = (Warrior)w[0];
		magician = (Magician)w[1];
//		모든 캐릭터가 워리어는 아니고, 
//		모든 캐릭터가 매지션은 아니기에 형변환이 필요
		
//		magician클래스만 mp가능
//		형변환을 해도 character에서는 mp사용 안됨.
//		매지션의 hp,damage,level까지만 담긴 주소만을 소유하고 있음
		
//		---------------------------------------
		
		Character ch1 = new Character(); 
		magician = (Magician)ch1;
		magician.setMp(20);
			
		//생성된 객체에 mp항목 자체가 없기 때문에 setmp해도 오류가 나옴
	
		
		

	}

}
