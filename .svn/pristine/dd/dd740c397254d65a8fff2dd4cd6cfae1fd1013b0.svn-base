<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生成绩网络查询</title>
    <link rel="stylesheet" href="font/iconfont.css">
    <link rel="stylesheet" type="text/css" href="css/login.css" />
</head>
<script src="http://localhost/kuangjia/js/jquery.min.js"></script>
<body>
<img src="http://localhost/kuangjia/img/weimei.jpg" alt="" class="ig1">
<img src="http://localhost/kuangjia/img/78.jpg" alt="" class="ig2">
<div class="title">
    <span>学生成绩网络查询</span>
</div>
<div class="login">
    <div class="form-title">用户登录</div>
    <div class="lin"></div>
       <form id='form1' name='form1' method='post' action='behind/select'>
       <div style="text-align:center">
       <input type="radio" name="ty" value="0" >学生登陆
<!--        <input type="radio" name="ty" value="1">教师登录 -->
       <input type="radio" name="ty" value="2">管理员登录
       </div>
            <ul class="list">
                <li>
                    <span class="iconfont icon-yonghuming logo"></span>
                    <input type="text" name="username" id="username" value="${username}" placeholder="用户名"/>
                    <div class="error"></div>
                </li>
                <li>
                    <span class="iconfont icon-mima logo"></span>
                    <input type="password" name="password" id="password" value="" placeholder="密码"/>
                    <div class="error"></div>
                </li>
            </ul>
           <div type="submit" class="submit submit2">登 &nbsp;&nbsp;&nbsp;&nbsp;录</div>
       </form>
</div>
</body>
<script>
$(document).ready(function(){
	
    var name=false;
    var pass=false;
    var reg = new RegExp("[\\u4E00-\\u9FFF]+","g");
    var reg2= new RegExp("^[a-z]");
//用户名校验
    $("#username").blur(function() {
    	
        var that=$('#username').siblings('.error').get(0);
        name=false;
         if($(this).val().trim()===''){
             that.innerText='用户名不能为空！';
         }else if(reg.test($(this).val())){
             that.innerText='用户名不能为汉字';
         }else if($(this).val().length<=5||$(this).val().length>=15){
             that.innerText='用户名长度在5-15之间';
         }
         else{
             name=true;
             that.innerText=''
         }
    });
//密码校验
    $("#password").blur(function() {
        var that=$('#password').siblings('.error').get(0);
        pass=false;
        if($(this).val().trim()===''){
            that.innerText='密码不能为空！'
        }else if(!reg2.test($(this).val())){
            that.innerText='密码请以字母开头';
        }else if(reg.test($(this).val())){
            that.innerText='密码不能为汉字';
        }else if($(this).val().length<=5||$(this).val().length>=20){
            that.innerText='密码长度在5-20之间';
        }else{
            pass=true;
            that.innerText=''
        }
    });
//提交处理
    $('.submit').eq(0).click(function(){
    	if ("${username}"!=null) {
    		name=true;
    		pass=true;
    	}
        if(pass===true&&name===true){
            $.ajax({
                url:'behind/select',
                type:"POST",
                data:$('#form1').serialize(),
                dataType:"json",
                success: function(data) {
                	
                    if(data.message =="成功"){
//                     	alert(data.message)
                        $('#password').siblings('.error').get(0).innerText='提交成功！';
                        window.location.href="http://localhost/kuangjia/befor/classify?ty="+data.ty+" ";
                    }else{
                    	alert("失败")
                        $('#password').siblings('.error').get(0).innerText='提交失败！';
                    }
                }
            });
            
            
        }else{
            $('#password').siblings('.error').get(0).innerText='提交失败！';
        }
        
    })



})
</script>
</html>