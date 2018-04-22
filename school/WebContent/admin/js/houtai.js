/* 
* @Author: anchen
* @Date:   2018-03-30 15:20:45
* @Last Modified by:   anchen
* @Last Modified time: 2018-03-31 10:42:42
*/
$(function(){
    $(".use").click(function() {
        $(".user").toggle();
    });
    $(".art").click(function() {
        $(".article").toggle();
    });
    $(".adduser").click(function() {
            $(".body-right").attr({
                "src":'houtai/用户注册.html'
            });
            })
    $(".updateuser").click(function() {
        $(".body-right").attr({
            "src":'houtai/用户修改.html'
            });
    })
    $(".artlist").click(function() {
        $(".body-right").attr({
            "src":'houtai/文章列表.html'
            });
    })
     $(".addart").click(function() {
        $(".body-right").attr({
            "src":'houtai/文章添加.html'
            });
    })
      $(".updateart").click(function() {
        $(".body-right").attr({
            "src":'houtai/文章修改.html'
            });
    })
})