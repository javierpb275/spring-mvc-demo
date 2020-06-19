package com.javi.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator 
	implements ConstraintValidator<CourseCode, String> {
	
	private String coursePrefix;//define the coursePrefix that we can validate against
	
	@Override
	public void initialize(CourseCode theCourseCode) {// Assign the value from passed in from our annotation
		coursePrefix = theCourseCode.value();//value: "LUV"
		
	}

	//You can add your own custom business logic
	@Override
	public boolean isValid(//Spring MVC will call isValid().
			String theCode, //HTML Form Data. Entered by the user.
			ConstraintValidatorContext theConstraintValidatorContext // ConstraintValidatorContext: You can place additional error messages here
			) {   
		
		//Validation logic. Test if the form data starts with our course prefix
		boolean result = theCode.startsWith(coursePrefix);
		
		return result;
	}

}
