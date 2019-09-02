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
        <span>角色信息</span>
        <span class="iconfont icon-down-trangle2"></span>
    </div>
    <span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;角色信息</span>
         <select name="supername" id="juese" onchange="gaibian()">
        <option value="0">请选择</option>
        <c:forEach items="${lists }" var="list">
        <option value="${list.roleid }">${list.rolername }</option>
        </c:forEach>
        
        </select>
    <div class="tit">
        <span class="iconfont icon-guanlianniu"></span>
        <span>角色模块管理</span>
        <span class="iconfont icon-down-trangle2"></span>
    </div>

    <div class="span95">
    <table cellspacing="0" class="table table-head-bordered table-bordered">
<!--         <a href="/kuangjia/selectSuperID"> -->
<!--             <div class="s-btn"> -->
<!--                 <span style="color: black">新增</span> -->
<!--             </div> -->
<!--         </a> -->
        <thead>
        <tr style="">
        	<th>模块ID</th>
            <th>模块名字</th>
            <th>模块级别</th>
            <th>模块上级</th>
            <th>模块地址</th>
            <th>能否访问</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="obj" >
        <tr>
<!--             <td> -->
<%--                 <img src="<%=request.getContextPath() %>/file/${obj.stuimg}" alt=""> --%>
<!--             </td> -->
            <td>${obj.functionid}</td>
            <td>${obj.functionname}</td>
            <td>${obj.functionrank}</td>
            <td>${obj.supername}</td>
            <td>${obj.functionurl}</td>
            <td>
            	是&nbsp;<input <c:if test="${obj.yes==1}">checked</c:if> type="radio" value="1" name="yes${obj.functionid}" onchange="privilege('${obj.functionid}','1')">
				否&nbsp;<input <c:if test="${obj.yes==0}">checked</c:if> type="radio" value="0" name="yes${obj.functionid}" onchange="privilege('${obj.functionid}','0')">
            </td>
<%--             <td><a href="http://localhost/kuangjia/behind/functionUpdate?functionID=${obj.functionID}&functionName=${obj.functionName}">编辑</a> <a href="functionUpdateDelect?id=${obj.functionID}">删除</a></td> --%>
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

${page}
</body>




<script type="text/javascript">
$(function(){
	$("#juese").val("${role_id}");
	$("#pageSize").val("${number}");
})
function gaibian(){
	var  role_id = $("#juese").val();
		window.location.href="functionSelect?role_id="+role_id+"";
}

function privilege(functionID,yes){
	var  role_id = $("#juese").val();
	if(role_id==0 || role_id== null){
		alert("请选择角色");
	}else{
		$.ajax({
	        url : '<%= request.getContextPath()%>/alerts',
	        type : "POST",
	        data : {"functionid":functionID ,"yes":yes,"role_id":role_id},
	        dataType : "text",
	        success : function(data) {
	        	alert(data);
	        	console.log(data);
	        	if(data=="成功"){
	        		
// 	        		window.location.href="privilegeSelect";
	        		gaibian()
	        	}
	        }
	     });
	}
		
}

function page(i) {
	var pageSize = $("#pageSize").find("option:selected").text()
	var  role_id = $("#juese").val();
	window.location.href="http://localhost/kuangjia/functionSelect?currentPage="+i+"&pageSize="+pageSize+"&role_id="+role_id+" "
}
</script>

</html>