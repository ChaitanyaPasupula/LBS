<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css\bootstrap.css" rel="stylesheet" />
<title>OTM PAGE</title>
</head>
<body>
<h3> welcome ${sessionScope.userName}</h3>

<form action="requestdetails" method="Post">

<div class="table-responsive" >
<table  class="table"  >

     <thead>
      <tr>
        <th>DateOFRequest</th>
        <th>DateOFRelease</th>
        <th>UserID</th>
        <th>LabCapacity</th>
                <th>LabLocation</th>
      </tr>
    </thead>
 <c:forEach  var="lab" items="${requestScope.labreqDetails}">
   <tbody>
           <tr>

                    <td>${lab.dateOfRequest}</td>
                    <td>${lab.dateOfRelease} </td>
                    <td>${lab.userId}</td>
                    <td>${lab.labCapacity}</td>
                    <td>${lab.labLocation}</td>
                </tr>
 </tbody>
 </c:forEach>
 
    </table>
    <input type="Submit" value="GetLabRequestDetails">
</div>
</form>

<form action="xdetails" method="Post">
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

</div>
</form>


<div class="jumbotron">
<form action="allocation" method="Post">

UserID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="userid" ><br><br>
LabID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="labid" ><br><br>
LabLocation&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="location"><br><br>

<button type="Submit" class="btn btn-warning " value="Approve">Approve</button>
</form>
</div>
<div >
<h3>Approvals</h3>

 <form action="xApproval" method="Post">
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



</div>
</form>

</div>


</body>
</html>