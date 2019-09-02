<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<html>
<head>
    <meta charset="UTF-8">
    <title>学生网络成绩查询后台</title>
    <link rel="stylesheet" href="http://localhost/kuangjia/css/index.css">
    <link href="http://g.alicdn.com/bui/bui/1.1.21/css/bs3/dpl.css" rel="stylesheet">
    <link href="http://g.alicdn.com/bui/bui/1.1.21/css/bs3/bui.css" rel="stylesheet">
    <link rel="stylesheet" href="http://localhost/kuangjia/font/iconfont.css">
</head>
<script src="http://localhost/kuangjia/js/jquery.min.js"></script>
<body>
<div class="head">
    <div class="title">学生网络成绩查询后台</div>
    <div class="right1">

        <span class="iconfont icon-yonghu"></span>
        <span>${username}</span>
        <a href="" onclick="tuichu()" style="color: white">
            <span class="iconfont icon-tuichu"></span>
            <span>退出</span>
        </a>
    </div>
</div>

<ul class="left11">
    <li>
        <a href="/kuangjia/Lujing?path=home.jsp" target="right">
            <span class="iconfont icon-shouye"></span>
            <span>首页</span>
            <span class="iconfont icon-xiangxia xx" style="opacity: 0"></span>
            <span class="iconfont icon-xiangxia rotate" style="opacity: 0"></span>
        </a>
        <ul></ul>
    </li>
    
    
   <c:forEach items="${list}" var="obj">
    <li>
        <a>
            <span class="iconfont icon-shouye--dibuge-"></span>
            <span>${obj.functionname}</span>
            <span class="iconfont icon-xiangxia xx"></span>
            <span class="iconfont icon-xiangxia rotate"></span>
        </a>
        <ul>
        <c:forEach items="${list2}" var="object">
        <c:if test="${object.superid==obj.functionid}">
        
            <li>
                <a href="${object.functionurl}" target="right">
                    <span>${object.functionname}</span>
                </a>
                
            </li>
        
        </c:if>
        </c:forEach>
        </ul>
        </li>
        </c:forEach>
    
    <li>
<!--         <a> -->
<!--             <span class="iconfont icon-quanxian"></span> -->
<!--             <span>权限管理</span> -->
<!--             <span class="iconfont icon-xiangxia xx"></span> -->
<!--             <span class="iconfont icon-xiangxia rotate"></span> -->
<!--         </a> -->
        
    </li>
    
</ul>

<div class="right11">
    <iframe scrolling="auto" rameborder="0" src="/kuangjia/Lujing?path=home.jsp" name="right" width="100%" height="100%"></iframe>
</div>
<div class="bot">
   <span>本站信息由山西哆来咪公司全权提供</span>
</div>
</body>
<script>
    $(document).ready(function () {
        $('.left11>li>a').each(function(ind){
            $(this).click(function(){
                $('.left11>li .xx').eq(ind).slideToggle(0);
                $('.left11>li .rotate').eq(ind).slideToggle(0);
                $('.left11>li>ul ').eq(ind).slideToggle("slow");
            })
        })
    })
    
    
    function tuichu() {
	
	$.ajax({
				url:"http://localhost/kuangjia/befor/qingchu",
				type:"post",
				data:{},
				dateType:"text",
				success:function(data){
					window.location.href = "http://localhost/kuangjia/index.jsp";
				}
             })
}
</script>
</html>