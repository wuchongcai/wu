<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="http://g.alicdn.com/bui/bui/1.1.21/css/bs3/dpl.css" rel="stylesheet">
    <link href="http://g.alicdn.com/bui/bui/1.1.21/css/bs3/bui.css" rel="stylesheet">
    <link rel="stylesheet" href="http://localhost/xiangmu/css/index.css">
    <link rel="stylesheet" href="http://localhost/xiangmu/font/iconfont.css">
</head>
<body>
<script src="http://localhost/xiangmu/js/jquery.min.js"></script>
<div class="box">
    
    <form action="/kuangjia/behind/Userup" method="post">
    
    <div class="row">
        <div class="control-group">
            <label class="control-label">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：</label>
            <input type="text"  name="userName" class="control-text" value="${name}">
            <input type="hidden" name="id" value="${id}">
        </div>
    </div>
     <br>
    
     
    <div class="row">
        <div class="control-group">
            <label class="control-label">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;角&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;色：</label>
            <select name="roleName">
            <c:forEach items="${list}" var="obj"> 
            <option value="${obj.roleid}">${obj.rolername}</option>
            
            </c:forEach>
           
            </select>
            
        </div>
        
    </div>
     <br>
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="修改">
     </form>


</div>
</body>


</html>