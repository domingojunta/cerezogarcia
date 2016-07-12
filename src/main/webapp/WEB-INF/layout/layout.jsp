<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/layout/taglib.jsp" %>
 
 


<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>
		<tiles:getAsString name="title" />
	</title>
	<link rel="stylesheet" type="text/css" href='<s:url value="/resources/css/bootstrap-theme.min.css"></s:url>' /> 
	<link rel="stylesheet" type="text/css" href='<s:url value="/resources/css/bootstrap.min.css"></s:url>' />
	<link rel="stylesheet" type="text/css" href='<s:url value="/resources/css/customStyle.css"></s:url>' />  
</head>
<body>
<tilesx:useAttribute name="menuItem" />
 
<div class="container">
	
		<tiles:insertAttribute name="header" />
	 <!-- Static navbar -->
      <nav class="navbar navbar-default navbar-info">
        <div class="container-fluid">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" style="text-align: center;" href='<s:url value="/home"></s:url>'>
            	<img alt="Cerezo y García" src='<s:url value="/resources/img/LogoTexto.png"></s:url>' width="150" height="30"/>
            </a>
          </div>
          <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li class="${menuItem == 'home' ? 'active' : '' }"><a href='<s:url value="/home"></s:url>'><span class="glyphicon glyphicon-home"></span> Inicio</a></li>
              <li class="${menuItem == 'news' ? 'active' : '' }"><a href='<s:url value="/news"></s:url>'><span class="glyphicon glyphicon-book"></span> Noticias</a></li>
              <li class="${menuItem == 'services' ? 'active' : '' }"><a href='<s:url value="/services"></s:url>'><span class="glyphicon glyphicon-list"></span> Servicios</a></li>
              <li class="${menuItem == 'budged' ? 'active' : '' }"><a href='<s:url value="/budged"></s:url>'><span class="glyphicon glyphicon-eur"></span> Presupuesto</a></li>
              <li class="${menuItem == 'contact' ? 'active' : '' }"><a href='<s:url value="/contact"></s:url>'><span class="glyphicon glyphicon-envelope"></span> Contacta</a></li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Comunidades <span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li class="${menuItem == 'communities' ? 'active' : '' }"><a href='<s:url value="/communities"></s:url>'>Listar</a></li>
                  
                  <li role="separator" class="divider"></li>
                  <li class="dropdown-header">Nav header</li>
                  <li><a href="#">Separated link</a></li>
                  
                </ul>
              </li>
              
             
            </ul>
            <ul class="nav navbar-nav navbar-right">
              <li class="${menuItem == 'users' ? 'active' : '' }"><a href='<s:url value="/users"></s:url>'><span class="glyphicon glyphicon-user"></span> Usuarios<span class="sr-only">(current)</span></a></li>
              
            </ul>
          </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
      </nav>
	
		<tiles:insertAttribute name="body" />
	
	<div style="text-align: center;">
		<tiles:insertAttribute name="footer" />
	</div>
</div>
	<script src='<s:url value="/resources/js/jquery-2.1.4.min.js"></s:url>' ></script>
	<script src='<s:url value="/resources/js/bootstrap.min.js"></s:url>' ></script>
</body>
</html>