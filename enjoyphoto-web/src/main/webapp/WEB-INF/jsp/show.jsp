<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <script src="../js/sea/sea.js"></script>
    <script type="text/javascript">
        seajs.use("../js/data/data.js");
        //$(function(){
        //	$("#test").click(function(){
        /* $.ajax({
         type:"POST",
         url:"../customer/insertCustomer.html",
         data:{id:5},
         dataType:"json",
         success:function(data){
         var temp = data;
         },
         error:function(msg){

         }
         }); */
        //		 var id="";
        //		 $.sendRequestFunction("customer","queryCustomerById",id);
        //	});
        //});
        /*$(document).ready(function(){
            $("#test").click(function(){
                alert(1);
            });
        });*/
    </script>
</head>
<body>
<h1>Restful</h1>
<form action="" id="myform" name="myform">
    登录名：<input id="loginName" name="loginName"/><p/>
    &nbsp;密码：<input type="password" id="password" name="passWord"/><p/>
    &nbsp;姓名：<input id="userName" name="userName"/><p/>
    &nbsp;手机：<input id="mobile" name="mobile"/><p/>
    &nbsp;邮箱：<input id="email" name="email"/><p/>
    <input type="button" id="test" value="create"/>
    <input type="button" id="test1" value="get"/>
    <input type="button" id="test2" value="delete"/>
    <input type="button" id="test3" value="post"/>
</form>
</body>
</html>