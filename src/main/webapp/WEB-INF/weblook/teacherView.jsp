<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<html>
<head>
<script type="text/javascript" src="/kuangjia/js/jquery.min.js"></script>
		<meta charset="utf-8" />
		<title>学生成绩查询</title>
		<link rel="stylesheet" type="text/css" href="http://localhost/kuangjia/css/style1.css"/>
	</head>
	<body>
		<!--<div class="bg"></div>-->
		<div class="head">
			<div class="head_nav clear">
				<i class="fl"><img src="http://localhost/kuangjia/img/BJDX.png"/> 学生成绩查询</i>
				<ul class="clear fr">
					<li><i><img src="http://localhost/kuangjia/img/user.png"/></i>${teacherName}</li>
					<li><a href="" onclick="tuichu()">退出</a></li>
				</ul>
			</div>
		</div>
		<!-------------------------------------------导航-------------------------------------------->
		<!--<div class="Leftnav fl">
			<ul>
				<li style="border-top:2px solid black;">个人信息</li>
				<li>成绩查询</li>
			</ul>
		</div>-->
		<!-------------------------------------------左边选项卡--------------------------------------->
		<div class="main clear">
			<div class="homepage user">
				<ul class="clear">
					<li style="border:0;">姓名</li>
					<li>教工号</li>
					<li>性别</li>
					<li>所带班级</li>
				</ul>
				<ul class="clear">
					<li style="border:0;">${teacherName}</li>
					<li>${teacherNumber}</li>
					<li>${sex}</li>
					<li>${stuClass1}</li>
				</ul>
			</div>
			<!--个人信息-->
			<div class="homepage mark">
			
			
			<form action="http://localhost/kuangjia/befor/kuangjia" method="post">
			<span>班级:</span>
				<select name="banji" class="sel2">
				<option value="全部">全部</option>
					<option value="1601">1601</option>
					<option value="1602">1602</option>
				</select>
				<span>学期:</span>
				<select name="term" class="sel3">
					<option value="全部">全部</option>
					<option value="第一学期">第一学期</option>
					<option value="第二学期">第二学期</option>
					
				</select>
				<input type="submit" value="查询">
				<input type="button"value="修改" class="amend btn"/>
				</form>
			
				
				<div class="table">
					<table border="1px" cellspacing="0" cellpadding="0">
						<tr>
							<td>学号</td>
							<td>学生姓名</td>
							<td>课程编号</td>
							<td>课程</td>
							<td>成绩</td>
							<td>学生班级</td>
						</tr>
						<tr>
							<c:forEach items="${list}" var="obj">
							<tr>
							<td>${obj.studentNumber}</td>
							<td>${obj.studentName}</td>
							<td>${obj.courseNumber}</td>
							<td>${obj.courseName}</td>
							<td><input type="text"value=""class="txt" id="${obj.id}" onchange="gaibian('${obj.id}')" /><span>${obj.grade}</span></td>
							<td>${obj.stuClass2}</td>
							
							</tr>
							</c:forEach>
							
						</tr>
<!-- 						<tr> -->
<!-- 							<td></td> -->
<!-- 							<td></td> -->
<!-- 							<td></td> -->
<!-- 							<td><input type="text"value=""class="txt"/><span>65</span></td> -->
<!-- 							<td></td> -->
<!-- 						</tr> -->
					</table>
					
				</div>
			</div>
			<!--成绩查询-->
		</div>
		<!-------------------------------------------主页面-------------------------------------------->
		<div class="down">
		<div class="down_nav">
			<ul class="clear">
				<li><a href="#">设为首页</a></li>
				<li><a href="#">加入收藏</a></li>
				<li><a href="#">隐私申明</a></li>
				<li><a href="#">网站声明</a></li>
				<li><a href="#">网站地图</a></li>
				<li><a href="#">网友纠错</a></li>
				<li><a href="#" style="border: 0;">使用帮助</a></li>
			</ul>
		</div>
		<!--居中盒下-->
	</div>
	<!--下导航-->
	<div class="botton">
		<div class="botton_main">
			<div class="botton_main_text clear">
				
			</div>
		</div>
		<!--居中盒底-->
	</div>
	
	
	
	
	<script type="text/javascript">
	$(function(){
		
		$("#pageSize").val("${number}");
		$(".sel2").val("${sutClass}");
		$(".sel3").val("${xueqi}");
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
	</body>
</html>



<script src="http://localhost/kuangjia/js/JS.js" type="text/javascript" charset="utf-8"></script>