package com.iu.study3;

import java.util.Random;

public class Array5 {

	public static void main(String[] args) {
		int[] nums = new int[6];     
		Random random = new Random();
		
		//중복 제거
		for(int i=0; i<nums.length; i++) {
			nums[i]=random.nextInt(45)+1;  //로또 번호 
			for(int j=0; j<i; j++) {
				if(nums[i]==nums[j]) {
					i--;	
					
					//i=0일 때 비교 X
					//i=1일 때 0, 1 비교
					//i=2일 때 0, 1, 2 비교
					//i=3일 떄 0, 1, 2, 3 비교
				}
			}	
		}
		//인덱스가 0번일 때 비교 X, 1번일 때 1번 비교. 2번일때 2번비교
		//위의 거랑 똑같은 문제
		int num = 0;
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<i; j++) {
			    if(nums[i]<nums[j]) {
			     	num = nums[i];
			     	nums[i] = nums[j];
			    	nums[j] = num;
			    }
			}
		}
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
			
		}
		
		
		
		

	}

}
