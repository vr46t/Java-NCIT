package org.ncit.exception;

public class Student {
	
	private int semester;
	
	public Student(int semester){
		
		try {
			if(semester>8 || semester<=0) {
				throw new InvalidSemesterException("Invalid Semester");
			}
			this.semester = semester;
			
		}catch (InvalidSemesterException e) {
			   //If invalid semester is entered, make it 1
			   this.semester = 1;
			   e.printErrorMessage();
		}
		
		
	}

	@Override
	public String toString() {
		return "Student [semester=" + semester + "]";
	}
		

}
