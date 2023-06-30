package com.iu.study3;

public class Array6 {

	public static void main(String[] args) {
		double [] ar = new double [3];
		ar[0] = 1.2;
		ar[1] = 3;
		
		int [] nums1 = new int[3];
		int [] nums2 = new int[3];
		System.out.println(nums1 == nums2); //주소값이므로 서로 다르다
		//객체가 다르단 뜻
		nums1=nums2;
		System.out.println(nums1 == nums2); //이제는 같음
		//
		
//		int [][] ars = new int [2][2];
		
		int [][] ars = {{1,2}, {2,4}};
		
		ars = new int[2][]; //가변 배열
		ars[0] = new int[3];
		ars[1] = new int[6];
		
		//2차원 배열의 기본 구조
		for(int i=0; i<ars.length; i++) {
			for(int j=0; j<ars[i].length; j++) {
				System.out.println(ars[i][j]);
			}
		}
		
		
	}

}
