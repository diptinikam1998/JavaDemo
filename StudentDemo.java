package com.dat.variable;

public class StudentDemo {

		private int studId;
		private String studName;
		
	//Constructor	
     public StudentDemo(int studId, String studName){
			this.studId = studId;
			this.studName = studName;
		}
    
    
     
     public int getStudId() {
		return studId;
	}



	public void setStudId(int studId) {
		this.studId = studId;
	}



	public String getStudName() {
		return studName;
	}



	public void setStudName(String studName) {
		this.studName = studName;
	}



	public static void main(String[] args) {
    	 StudentDemo student = new StudentDemo(1001,"Sam");
    	 StudentDemo student1 = new StudentDemo(1002,"Ram");
		   student1.studId = 2001;
		   student1.studName = "Rashi";
		System.out.println(student.studId);
		System.out.println(student.studName);
		System.out.println(student1.studId);
		System.out.println(student1.studName);
		System.out.println(student.getStudId());
	}

}
