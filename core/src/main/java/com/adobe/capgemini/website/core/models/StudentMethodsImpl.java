package com.adobe.capgemini.website.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

import com.adobe.capgemini.website.core.services.StudentInterface;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.api.resource.Resource;
@Model(adaptables=Resource.class,
defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class StudentMethodsImpl {

	@OSGiService
	private StudentInterface studentinterface;
	@ValueMapValue
	private int rollNumber;
	public String getStudentName()
	{
		return studentinterface.getStudentName(rollNumber);
	}
	public int getRollNumber()
	{
		return rollNumber;
	}
	public int getMarks()
	{
		return studentinterface.getMarks(rollNumber);
	}
	public String getGrades()
	{
		return studentinterface.getGrades(rollNumber);
	}
	public String getSubject()
	{
		return studentinterface.getSubject(rollNumber);
	}
}


