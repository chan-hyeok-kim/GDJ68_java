package com.iu.study3;

public class Array3 {

	public static void main(String[] args) {

		//만약 3칸짜리 배열을 4칸으로 늘리고 싶으면?
		//4칸에 3칸짜리를 복사한 후에 4칸째를 입력

		//반대로 4칸짜리를 2칸짜리로 하려면
		//2칸짜리에 복사
		
		int[] nums = {1,2,3,4};
		System.out.println(nums.length);
		
		int[] copyNums = new int[nums.length+1];
		
//		copyNums = nums;
//		
//		for(int i=0; i<nums.length; i++) {
//		System.out.println(copyNums[i]);
//		}
//		copyNums[4]=5;
//		System.out.println(copyNums[4]); 
		//이렇게하면 copyNums 갯수도 4가 됨. 주소를 가져와서 대입하는 거니까
		for(int i=0; i<nums.length; i++) {
			copyNums[i]=nums[i];		
	    }
		copyNums[nums.length]=5;
		nums=copyNums;
		
		//nums : 5칸
		//     : 
		copyNums = new int[nums.length-1];
		for(int i=0; i<copyNums.length; i++) {
			copyNums[i]=nums[i];
		}
		nums=copyNums;
		
	
		
        for(int i=0; i<nums.length; i++) {
        	System.out.println(nums[i]);
        }
		
		
	}

}
//자바는 가비지 콜렉터(GC)가 있어서 힙 영역에서 쓰던 
//참조변수가 끊어진 애들을 먼저 삭제함

