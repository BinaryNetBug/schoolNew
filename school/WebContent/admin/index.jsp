<%@page import="cn.com.entity.Admin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
 <head>
  <title>成都铁路学校后台管理系统</title>
   <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
   <link href="assets/css/dpl-min.css" rel="stylesheet" type="text/css" />
  <link href="assets/css/bui-min.css" rel="stylesheet" type="text/css" />
   <link href="assets/css/main-min.css" rel="stylesheet" type="text/css" />
   <%
   	Admin admin = (Admin)session.getAttribute("admin");
   	if(admin == null){
   		request.getRequestDispatcher("login.html").forward(request, response);
   	}
   	System.out.println(admin);
   %>
 </head>
 <body>

  <div class="header">
    <div class="dl-log">欢迎您，<span class="dl-log-user"><%=admin.getAdminName() %></span><a href="exitAdmin.action" title="退出系统" class="dl-log-quit">[退出]</a><a href="http://http://www.builive.com/" title="文档库" class="dl-log-quit">文档库</a>
    </div>
  </div>
   <div class="content">
    <div class="dl-main-nav">
      <div class="dl-inform"><div class="dl-inform-title">贴心小秘书<s class="dl-inform-icon dl-up"></s></div></div>
      <ul id="J_Nav"  class="nav-list ks-clear">
        <li class="nav-item dl-selected"><div class="nav-item-inner nav-home">首页</div></li>
      </ul>
    </div>
    <ul id="J_NavContent" class="dl-tab-conten">

    </ul>
   </div>
  <script type="text/javascript" src="assets/js/jquery-1.8.1.min.js"></script>
  <script type="text/javascript" src="./assets/js/bui.js"></script>
  <script type="text/javascript" src="./assets/js/config.js"></script>

  <script>
    BUI.use('common/main',function(){
      var config = [{
          id:'menu', 
          homePage : 'apply',//默认打开的页面
          //collapsed:true,//默认左侧菜单收缩
          menu:[{
              text:'报名留言信息查看',//一级菜单
              items:[
                {id:'apply',text:'报名信息',href:'main/applyList.html'},
                {id:'messageList',text:'留言信息',href:'main/messageList.html'}
              ]//二级菜单
            },{
              text:'文章管理',
              items:[
                {id:'articleList',text:'文章列表',href:'main/articleList.html'},
                {id:'insertArticle',text:'添加文章',href:'main/insertArticle.html'}  
              ]
            },{
              text:'专业管理',
              items:[
                {id:'resource',text:'专业信息',href:'main/majorList.html'},
                {id:'loader',text:'添加专业',href:'main/insertMajor.html'}  
              ]
            }]
          }];
      new PageUtil.MainPage({
        modulesConfig : config
      });
    });
  </script>
 </body>
</html>
