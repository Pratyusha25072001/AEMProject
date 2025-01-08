package com.adobe.capgemini.website.core.services;
 
import com.adobe.capgemini.website.core.pojo.Subject;
 
import java.util.List;
 
public interface StudentInfoService {
 
    String getStudentName(String rollNumber);
 
    List<Subject> getStudentSubjects(String rollNumber);
}