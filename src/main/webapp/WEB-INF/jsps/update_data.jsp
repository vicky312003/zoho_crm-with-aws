<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update the Leads</title>
</head>
<body>
<h2>Update the Leads</h2>
<form action="updatedata" method="post">
<pre>
<input type="hidden" name="id" value="${lead.id}"/>
Enter the first Name: <input type="text" name="fname" value="${lead.fname}"/>
Enter the last Name: <input type="text" name="lname" value="${lead.lname}"./>
Enter the email:<input type="text" name="email" value="${lead.email}"/>
Enter the mobile:<input type="text" name="mobile" value="${lead.mobile}"/>

<input type="submit" value="Update_Data"/>



</pre>


</form>

</body>
</html>