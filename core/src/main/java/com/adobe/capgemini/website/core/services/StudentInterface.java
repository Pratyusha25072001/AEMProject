package com.adobe.capgemini.website.core.services;

public interface StudentInterface {

	public String getStudentName(int rollNumber);
	public int getMarks(int rollNumber);
	public String getGrades(int rollNumber);
	public String getSubject(int rollNumber);
	
}
