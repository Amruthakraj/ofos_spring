<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Employees List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Feedback</th></tr>  
   <c:forEach var="emp" items="${list}">   
   <tr>  
   <td>${emp.fid}</td>  
   <td>${emp.cname}</td>  
   <td>${emp.fdes}</td>  
     
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="http://localhost:8081/ofo/Templates/customer/firstpage.jsp">HOME</a>  
   <a href="AddFeedback">Add Feedback</a>  