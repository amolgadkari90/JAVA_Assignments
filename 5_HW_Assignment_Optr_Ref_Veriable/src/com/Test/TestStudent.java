package com.Test;

import com.student.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		System.out.println("Adress of s1 after initialization = "+s1);
		
		Student s2;
		//System.out.println("Adress of s2 before initialization = "+s2); 
		 /* Exception in thread "main" java.lang.Error: Unresolved compilation problem:
		  The local variable s2 may not have been initialized*/
		 s2 = s1;
		System.out.println("Adress of s2 after [s2 = s1] = "+s2); // s1 and s2 pointing to same heap
		
		Student s3;
		//System.out.println("Adress of s3 before initialization = "+s3); 
		s3 = new Student ();
		System.out.println("Adress of s3 after [s3 = new Student()] = "+s3); // s3 pointing to new heap
		
		s3 = s1;
		System.out.println("Adress of s3 after [s3 = s1] = "+s3); // s1 = s2 = s3 pointing to same heap

	}

}
