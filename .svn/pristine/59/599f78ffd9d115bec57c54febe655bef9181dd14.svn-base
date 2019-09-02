<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<html>
<head>
<script type="text/javascript" src="http://localhost/kuangjia/js/jquery.min.js"></script>
		<meta charset="utf-8" />
		<title>学生成绩查询</title>
		<link rel="stylesheet" type="text/css" href="http://localhost/kuangjia/css/style.css"/>
	</head>
	<body>
		<!--<div class="bg"></div>-->
		<div class="head">
			<div class="head_nav clear">
				<i class="fl"><img src="http://localhost/kuangjia/img/BJDX.png"/> 学生成绩查询</i>
				<ul class="clear fr">
					<li><i><img src="http://localhost/kuangjia/img/user.png"/></i>${student.studentname}</li>
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
					<li>学号</li>
					<li>性别</li>
					<li>班级</li>
				</ul>
				<ul class="clear">
					<li style="border:0;">${student.studentname}</li>
					<li>${student.studentNumber}</li>
					<li>${student.sex}</li>
					<li>${student.stuclass}</li>
				</ul>
			</div>
			<!--个人信息-->
			<div class="homepage mark">
			<form action="http://localhost/kuangjia/befor/studentGrade" method="post" id="from_2">
			<span>学年:</span>
				<select name="year" class="sel2">
				<option value="全部">全部</option>
					<option value="2016-2017学年">2016-2017学年</option>
					<option value="2017-2018学年">2017-2018学年</option>
					<option value="2018-2019学年">2018-2019学年</option>
				</select>
				<span>学期:</span>
				<select name="term" class="sel3">
					<option value="全部">全部</option>
					<option value="第一学期">第一学期</option>
					<option value="第二学期">第二学期</option>
					
				</select>
				<input type="button" value="查询" id="button">
				
				</form>
				<div class="table">
					<table border="1px" cellspacing="0" cellpadding="0">
						<tr>
							<td class="element ">课程编号</td>
						<td class="bk ">课程</td>
<!-- 							<td class="element bk">程</td> -->
<!-- 								<td class="element bkl"></td> -->
							<td class="bk ">成绩</td>
								
							
							
						</tr>
						
						<tr>
<!-- 							<td class="element">1</td> -->
<!-- 							<td class="bk">大一语文</td> -->
<!-- 							<td class="bk">90</td> -->
						
<%-- 							<c:forEach items="${list}" var="obj"> --%>
<!-- 							<tr> -->
<%-- 							<td class="element">${obj.course.coursenumber}</td> --%>
<%-- 							<td class="element">${obj.course.coursename}</td> --%>
<%-- 							<td class="element">${obj.grade}</td> --%>
<!-- 							</tr> -->
<%-- 							</c:forEach> --%>
						
<!-- 						<tr> -->
<!-- 							<td class="element">隋和</td> -->
<!-- 							<td class="element">2016012114</td> -->
<!-- 							<td class="element">90</td> -->
<!-- 							<td class="element">80</td> -->
<!-- 							<td class="element">70</td> -->
<!-- 							<td class="element">60</td> -->
<!-- 						</tr> -->
					</table>
				</div>
			</div>
			<!--成绩查询-->
			
		</div>
		<div id="page">
		${page}
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
		<!--居中盒下 -->
	</div>
	<!--下导航 -->
<!-- 	<div class="botton"> -->
<!-- 		<div class="botton_main"> -->
<!-- 			<div class="botton_main_text clear"> -->
<!-- 				<div class="botton_main_text_2"><img src="http://localhost/kuangjia/img/db1.png"/></div> -->
<!-- 				<div class="botton_main_text_2"><img src="http://localhost/kuangjia/img/db2.png"/></div> -->
<!-- 				<div class="botton_main_text_1">主办：陕西省公安厅   陕ICP备14004550号   Copyright2017    运维电话：029-86165826 86165827  传真：029-86166951  网站地址   您是第19260位访问者</div> -->
<!-- 				<div class="botton_main_text_2"><img src="http://localhost/kuangjia/img/db3.png"/></div> -->
<!-- 				<div class="botton_main_text_2"><img src="http://localhost/kuangjia/img/db4.png"/>XA13180</div> -->
<!-- 			</div> -->
<!-- 		</div> -->
		<!--居中盒底 -->
<!-- 	</div> -->
	<script type="text/javascript">
// $(function(){
// 	$("#pageSize").val("${number}");
// 	$(".sel2").val("${year}");
// 	$(".sel3").val("${term}");
	
	
	
// })

//点击分页按钮时触发的事件
function page(i) {
	
// 	find("option:selected").text()
	var pageSize = $("#pageSize").val();
	var year = $(".sel2 option:selected" ).val();
	var term = $(".sel3 option:selected" ).val();
	
	
	//跳转路径再次查询分页数据
//		window.location.href = "Select?currentPage=" + i + "&pageSize=" + pageSize + "&select="+select+"&select-1="+se+" ";
	$.ajax({
		url:"<%= request.getContextPath()%>/befor/operation",
		type:"POST",
		data:{"currentPage":i,"pageSize":pageSize,"year":year,"term":term},
		dataType:"json",
		success : function(data) {
			
			console.log(data);
			$(".aaa").remove();
			if(data.message =="成功"){
				console.log(data.list);
				$.each(data.list,function(i,val){
					
					$("table").append(
							"<tr class=\"aaa\">"
							+"<td class=\"element bkl\">"+val.course.coursenumber+"</td>"
							+"<td class=\"element bk\">"+val.course.coursename+"</td>"
							+"<td class=\"element bk\">"+val.grade+"</td>"
							+"</tr>"
					)
			});
			}
			$("#page").empty();
			$("#page").append(data.page);
			$("#pageSize").val(data.number);
		}
	})
}
// function page(i) {
// 	var pageSize = $("#pageSize").find("option:selected").text()
// 	window.location.href="http://localhost/kuangjia/befor/operation?currentPage="+i+"&pageSize="+pageSize+"&year0=${year}&term0=${term}"
// }
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









$(function() {
	
// 	var key = false;
// 	$(".sel2").get(0).onchange = function() {
// 		key = true;
// 	}
// 	$(".sel3").get(0).onchange = function() {
// 		key = true;
// 	}
	$("#button").click( function() {
		$.ajax({
			url : '<%= request.getContextPath()%>/befor/studentGrade',
			type : "POST",
		    data: $('#from_2').serialize(),
			dataType : "json",
			success : function(data) {
	 			$("#pageSize").val(data.number);
				$(".aaa").remove();
				$("#page").empty();
				$("#page").append(data.page);
				$.each(data.list,function(i,val){
					$("#pageSize").val(data.number);
						$("table").append(
								"<tr class=\"aaa\">"
								+"<td class=\"element bkl\">"+val.course.coursenumber+"</td>"
								+"<td class=\"element bk\">"+val.course.coursename+"</td>"
								+"<td class=\"element bk\">"+val.grade+"</td>"
								+"</tr>"
								
						)
				});
			}
		});
	});
});



</script>

	</body>


</html>



