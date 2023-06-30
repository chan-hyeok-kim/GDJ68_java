package com.iu.study3;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] nums = {1,2,3,4,5};
		System.out.println("지울려고하는 idx번호를 입력하세요");
		int idx = sc.nextInt();
		int count = 0;
		
		
		for(int i=0; i<nums.length; i++) {
			if(i!=idx) {
			   nums[count]=nums[i];
			   count++;
		}
		}
		nums = new int[count];
		for(int i=0; i<count; i++) {
        System.out.println(nums[i]);
	}
		
		
		
		
		
	}
}
