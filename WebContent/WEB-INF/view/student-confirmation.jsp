<!DOCTYPE html>

<html>

<head>
	<title>Student Confirmation</title>
</head>

<body>

The student is confirmed: ${student.firstName} ${student.lastName} <!-- Calls student.getFirstName() and  student.getLastName() -->

<br><br>

Country: ${student.country} <!-- Spring will call student.getCountry() -->

</body>

</html>
