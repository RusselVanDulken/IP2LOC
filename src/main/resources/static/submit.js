function sumbit(){
        var ipinput = $("#ipinput").val();
        $.ajax({
                url:'http://localhost:8080/get/check',
                data:{
                    'ip':ipinput
                },
                type:'POST',
                success: function(kk){
                    console.log(kk);//控制台输出检查
                    var html = kk.data;
                    $("#result").html(html)
                }
            });
    }