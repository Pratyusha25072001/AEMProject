package com.adobe.capgemini.website.core.pojo;
public class Student {
        private final String name;
        private final int marks;
        private final String grades;
        private final String subjects;
        public Student(String name,int marks,String grades,String subjects) {
            this.name = name;
            this.marks=marks;
            this.grades=grades;
            this.subjects=subjects;
        }
 
        public String getName() {
            return name;
        }

        public int getMarks() {
            return marks;
        }

        public String getGrades() {
            return grades;
        }

        public String getSubject() {
            return subjects;
        }
        
    }



