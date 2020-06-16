<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!-- When form is loaded, Spring MVC will call: student.getFirstName() and student.getLastName(). 
	And when form is submitted, it will call: student.setFirstName() and student.setLastName(). -->

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" /><!-- Property of Student class -->
		
		<br><br>
	
		Last name: <form:input path="lastName" /><!-- Property of Student class -->
		
		<br><br>
		
		Country:
		
		<form:select path="country"> <!-- On submit, Spring will call student.setCountry() -->
		
		<form:options items="${student.countryOptions}"/> <!--items refer to the collection of data. Spring will call student.getCountryOptions()-->
		
		<!--  
		<form:option value="Brazil" label="Brazil"/>
		<form:option value="France" label="France"/>
		<form:option value="Germany" label="Germany"/>
		<form:option value="India" label="India"/>
		-->
		
		</form:select>
		
		
		<br><br>
	
		<input type="submit" value="Submit" />
	
	</form:form>



</body>

</html>
