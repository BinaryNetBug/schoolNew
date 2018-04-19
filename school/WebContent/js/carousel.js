$(function(){
        var height = parseInt($(".body_right").css("height"))-parseInt($(".body_left_menu").css("height"))+"px";
    console.log(height);
    parseInt($(".body_left_box").css("height")) > parseInt(height) ? 0 : $(".body_left_box").css("height",height);

    var  lunbo= $("#lunbo");//获取最外层框架
        showNumber = lunbo.find(".lunbodaohang li");//获取按钮
        var index =0;
        var timer = null;
        var  autoChange = setInterval(function(){
            if(index<showNumber.length-1){
                index++;
            }else{
                index=0;
            }//调用变换处理函数
            changeTo(index);
        }, 1500);
            $(".lunbodaohang").find('li').each(function(item){
                $(this).hover(function(){
                    clearInterval(autoChange);
                    changeTo(item);
                    index = item;
                },function(){
                    autoChange=setInterval(function(){
                        if(index<$(".luoboimg li").length-1){
                            index++;
                        }else{
                            index=0;
                        }
                        //调用变换处理函数
                        changeTo(index);
                    },1500);
                });
            });
    function changeTo(num){
        $(".luoboimg").find('li').fadeOut(0).eq(num).fadeIn(0);
        $(".lunbodaohang").find("li").removeClass("color").eq(num).addClass("color");
    }
})