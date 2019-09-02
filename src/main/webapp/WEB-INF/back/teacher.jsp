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
        <li class="active">老师管理</li>
    </ul>
    <div class="tit">
        <span class="iconfont icon-guanlianniu"></span>
        <span>老师信息</span>
        <span class="iconfont icon-down-trangle2"></span>
    </div>
    
   

    <div class="span95">
    <table cellspacing="0" class="table table-head-bordered table-bordered">
            
            
        <thead>
        <tr style="">
            <th>教工编号</th>
            <th>教师姓名</th>
            <th>所带班级</th>
            <th>所带课程</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="obj" >
        <tr>
            
           <td class="element" >${obj.teacherNumber}</td>
			<td class="element">${obj.teachername}</td>
			<td class="element">${obj.stuclass}</td>
			<td class="element">${obj.course.coursename}</td>
        </tr>
        

</c:forEach>
        </tbody>
    </table>
</div>


</div>


</body>

</html>