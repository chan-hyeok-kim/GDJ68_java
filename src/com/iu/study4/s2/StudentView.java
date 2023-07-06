package com.iu.study4.s2;

public class StudentView {
	
	public void view(Student student) {
			System.out.println(student.getName());
			System.out.println(student.getNum());
			System.out.println(student.getAvg());
	}
 
	public void view(Student[] students) {
		
		for(int i=0; i<students.length; i++) {
//			System.out.println(students[i].name);
//			System.out.println(students[i].num);
//			System.out.println(students[i].avg);
			view(students[i]);
			System.out.println("==================");
			
//			Student student = students[i];
//			System.out.println(student.name); 이런 식으로도 가능
		}
			
					
	}
}
