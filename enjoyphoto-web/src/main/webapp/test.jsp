<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <%--<link href="/css/bootstrap/bootstrap.min.css" rel="Stylesheet" type="text/css">--%>
    <link href="/css/mycss/index.css" rel="Stylesheet" type="text/css">
    <script src="/js/sea/sea.js"></script>
    <script type="text/javascript" src="/js/jquery/jquery.min.js"></script>
    <script type="text/javascript">

        //倒计时30秒
        var i = 15;
        function remainTime() {
            if (i > 0) {
                //i--;
                $("#endTime").text(i--);
                setTimeout("remainTime()", 1000);

            }
            if (i == 0) {
                $("p").text("活动开始");
                $("p").css("background-color", "yellow");
                //倒计时结束，按钮状态改为可用
                document.getElementById("btn").disabled = false;
            }

        }
        remainTime();

        //点击按钮触发的方法
        function func() {
            alert("恭喜你抢到一个月饼");
        }
    </script>
</head>
<body>
<div>
    <p>
        活动倒计时<strong id="endTime"></strong>秒！
    </p>
    <input type="button" id="btn" value="立即购买" disabled="disabled" onClick="func()"/>
</div>
</body>
</html>