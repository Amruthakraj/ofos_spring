<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1></h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Order Id</th><th>Customer Id</th><th>Total Price</th><th>Order status</th><th>Order Date</th><th>Updated status</th></tr>  
   <c:forEach var="agent" items="${list}">   
   <tr>  
   <td>${agent.order_id}</td>  
   <td>${agent.customer_id}</td>  
   <td>${agent.total_price}</td>  
   <td>${agent.order_status}</td>  
   <td>${agent.order_date}</td>  
  
   <td><a href="editagent/${agent.order_id}">Approve</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="empform">Add New Employee</a>  