<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="http://g.alicdn.com/bui/bui/1.1.21/css/bs3/dpl.css" rel="stylesheet">
    <link href="http://g.alicdn.com/bui/bui/1.1.21/css/bs3/bui.css" rel="stylesheet">
    <link rel="stylesheet" href="http://localhost/xiangmu/css/index.css">
    <link rel="stylesheet" href="http://localhost/xiangmu/font/iconfont.css">
</head>
<body>
<script src="http://localhost/xiangmu/js/jquery.min.js"></script>
<div class="box">
    
    <form action="/kuangjia/behind/gradeUp" id="form_2">
    <div class="row">
        <div class="control-group">
            <label class="control-label">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号：</label>
            <input type="text"  name="studentNumber" class="control-text" value="${course.student.studentNumber}">
        </div>
    </div>
    <br>
    <div class="row">
        <div class="control-group">
            <label class="control-label">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：</label>
            <input type="text"  name="studentname" class="control-text" value="${course.student.studentname}">
        </div>
    </div>
     <br>
    <div class="row">
        <div class="control-group">
            <label class="control-label">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;课程编号：</label>
            <input type="text"  name="coursenumber" class="control-text" value="${course.coursenumber}">
        </div>
    </div>
     <br>
    <div class="row">
        <div class="control-group">
            <label class="control-label">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;课程名字：</label>
            <input type="text"  name="coursename" class="control-text" value="${course.coursename}">
        </div>
    </div>
     <br>
    <div class="row">
        <div class="control-group">
            <label class="control-label">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;成&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;绩：</label>
            <input type="text"  name="grade" class="control-text" value="${course.score.grade}">
        </div>
        
    </div>
     <br>
<%--      <input type="hidden" name="year" value="${years}"> --%>
<%--      <input type="hidden" name="term" value="${terms}"> --%>
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="修改">
     </form>
<!--     <div class="row"> -->
<!--         <div class="control-group"> -->
<!--             <label class="control-label"><s>*</s>URL：</label> -->
<%--             <input type="text"  name="url" class="control-text" value="${bannerEntity.url}"> --%>
<!--         </div> -->
<!--     </div> -->
<!--     <div class="row"> -->
<!--         <div class="control-group span18"> -->
<!--             <label class="control-label">显示顺序：</label> -->
<!--             <select class="sel3" id="orde" name="orde"> -->
<!--                 <option>0</option> -->
<!--                 <option>1</option> -->
<!--                 <option>2</option> -->
<!--             </select> -->
<!--         </div> -->
<!--     </div> -->
<!--     <div class="row"> -->
<!--         <label class="radio"> -->
<!--             是否启用： -->
<!--            <input type="radio" name="yes" id="yes" value="1" checked>是 -->
<!--             <input type="radio" name="yes" id="no" value="0" checked>否 -->
<!--         </label> -->
<!--     </div> -->
<!--     <div class="btn" id="submit"> -->
<!--         <span>添加</span> -->
<!--     </div> -->

</div>
</body>


</html>