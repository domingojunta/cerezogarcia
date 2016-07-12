
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/layout/taglib.jsp" %>

	
        <h1 class="well">Listado de Comunidades</h1>
   
      
      <table class="table table-striped table-bordered table-hover">
  <tr>
    <th>Nombre de la Comunidad</th>
    
  </tr>
  <tr>
   	<c:forEach items="${communities}" var="community">
  
    <td>
    	
    	<a href='<s:url value="/community/${community.id}"></s:url>'>
    	${community.name}
    	</a>
    </td>
    
    </c:forEach>
  </tr>
</table>