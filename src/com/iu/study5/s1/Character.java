package com.iu.study5.s1;

public abstract class Character { //객체만 생성못함
	//데이터타입은 선언할 수 있음
	private int hp;
	private int damage;
	private int level;
	
	
	
	public int getHp() {
		return hp;
	}



	public void setHp(int hp) {
		this.hp = hp;
	}



	public int getDamage() {
		return damage;
	}



	public void setDamage(int damage) {
		this.damage = damage;
	}



	public int getLevel() {
		return level;
	}



	public void setLevel(int level) {
		this.level = level;
	}



	public final void getItem() { //오버라이드하지마라
    	System.out.println("아이템 줍기");
	}
	
	public abstract void attack();
	//abstract미완성. 클래스도 같이 미완성됐으니 클래스명 앞에도 써줘야함
	//abstract가 붙은 클래스는 미완성이라서 무조건 상속해야함.
	//최하위의 자식 클래스에선 무조건 완성되어야함.

}
