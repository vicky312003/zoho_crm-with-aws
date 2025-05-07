<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List of Leads</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        th, td {
            padding: 10px;
            border: 1px solid #333;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
        a {
            color: blue;
            text-decoration: none;
        }
        a:hover {
            text-decoration: underline;
        }
        h1 {
            color: #2c3e50;
        }
    </style>
</head>
<body>

<h1>List of All Leads</h1>
<hr>

<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Mobile</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="lead" items="${listdata}">
            <tr>
                <td>${lead.id}</td>
                <td>${lead.fname}</td>
                <td>${lead.lname}</td>
                <td>${lead.email}</td>
                <td>${lead.mobile}</td>
                <td>
                    <a href="delete?id=${lead.id}">Delete</a> |
                    <a href="update?id=${lead.id}">Update</a>
                </td>
            </tr>
        </c:forEach>
        <c:if test="${empty listdata}">
            <tr>
                <td colspan="6" style="text-align:center;">No leads found.</td>
            </tr>
        </c:if>
    </tbody>
</table>

</body>
</html>
