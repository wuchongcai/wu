<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<script type="text/javascript"
	src="http://localhost/kuangjia/js/jquery.min.js"></script>
<meta charset="UTF-8">
<title>Title</title>
<link href="http://g.alicdn.com/bui/bui/1.1.21/css/bs3/dpl.css"
	rel="stylesheet">
<link href="http://g.alicdn.com/bui/bui/1.1.21/css/bs3/bui.css"
	rel="stylesheet">
<link rel="stylesheet" href="http://localhost/kuangjia/css/index.css">
<link rel="stylesheet"
	href="http://localhost/kuangjia/font/iconfont.css">
</head>
<style>
</style>
<body>

	<div class="doc-content">
		<ul class="breadcrumb breadcrumb2"></ul>
		<ul class="breadcrumb">
			<li><span class="iconfont icon-shouye"></span> <a
				href="/kuangjia/Lujing?path=home.jsp"></a>首页<span class="divider"><span
					class="iconfont icon-down-trangle1"></span></span></li>
			<li class="active">学生管理</li>
		</ul>
		<div class="tit">
			<span class="iconfont icon-guanlianniu"></span> <span>学生成绩</span> <span
				class="iconfont icon-down-trangle2"></span>
		</div>

		<div class="span95">
			<table cellspacing="0"
				class="table table-head-bordered table-bordered">
				<!--         <a href="/kuangjia/Lujing?path=banner-add.jsp"> -->
				<!--             <div style="text-align: center;"> -->
<!-- http://localhost/kuangjia/behind/selectgrades -->

				<form action="" method="post" id="from_2">
					<span>学号:</span> <input type="text" style="color: black"
						name="stuNumber" id="stuNumber"> <span>学年:</span> <select
						name="year" class="sel2">
						<option value="全部">全部</option>
						<option value="2016-2017学年">2016-2017学年</option>
						<option value="2017-2018学年">2017-2018学年</option>
						<option value="2018-2019学年">2018-2019学年</option>
					</select> <span>学期:</span> <select name="term" class="sel3">
						<option value="全部">全部</option>
						<option value="第一学期">第一学期</option>
						<option value="第二学期">第二学期</option>

					</select> <input type="button" id="button" value="查询">
				</form>


				<!--             </div> -->
				</a>
				<thead>
					<tr style="">
						<th>课程编号</th>
						<th>课程</th>
						<th>成绩</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
				
<%-- 					<c:forEach items="${list}" var="obj"> --%>
<!-- 						<tr> -->
<%-- 							<td class="element">${obj.course.coursenumber}</td> --%>
<%-- 							<td class="element">${obj.course.coursename}</td> --%>
<%-- 							<td class="element">${obj.grade}</td> --%>
<!-- 							<td><a -->
<%-- 								href="http://localhost/kuangjia/behind/studentUpdate?id=${obj.studentNumber}&courseName=${obj.coursenumber}&year=${year}&term=${term}">修改</a> --%>
<!-- 							</td> -->
<!-- 						</tr> -->


<%-- 					</c:forEach> --%>
				</tbody>
			</table>
		</div>


	</div>

<!-- 	<script> -->
<!-- // 		$.ajax({ -->
<!-- // 			type : "POST",//请求方式 -->
<!-- // 			url : "login.php",//地址，就是json文件的请求路径 -->
<!-- // 			dataType : "json",//数据类型可以为 text xml json  script  jsonp -->
<!-- // 			success : function(result) {//返回的参数就是 action里面所有的有get和set方法的参数 -->
<!-- // 				addBox(result); -->
<!-- // 			} -->
<!-- // 		}); -->
<!-- 	</script> -->
	<script type="text/javascript">
	//点击分页按钮时触发的事件
	function page(i) {
		
//	 	find("option:selected").text()
		var pageSize = $("#pageSize").val();
		var stuNumber = $("#stuNumber").val();
		var year = $(".sel2 option:selected" ).val();
		var term = $(".sel3 option:selected" ).val();
		
		
		//跳转路径再次查询分页数据
//			window.location.href = "Select?currentPage=" + i + "&pageSize=" + pageSize + "&select="+select+"&select-1="+se+" ";
		$.ajax({
			url:"<%= request.getContextPath()%>/behind/selectgrades",
			type:"POST",
			data:{"currentPage":i,"pageSize":pageSize,"year":year,"term":term,"stuNumber":stuNumber},
			dataType:"json",
			success : function(data) {
				
				console.log(data);
				$(".aaa").remove();
				if(data.message =="成功"){
					console.log(data.list);
					$.each(data.list,function(i,val){
// 						alert("${val.studentNumber}");
						$("tbody").append(
								"<tr class=\"aaa\">"
								+"<td class=\"element bkl\">"+val.course.coursenumber+"</td>"
								+"<td class=\"element bk\">"+val.course.coursename+"</td>"
								+"<td class=\"element bk\">"+val.grade+"</td>"
								+"<td>"+"<a href='http://localhost/kuangjia/behind/studentUpdate?id="+val.studentNumber+"&courseName="+val.course.coursenumber+"'>修改</a>"+"</td>"
								+"</tr>"
// 								&year="+val.year+"&term="+val.term+"
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
//	 	var pageSize = $("#pageSize").find("option:selected").text()
//	 	window.location.href="http://localhost/kuangjia/befor/operation?currentPage="+i+"&pageSize="+pageSize+"&year0=${year}&term0=${term}"
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
		
//	 	var key = false;
//	 	$(".sel2").get(0).onchange = function() {
//	 		key = true;
//	 	}
//	 	$(".sel3").get(0).onchange = function() {
//	 		key = true;
//	 	}
		var year = $(".sel2 option:selected" ).val();
		var term = $(".sel3 option:selected" ).val();
		$("#button").click( function() {
			$.ajax({
				url : '<%= request.getContextPath()%>/behind/selectgrades',
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
// 						console.log();
							$("tbody").append(
									"<tr class=\"aaa\">"
									+"<td class=\"element bkl\">"+val.course.coursenumber+"</td>"
									+"<td class=\"element bk\">"+val.course.coursename+"</td>"
									+"<td class=\"element bk\">"+val.grade+"</td>"
// 									+"<a href='http://localhost/kuangjia/behind/studentUpdate?id=${val.studentNumber}&courseName=${val.coursenumber}&year=${year}&term=${term}'>修改</a>"</td>"
									+"<td>"+"<a href='http://localhost/kuangjia/behind/studentUpdate?id="+val.studentNumber+"&courseName="+val.course.coursenumber+"'>修改</a>"+"</td>"
									+"</tr>"
// 									&year="+val.year+"&term="+val.term+"
							)
					});
				}
			});
		});
	});

	
// 		$(function() {
// 			$("#pageSize").val("${number}");
// 			$(".sel2").val("${year}");
// 			$(".sel3").val("${term}");
// 			$("#stuNumber").val("${numb}");
// 		})
// 		function page(i) {
// 			var pageSize = $("#pageSize").find("option:selected").text()
// 			var stuNumber = $("#stuNumber").val()
// 			window.location.href = "http://localhost/kuangjia/behind/adminOperation?currentPage="
// 					+ i
// 					+ "&pageSize="
// 					+ pageSize
// 					+ "&year0=${year}&term0=${term}&stuNumber0="
// 					+ stuNumber
// 					+ " "
// 		}
	</script>
	<div id="page">${page}</div>
</body>

</html>