package com.javi.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)/* CCCV: Helper class that contains business rules / validation logic */
@Target({ ElementType.METHOD, ElementType.FIELD})/*you can apply this annotation to a method or field*/
@Retention(RetentionPolicy.RUNTIME)/*How long will the marked annotation be stored or used. Retain this annotation in the Java class file. Process it at runtime*/
public @interface CourseCode {
	
	// define default course code
	public String value() default "LUV";
	
	// define default error message
	public String message() default "must start with LUV";
	
	// define default groups. Groups: can group related constraints
	public Class<?>[] groups() default {};
	
	// define default payloads. Payloads: provide custom details about validation failure (severity level, error code, etc)
	public Class<? extends Payload>[] payload() default {};

}
