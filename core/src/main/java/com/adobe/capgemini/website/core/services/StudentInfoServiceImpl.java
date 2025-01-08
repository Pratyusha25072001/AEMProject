package com.adobe.capgemini.website.core.services;
 
import com.adobe.capgemini.website.core.pojo.Subject;
 
import com.adobe.capgemini.website.core.services.StudentInfoService;
import org.osgi.service.component.annotations.Component;
 
 
import java.util.ArrayList;
import java.util.List;
 
@Component(service = StudentInfoService.class)
public class StudentInfoServiceImpl implements StudentInfoService {
 
    @Override
    public String getStudentName(String rollNumber) {
        // Mock implementation for demo purposes
        if ("101".equals(rollNumber)) {
            return "Ghanishtha";
        } else if ("102".equals(rollNumber)) {
            return "Ram";
        } else if ("103".equals(rollNumber)) {
            return "Raju";
        } else if ("104".equals(rollNumber)) {
            return "Nupur";
        } else if ("105".equals(rollNumber)) {
            return "Prarthana";
        } 
        return "Unknown Student";
    }
 
    @Override
    public List<Subject> getStudentSubjects(String rollNumber) {
        List<Subject> subjects = new ArrayList<>();
        if ("101".equals(rollNumber)) {
            subjects.add(new Subject("Math", "85", calculateGrade(85)));
            subjects.add(new Subject("Science", "90", calculateGrade(90)));
            subjects.add(new Subject("History", "78", calculateGrade(78)));
        } else if ("102".equals(rollNumber)) {
            subjects.add(new Subject("Math", "88", calculateGrade(88)));
            subjects.add(new Subject("Biology", "74", calculateGrade(74)));
            subjects.add(new Subject("Geography", "80", calculateGrade(80)));
        } else if ("103".equals(rollNumber)) {
            subjects.add(new Subject("Maths", "76", calculateGrade(76)));
            subjects.add(new Subject("Chemistry", "96", calculateGrade(96)));
            subjects.add(new Subject("Geography", "60", calculateGrade(60)));
        } else if ("104".equals(rollNumber)) {
            subjects.add(new Subject("English", "78", calculateGrade(78)));
            subjects.add(new Subject("Biology", "76", calculateGrade(76)));
            subjects.add(new Subject("Hindi", "80", calculateGrade(80)));
        } else if ("105".equals(rollNumber)) {
            subjects.add(new Subject("Math", "81", calculateGrade(81)));
            subjects.add(new Subject("Biology", "72", calculateGrade(72)));
            subjects.add(new Subject("Physics", "90", calculateGrade(90)));
        } else if ("106".equals(rollNumber)) {
            subjects.add(new Subject("Math", "80", calculateGrade(80)));
            subjects.add(new Subject("Social", "66", calculateGrade(66)));
            subjects.add(new Subject("Geography", "80", calculateGrade(80)));
        }
        return subjects;
    }
 
    private String calculateGrade(int marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else {
            return "C";
        }
    }
}