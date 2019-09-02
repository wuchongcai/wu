<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript"
	src="http://localhost/kuangjia/js/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<head>
<meta charset="UTF-8">
<title>Title</title>
<link href="http://g.alicdn.com/bui/bui/1.1.21/css/bs3/dpl.css"
	rel="stylesheet">
<link href="http://g.alicdn.com/bui/bui/1.1.21/css/bs3/bui.css"
	rel="stylesheet">
<link rel="stylesheet" href="http://localhost/xiangmu/css/index.css">
<link rel="stylesheet" href="http://localhost/xiangmu/font/iconfont.css">
</head>
<body>
	<script src="http://localhost/xiangmu/js/jquery.min.js"></script>
	<div style="width: 100%; margin: 100px auto; text-align: center;">
		<div style=""></div>
		<form action="/kuangjia/behind/userInsert" id="form_2">
			<div class="row">
				<div class="control-group">
					<label class="control-label">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;姓名：</label>
					<input type="text" name="adminname" class="control-text">
				</div>

			</div>
			<br>
			<div class="row">
				<div class="control-group">
					<label class="control-label">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;工号：</label>
					<input type="text" id="adminNumber" name="adminNumber" class="control-text">
				</div>

			</div>
			<br>
			<div class="row">
				<div class="control-group">
					<label class="control-label">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;密码：</label>
					<input type="password" name="password" class="control-text">
				</div>

			</div>
			<br>
			<div class="row">
				<div class="control-group">
					<label class="control-label">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;权限：</label>
					<select name="roleid">
						<option value="1">教务处</option>
						<option value="2">班主任</option>
						<option value="3">管理员</option>
					</select>
				</div>

			</div>
			<br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button"
				onclick="insertinto()" value="检测是否已存在">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="新增">
		</form>

	</div>


	<script type="text/javascript">
		function insertinto() {
			var adminNumber = $("#adminNumber").val();
			$.ajax({
				url : "http://localhost/kuangjia/behind/selectbyid",
				type : "post",
				data : {"adminNumber":adminNumber},
				dateType : "json",
				success : function(data) {
					console.log(data.count);
					if (data.count == 1) {
						alert("该工号已存在");
					} else {
						alert("可以添加");
					}

				}
			})
		}
	</script>
</body>


</html>