package com.iu.study5.s1;

public class Magician extends Character {
	
	private int mp;
	
	public int getMp() {
		return mp;
	}
	
	public Magician() {
		super(); //부모의 생성자 호출
		//부모의 생성자는 상속받지 못하기 때문에 필요
		//부모 객체를 토대로 자신의 객체도 생성하므로 주소는 동일
		//첫줄에 쓰이므로 this랑 같이 못 씀
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	//overriding : 수정
	//상속받은 메서드의 내용을 자기에 맞게 재정의
	//상속받은 메서드의 선언부는 동일
	public void attack() {
		System.out.println("파이어볼");
	}


}
