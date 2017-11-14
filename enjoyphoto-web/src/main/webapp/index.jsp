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
        <div class="header-label">enjoyphoto</div>
        <div class="index-table">
            <table>
                <tbody>
                <tr>
                    <td class="input-label-1">手机号或邮箱</td>
                    <td class="input-label-2" colspan="2">密码</td>
                </tr>
                <tr>
                    <td><input id="loginName" name="loginName" class="index-input-text"/></td>
                    <td><input type="password" id="passWord" name="passWord" class="index-input-text"/></td>
                    <td><input type="button" id="login" name="login" value="登录" class="index-input-button"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><a href="#">忘记账户？</a></td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>

    <div class="index-center">
        <div class="center-container">
            <div class="center-left">
                <div class="center-info">联系你我，分享生活，尽在 Enjoyphoto</div>
                <img src="/image/ig.png" alt="">
            </div>
            <div class="center-right">
                <h1>注册</h1>
                <div class="input-register">
                    <input id="userName" name="userName" placeholder="姓名"/>
                </div>
                <div class="input-register">
                    <input id="newLoginName" name="newLoginName" placeholder="手机号或邮箱"/>
                </div>
                <div class="input-register">
                    <input id="newPassWord" name="newPassWord" placeholder="创建密码"/>
                </div>
                <div class="bi-label">生日</div>
                <div class="bi-select-container">
                    <span class="bi-span">
                        <select class="bi-select" id="hi-year">
                            <option value="1995">1995</option>
                        </select>
                        <select class="bi-select" id="hi-month">
                            <option value="11">11月</option>
                        </select>
                        <select class="bi-select" id="hi-day">
                            <option value="13">13日</option>
                        </select>
                        <span class="bi-help"><a href="#">为什么需要提供生日信息？</a></span>
                    </span>
                </div>
                <div>
                    <span class="radio-span">
                        <input type="radio" name="sex" value="1"/>
                        <label class="radio-label">女</label>
                    </span>
                    <span>
                        <input type="radio" name="sex" value="2"/>
                        <label class="radio-label">男</label>
                    </span>
                </div>
                <div class="explain-text-container">
                    <p class="explain-p">
                        点击创建帐户，代表你同意我们的<a href="#" target="_blank" rel="nofollow">条款</a>，并已阅读了我们的
                        <a href="#">数据使用政策</a>，包括<a href="#">Cookie使用政策</a>。你可能会收到Enjoyphoto的短信通知，并可以随时退订。
                    </p>
                </div>
                <div class="create-button">
                    <button type="submit" class="webuser-submit button-1 mvm">创建账户</button>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>