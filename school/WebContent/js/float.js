$(function(){
	//悬框广告左边
    $(".lbaoming").click(function(){
    	left = parseInt($(".leftHangingbox").css("left"));
    	if(left == -129){
    		 $(".leftHangingbox").animate({
	            left: "0px"
	        });
	        $(".lbaoming").css({
	            'background-image':'url(images/kes.png)'
	        });
    	}else{
    		$(".leftHangingbox").animate({
	            left: "-129px"
	        });
	        $(".lbaoming").css({
	            'background-image':'url(images/baok.png)'
	        });
    	}  
    })
    //悬框广告右边
    $(".rbaoming").click(function(){
    	left = parseInt($(".rightHangingbox").css("right"));
    	if(left == -130){
    		 $(".rightHangingbox").animate({
	            right: "0px"
	        });
	        $(".rbaoming").css({
	            'background-image':'url(images/kes.png)'
	        });
    	}else{
    		$(".rightHangingbox").animate({
	            right: "-130px"
	        });
	        $(".rbaoming").css({
	            'background-image':'url(images/baok.png)'
	        });
    	}  
    })
    //位置始终不变 左边
    $(window).scroll(function(){

        var scrollTop = document.body.scrollTop || document.documentElement.scrollTop || 0;

        $(".leftHangingbox").stop();

        var scrollTop2 = (scrollTop+160) - $(".leftHangingbox").position().top;

        if(scrollTop> 440){

            $(".leftHangingbox:not(:animated)").animate({top:"+="+scrollTop2+"px"},1000);

        }else{

            $(".leftHangingbox").css("top",200+"px");

        }
    })
    //位置始终不变 右边
    $(window).scroll(function(){

        var scrollTop = document.body.scrollTop || document.documentElement.scrollTop || 0;

        $(".rightHangingbox").stop();

        var scrollTop2 = (scrollTop+160) - $(".rightHangingbox").position().top;

        if(scrollTop> 440){

            $(".rightHangingbox:not(:animated)").animate({top:"+="+scrollTop2+"px"},1000);

        }else{

            $(".rightHangingbox").css("top",200+"px");

        }
    })
    //中间广告
    setTimeout(function(){
        $(".boying").show();
    }, 3000)
    //关闭广告
    $(".x").click(function(){
        $(".boying").hide();
    })
    //稍后再说
    $(".zixunone").click(function(event) {
        $(".boying").hide();
    });
    //如果广告被关闭，过7秒自动打开
    setInterval(function(){
        if( $(".boying").hide()){
            $(".boying").show()
        }
    }, 60000)
    //现在咨询
    $(".zixuntwo").click(function() {
        $(".boying").hide();
        $(".gaotiexi").show();
    });
    //在线报名
    $(".rightHangingbox").find('#qqlistbtn').click(function(){
        for(var i=0;i<$(".rightHangingboxaaa").length;i++){
                  var ax = $(".rightHangingboxaaa").eq(i);
                if(ax.val()==""){
                  alert($(".rightHangingboxaaa").eq(i).siblings("span").eq(0).html());
                  break;
                }
            }
    })
    //最小化
    $(".jian").click(function(){
        $(".gaotiexi").hide();
        $(".zuixiaohua").show();
    })
    $(".zuidahua").click(function(event) {
        $(".gaotiexi").show()
        $(".gaotiexi").css({
            left: '1275px',
            top: '300px',
        });
    });
})