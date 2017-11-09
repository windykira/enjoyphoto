<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <%--<link href="/css/bootstrap/bootstrap.min.css" rel="Stylesheet" type="text/css">--%>
    <link href="/css/mycss/index.css" rel="Stylesheet" type="text/css">
</head>
<body>
<div class="enjoy-container">
    <div class="index-header">
        <table class="index-table">
            <tbody>
                <tr>
                    <td class="input-label-1">手机号或邮箱</td>
                    <td class="input-label-2" colspan="2">密码</td>
                </tr>
                <tr>
                    <td><input id="loginName" name="loginName" class="index-input-text"/></td>
                    <td><input type="password" id="passWord" name="passWord" class="index-input-text"/></td>
                    <td><input type="button" id="login" name="login" value="登录"/></td>
                </tr>
            </tbody>
        </table>
    </div>

    <div class="index-center">
        <div class="center-container">
            <div class="center-left oneline">
                <div class="center-info">联系你我,分享生活,尽在 Enjoyphoto</div>
                <img src="/image/ig.png" alt="">
            </div>
            <div class="center-right oneline">
                <input id="newLoginName" name="newLoginName" class=""/>
            </div>
        </div>
    </div>
</div>
</body>
</html>