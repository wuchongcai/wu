<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<html>
<head>
<script type="text/javascript" src="http://localhost/kuangjia/js/jquery.min.js"></script>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="http://g.alicdn.com/bui/bui/1.1.21/css/bs3/dpl.css" rel="stylesheet">
    <link href="http://g.alicdn.com/bui/bui/1.1.21/css/bs3/bui.css" rel="stylesheet">
    <link rel="stylesheet" href="http://localhost/kuangjia/css/index.css">
    <link rel="stylesheet" href="http://localhost/kuangjia/font/iconfont.css">
</head>
<style>
</style>
<body>

<div class="doc-content">
    <ul class="breadcrumb breadcrumb2"></ul>
    <ul class="breadcrumb">
        <li>
            <span class="iconfont icon-shouye"></span>
            <a href="/kuangjia/Lujing?path=home.jsp">首页</a> <span class="divider"><span class="iconfont icon-down-trangle1"></span></span>
        </li>
        <li class="active">权限管理</li>
    </ul>
    <div class="tit">
        <span class="iconfont icon-guanlianniu"></span>
        <span>用户管理</span>
        <span class="iconfont icon-down-trangle2"></span>
    </div>

 <div style="text-align: center;">
    <input type="button" value="新增用户" onclick="insertinto()">
    </div>
    <div class="span95">
    <table cellspacing="0" class="table table-head-bordered table-bordered">
            
            
        </a>
        <thead>
        <tr style="">
            <th>id</th>
            <th>用户名</th>
            <th>角色</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="obj" >
        <tr>
            
           <td class="element" >${obj.id}</td>
			<td class="element">${obj.adminname}</td>
			<td class="element">${obj.role.rolername}</td>
			 <td><a href="http://localhost/kuangjia/behind/UserUpdate?id=${obj.id}&adminname=${obj.adminname}&rolername=${obj.role.rolername}">修改</a> 
			  <a href="http://localhost/kuangjia/behind/UserDelect?id=${obj.id}">删除</a> </td>
        </tr>
        

</c:forEach>
        </tbody>
    </table>
</div>


</div>
<script type="text/javascript">
 function insertinto() {
 	window.location.href = "http://localhost/kuangjia/Lujing?path=admininsertinto.jsp";
 }

</script>

</body>

</html>