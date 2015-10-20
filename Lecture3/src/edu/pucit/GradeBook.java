package edu.pucit;

/**
 * this calculates grades of students
 * @author aamirlatif
 *
 */


public class GradeBook {
	
	public static final int PASSING_CRITERIA = 50;
	
	/**
	 * 
	 * @param marks
	 * @return
	 */
	public static boolean isPass(int marks){
		/*
		 * 
		 */
		if(marks >= PASSING_CRITERIA){
			return true;
		}else{
			return false;
		}
	}
	
	public static int countPass(int[] studentMarks){
		int passedStudents = 0;
		// for each loop
		for(int marks : studentMarks){
			if(isPass(marks)){
				passedStudents++;
			}
		}
		return passedStudents;
	}
	

	public static void main(String[] args) {
		int[] studentMarks = new int[]{23, 55, 99, 43, 18, 64};
		int passed = countPass(studentMarks);
		System.out.println(String.format("%d passed out of %d", passed, studentMarks.length));
		

	}

}

