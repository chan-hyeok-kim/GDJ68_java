package com.iu.study4.s4;

public class StudentView {
 
	public void view(Student[] students) {
		
		for(int i=0; i<students.length; i++) {
			System.out.println(students[i].name + " 학생의 정보는 다음과 같습니다");
			System.out.println("번호 : " + students[i].num);
			System.out.println("국어 점수 : " + students[i].kor);
			System.out.println("영어 점수 : " + students[i].eng);
			System.out.println("수학 점수 : " + students[i].math);
			System.out.println("총점 : " + students[i].total);
			System.out.println("평균 : " + students[i].avg);
		}
				
	}
}
