package com.iu.study1;

public class Study3 {
	
	public static void main(String[] args) {
		
		//국어점수를 담을 변수
		//영어점수를 담을 변수
		//수학점수를 담을 변수
		int kor=0;
		int eng=0;
		int mat=0;
		
		//총점을 담을 변수
		int sum=kor+eng+mat;
		double avg=0;
		
		kor = 37;
		eng = 30;
		mat = 30;
		sum = kor+eng+mat;
		avg = (double)sum/3;
		
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		
		//자동형변환
		avg = (double)kor;
		avg = kor;
		
		//강제형변환
		eng = (int)avg;
		
		long n1 = 0L;
		float f1 = 0.0F;
		
		f1 = n1;
		n1 = (long)f1;
	//  long은 8byte, float은 4byte지만 
//		float을 더 크게 인식
		
		
		
//		String name = (String)avg; 
		String name = Double.toString(avg); 
		String name1 = Integer.toString(sum);
		
		
	}

}
