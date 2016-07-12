<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/layout/taglib.jsp" %>

	
        <h2 class="well">${community.name }</h2>
        
        <p> ${community.description}</p>
        
         <table class="table table-striped table-bordered table-hover">
  <tr>
    <th>Edificios</th>
    
  </tr>
  <tr>
   	<c:forEach items="${buildings}" var="building">
  
    <td>
    	
    	${building.name}
    	
    </td>
    
    </c:forEach>
  </tr>
</table>
   
      
      
      
