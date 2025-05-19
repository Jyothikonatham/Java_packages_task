package com.library.staff;
public class Librarian{
	private String librarianName;
	private int yearsOfExperience;

	public void setLibrarianName(String librarianName){
	this.librarianName=librarianName;
	}
	public String getLibrarianName(){
	return librarianName;
	}
	public void setyearsOfExperience(int yearsOfExperience){
	this.yearsOfExperience=yearsOfExperience;
	}

	public int getYearsOfExperience(){
	return yearsOfExperience;
	}
	
	public void showLibrarianInfo(){
	System.out.println("Librarian Name :" + librarianName);
	System.out.println("Years of Experience :" + yearsOfExperience);
	}
}
