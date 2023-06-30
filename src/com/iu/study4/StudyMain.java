package com.iu.study4;

public class StudyMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Card card = new Card();
		Card card2 = new Card();
		
//		System.out.println(card.cvc);
//		System.out.println(card.name);
//		
		
		Student s1 = new Student();
        s1.name = "채원";
        s1.gender = 'F';
        
        Student s2 = new Student();
        s2.name = "iu";
        s2.gender = 'F';
        
        //출력
        StudentView sv = new StudentView();
        sv.view(s1);
        
//        Student[] s3 = {s1, s2};
//        sv.viewAll(s3);
        
        Student[] students = new Student[2];
        students[0] = s1;
        students[1] = s2;
        sv.viewAll(students);
        
        
//        Student s2 = new Student();
//        s2.name = "iu";
//        
//        //클래스를 배열로
//        
//        Student[] students = new Student[3];
//        students[0] = s1;  //Student타입만 가능
//        students[1] = s2;
//      
//        System.out.println(students[2]);
//        
//        //레퍼런스는 기본값 null
//        System.out.println(students[2]);
//        //NullPointerException오류
//
//
//        
//        for(int i=0; i<students.length; i++) {
//        	System.out.println(students[i].name);
//        	System.out.println(students[i].id);
//        }
//        
//        Student s3 = null;
//        s3.name = "iu";
        //역시 NullPointerException오류 발생
        //변수를 쓰려면 객체부터 만들어야 함.
        
        
        
//        
//        s2 = s1;
//        
//        System.out.println(s2.name);  
        
        
                       //설령 값이 같아도 주소가 다르면 다르다
                       //동명이인의 학생이라 보면됨.
                         //배열에서 배운 거랑 같다.
                         //레퍼런스 타입(객체를 참조하는 타입)이기 때문에
		

		
		
		
		
		
		System.out.println("프로그램 종료");
	}

}
