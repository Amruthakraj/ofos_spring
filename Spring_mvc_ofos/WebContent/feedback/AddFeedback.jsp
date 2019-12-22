<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  <style>.error{color:red;}</style>
        <h1>Feed Us Back</h1>  
       <form:form method="post" action="save">    
        <table >    
         <tr>    
          <td>Name : </td>   
          <td><form:input path="cname"  />
          <form:errors path="cname" cssClass="error"/><br><br> 
          </td>  
         </tr>    
         <tr>    
          <td>Feedback :</td>    
          <td><form:input path="fdes" /></td>  
         </tr>   
         
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>  
        <a href="http://localhost:8081/ofo/Templates/customer/firstpage.jsp">HOME</a>  