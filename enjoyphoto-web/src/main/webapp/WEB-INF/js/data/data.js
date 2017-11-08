define(function(require,exports,module){

    require("../jquery/jquery.min.js");

    $("#test").click(function(){

        $.ajax({
            type: "POST",
            url: "/webUser/user",
            //data: {loginName:$("#loginName").val()},
            data:$("#myform").serialize(),
            dataType: "json",

            success: function(data){
                var s = '';
                /*$('#resText').empty();   //清空resText里面的所有内容
                var html = '';
                $.each(data, function(commentIndex, comment){
                    html += '<div class="comment"><h6>' + comment['username']
                        + ':</h6><p class="para"' + comment['content']
                });
                $('#resText').html(html);*/
            }

        });
    });

    $("#test1").click(function(){

        var obj = {};
        $.ajax({
            type: "GET",
            url: "/webUser/user/"+1,
            //data: {loginName:$("#loginName").val()},
            //data: {userId:1},
            //contentType: "application/json;charset=utf-8",
            dataType: "json",

            success: function(data){
                var s = '';
            }

        });
    });

    $("#test2").click(function(){

        var obj = {};
        $.ajax({
            type: "POST",
            url: "/webUser/user",
            data: {"userId":1,"_method": "delete"},
            //contentType: "application/json;charset=utf-8",
            dataType: "json",

            success: function(data){
                var s = '';
            }

        });
    });

});