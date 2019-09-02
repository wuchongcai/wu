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
        <li class="active">学生管理</li>
    </ul>
    <div class="tit">
        <span class="iconfont icon-guanlianniu"></span>
        <span>学生信息</span>
        <span class="iconfont icon-down-trangle2"></span>
    </div>

    <div class="span95">
    <table cellspacing="0" class="table table-head-bordered table-bordered">
<!--         <a href="/kuangjia/Lujing?path=banner-add.jsp"> -->
<!--             <div style="text-align: center;"> -->
            
            
<!--             <form action="http://localhost/kuangjia/behind/kuangjias" method="post"> -->
<!--             <span>学号:</span> -->
<!--                 <input type="text" style="color: black" name="stuNumber" id="stuNumber"> -->
<!--                 <span>学年:</span> -->
<!--                 <select name="year" class="sel2"> -->
<!-- 				<option value="全部">全部</option> -->
<!-- 					<option value="2016-2017学年">2016-2017学年</option> -->
<!-- 					<option value="2017-2018学年">2017-2018学年</option> -->
<!-- 					<option value="2018-2019学年">2018-2019学年</option> -->
<!-- 				</select> -->
<!-- 				<span>学期:</span> -->
<!-- 				<select name="term" class="sel3"> -->
<!-- 					<option value="全部">全部</option> -->
<!-- 					<option value="第一学期">第一学期</option> -->
<!-- 					<option value="第二学期">第二学期</option> -->
					
<!-- 				</select> -->
<!--                 <input type="submit" value="查询"> -->
<!--                 </form>  -->
                
                
<!--             </div> -->
        </a>
        <thead>
        <tr style="">
            <th>学号</th>
            <th>学生姓名</th>
            <th>学生性别</th>
            <th>所在班级</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${lists}" var="obj" >
        <tr>
            
           <td class="element" >${obj.studentNumber}</td>
			<td class="element">${obj.studentname}</td>
			<td class="element">${obj.sex}</td>
			<td class="element">${obj.stuclass}</td>
<%--             <td><a href="http://localhost/kuangjia/behind/studentUpdate?id=${obj.studentNumber}&courseName=${obj.courseNumber}&year=${year}&term=${term}">修改</a> </td> --%>
        </tr>
        

</c:forEach>
        </tbody>
    </table>
</div>


</div>

<script>
    $.ajax({
        type: "POST",//请求方式
        url: "login.php",//地址，就是json文件的请求路径
        dataType: "json",//数据类型可以为 text xml json  script  jsonp
        success: function(result){//返回的参数就是 action里面所有的有get和set方法的参数
            addBox(result);
        }
    });
</script>
<script type="text/javascript">
$(function(){
	$("#pageSize").val("${number}");
	$(".sel2").val("${year}");
	$(".sel3").val("${term}");
	$("#stuNumber").val("${numb}");
})
function page(i) {
	var pageSize = $("#pageSize").find("option:selected").text()
	var stuNumber = $("#stuNumber").val()
	window.location.href="http://localhost/kuangjia/behind/adminOperation?currentPage="+i+"&pageSize="+pageSize+"&year0=${year}&term0=${term}&stuNumber0="+stuNumber+" "
}

</script>
${page}
</body>

</html>