package com.adobe.capgemini.website.core.models;
 
import com.adobe.capgemini.website.core.services.StudentInfoService;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import com.adobe.capgemini.website.core.pojo.Subject;
import java.util.List;
 
@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class StudentInfoModel {
 
    @ValueMapValue
    private String rollNumber;
 
    @OSGiService
    private StudentInfoService studentInfoService;
 
    public String getRollNumber() {
        return rollNumber;
    }
 
    public String getName() {
        return studentInfoService.getStudentName(rollNumber);
    }
 
    public List<Subject> getSubjects() {
        return studentInfoService.getStudentSubjects(rollNumber);
    }
}