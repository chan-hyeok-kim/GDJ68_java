package com.iu.study4.s2;

public class Student {
	private String name;
	private int num;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	
	
	public int getTotal() {
		return total;
	}



	public void setTotal(int total) {
		this.total = total;
	}



	public double getAvg() {
		return avg;
	}



	public void setAvg(double avg) {
		this.avg = avg;
	}



	public String getName() {
		return name;
	}



	public int getEng() {
		return eng;
	}



	public void setEng(int eng) {
		this.eng = eng;
	}



	public int getMath() {
		return math;
	}



	public void setMath(int math) {
		this.math = math;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public int getKor() {
		return kor;
	}



	public void setKor(int kor) {
		this.kor = kor;
	}



	//메서드명 cal
	//해당 인스턴스의 total, avg 계산해서 대입
	public void cal() {
		total = kor+eng+math;
		avg = total/3.0;
	}

}
