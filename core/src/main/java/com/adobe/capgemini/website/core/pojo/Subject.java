package com.adobe.capgemini.website.core.pojo;
 
public class Subject {
 
    private String name;
    private String marks;
    private String grade; 
 
    // Constructor
    public Subject(String name, String marks, String grade) {
        this.name = name;
        this.marks = marks;
        this.grade = grade;
    }
 
    // Getters and Setters
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getMarks() {
        return marks;
    }
 
    public void setMarks(String marks) {
        this.marks = marks;
    }
 
    public String getGrade() { // Getter for grade
        return grade;
    }
 
    public void setGrade(String grade) { // Setter for grade
        this.grade = grade;
    }
 
    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", marks='" + marks + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}