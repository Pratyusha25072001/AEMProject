package com.adobe.capgemini.website.core.pojo;
 
class Student1 {
        private final String name;
        private final String subject;
        private final String marks;
 
        public Student1(String name, String subject, String marks) {
            this.name = name;
            this.subject = subject;
            this.marks = marks;
        }
 
        public String getName() {
            return name;
        }
 
        public String getSubject() {
            return subject;
        }
 
        public String getMarks() {
            return marks;
        }
    }