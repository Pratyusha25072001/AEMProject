package com.adobe.capgemini.website.core.services;
import com.adobe.capgemini.website.core.pojo.Student;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
@Component(service=StudentInterface.class)
// @Designate(ocd=StudentConfiguration1.class)
public class StudentDataImpl implements StudentInterface{

private static final List<Student> STUD_DATABASE = new ArrayList<>();

static {
    STUD_DATABASE.add(new Student("Ghanishtha", 95,"Maths","A"));
    STUD_DATABASE.add(new Student("TANU", 92,"English","B"));
    STUD_DATABASE.add(new Student("Ram", 78,"Maths","A"));
}

@Override
public String getStudentName(int rollNumber) {
    if (rollNumber > 0 && rollNumber <= STUD_DATABASE.size()) {
        Student student = STUD_DATABASE.get(rollNumber - 1); 
        return student != null ? student.getName() : "Student with this roll number not found";
    }
    return "Student with this roll number not found";
}

@Override
public int getMarks(int rollNumber) {
    if (rollNumber > 0 && rollNumber <= STUD_DATABASE.size()) {
        Student student = STUD_DATABASE.get(rollNumber - 1); 
        return student != null ? student.getMarks() : -1; 
    }
    return -1;
}

@Override
public String getGrades(int rollNumber) {
    if (rollNumber > 0 && rollNumber <= STUD_DATABASE.size()) {
        Student student = STUD_DATABASE.get(rollNumber - 1); 
        return student != null ? student.getGrades() : "Not found"; 
    }
    return "Not Found";
}

@Override
public String getSubject(int rollNumber)
{
    if(rollNumber > 0 && rollNumber<=STUD_DATABASE.size()) {
        Student student=STUD_DATABASE.get(rollNumber - 1);
        return student!=null? student.getSubject() : "Not found";
    }
    return "Not found";
}

}