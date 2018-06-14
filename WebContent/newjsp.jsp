<%-- 
    Document   : newjsp
    Created on : 5 Oct, 2015, 3:37:06 PM
    Author     : techm
--%>
<%@page import="java.util.Iterator"%>
<%@page import="com.lbs.beans.Lab"%>
<%@page import="com.lbs.daoimplementations.LabDaoImplementation"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.lbs.controllers.GetAllLabDetailsController" %>
<%@page import="java.util.ArrayList"%>
<%@page import="com.lbs.utilities.DatabaseConnectivityUtility"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"                                                    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body class="container">
<h3>welcome ${sessionScope.userName}</h3>
<form action="details" method="Post">
<div  class="table-responsive">

<table  class="table" border="2">

     <thead>
      <tr>
       
        <th>LabID</th>
        <th>LabName</th>
       <th>LabCapacity</th>
      </tr>
    </thead>

 
 <c:forEach  var="lab" items="${requestScope.labDetails}">
 <tbody>
           <tr>

                    <td>${lab.labId}</td>
                    <td>${lab.labName} </td>
                    <td>${lab.capacity}</td>

                </tr>
 </tbody>
 </c:forEach>
 
    </table>
    <input type="Submit" value="getlabdetails">

<h1>${sessionScope.userName}</h1>

</div>
</form>
<form action="operations" method="Post" >
<div class="jumbotron">

UserID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="userid" ><br>
LabLocation&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="location"><br>
LabCapacity&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="capacity"><br>
date of request &nbsp;&nbsp;&nbsp;&nbsp;<input type="datetime-local" name="requestdate">
date of release &nbsp;&nbsp;&nbsp;&nbsp;<input type="datetime-local" name="releasedate">

<button class="btn btn-primary" type="Submit">Raise Lab Request</button>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<button class="btn btn-warning">Raise Lab Release</button>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

</div>
</form>


<div >
<h3>Approvals</h3>

 <form action="Approval" method="Post">
<div  class="table-responsive">

<table  class="table" border="2">

     <thead>
      <tr>
       
        <th>LabID</th>
        <th>Location</th>
       <th>UserID</th>
           <th>LabName</th>
      </tr>
    </thead>

 
 <c:forEach  var="Approvals" items="${requestScope.labApprDetails}">
 <tbody>
           <tr>

                    <td>${Approvals.labId}</td>
                    <td>${Approvals.location}</td>
                     <td>${Approvals.userId}</td>
                    <td>${Approvals.labName} </td>
                    
                     
                </tr>
 </tbody>
 </c:forEach>
 
    </table>
    <input type="Submit" value="getApprovaldetails">

<h1>${sessionScope.userName}</h1>

</div>
</form>

</div>


</body>
</html> 