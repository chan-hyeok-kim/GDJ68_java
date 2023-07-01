package com.iu.study4.s3;

public class StudentView {
 
	public void view(Student[] student) {
		
		for(int i=0; i<student.length; i++) {
			System.out.println(student[i].name);
			System.out.println(student[i].num);
			System.out.println(student[i].kor);
			System.out.println(student[i].eng);
			System.out.println(student[i].math);
			System.out.println(student[i].total);
			System.out.println(student[i].avg);
		}
			
					
	}
}
