<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
 <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC From Handling</title>
</head>
<body> <h2>Daycare Signup Result</h2>
    <table>
        <tr>
            <td>First Name</td>
            <td>${c.firstName}</td>
        </tr>
        <tr>
            <td>Last name</td>
            <td>${c.lastName}</td>
        </tr>
        <tr>
            <td>Age</td>
            <td>${c.age}</td>
        </tr>
        <tr>
            <td>Weight</td>
            <td>${c.weight}</td>
        </tr>
        
        <tr>
            <td>Gender</td>
            <td>${c.gender}</td>
        </tr>
        <tr>
            <td>Full Time or Part Time</td>
            <td>${c.ftpt}</td>
        </tr>
        
        </table>
<a href = "viewAll.mvc">View all Children</a>
</body>
</html>