<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- Reference JSLT tag library. This will give me that forEach tag for looping over a collection -->

<!DOCTYPE html>

<html>

<head>
	<title>Student Confirmation</title>
</head>

<body>

The student is confirmed: ${student.firstName} ${student.lastName} <!-- Calls student.getFirstName() and  student.getLastName() -->

<br><br>

Country: ${student.country} <!-- Spring will call student.getCountry() -->

<br><br>

Favorite Language: ${student.favoriteLanguage} <!-- Spring will call student.getFavoriteLanguage() -->

<br><br>

Operating Systems:

<ul>
<c:forEach var="temp" items="${student.operatingSystems}">

<li> ${temp} </li>

</c:forEach>
</ul>

</body>

</html>
