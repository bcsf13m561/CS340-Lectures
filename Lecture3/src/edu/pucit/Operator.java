package edu.pucit;

public class Operator {
	
	public static boolean isPass(int marks){
		if(marks > 40){
			return true;
		}else{
			return false;
		}
	}
	
	public static int countPassStudent(int[] studentMarks){
		int passedStudents = 0;
		for(int marks : studentMarks){
			if(isPass(marks)){
				passedStudents++;
			}
		}
		return passedStudents;
	}

	public static void main(String[] args) {
		
		int[] marks = new int[]{23, 44, 99, 67, 23, 49, 22, 88, 89, 21, 33};
		
		int passed = countPassStudent(marks);
		
		System.out.println(String.format("%d students passed out of %d", passed, marks.length));
		
		

	}

}
