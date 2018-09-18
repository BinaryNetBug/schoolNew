<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>校园环境|成都高铁专业学校</title>
	<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="js/carousel.js"></script>
	<link rel="stylesheet" href="css/others.css">
	<link rel="stylesheet" href="css/float.css">
	<script type="text/javascript" src="js/float.js"></script>
	<script type="text/javascript" src="js/change.js"></script>
	<script type="text/javascript">
	function selectArticle(id){
		$.ajax({
			type:"post",
			url:"selectTypeArticle.action",
			data:{"article.type.typeId":id},
			success:function(data) {
				console.log(data);
				var str = "<div></div>";
				var articlelist = data.articleList;
				for(var i = 0;i<articlelist.length;i++){
					str+="<div class='aaa'><p style='text-align:center'><a href='javascript:void(0)' onclick='show("+articlelist[i].articleId+")' class='body_right_menu_content' id='mname'>"+articlelist[i].title+"</a></p><div class='aaa_div'><a href='javascript:void(0)' onclick='show("+articlelist[i].articleId+")' class='body_right_menu_content'><img src='/school"+articlelist[i].image+"' alt='' width='100%' height='100%'></a></div><br><a href='javascript:void(0)'  onclick='show("+articlelist[i].articleId+")' class='body_right_menu_content'>"+articlelist[i].intro+"</a></div>"
				}
				$(".body_right_content").html(str);
			}
		})
	}
	function show(id){
		$.ajax({
			type:"post",
			url:"selectOneArticle.action",
			data:"article.articleId="+id, 
			success:function(data) {
				console.log(data);
				var str2 = "<div></div>";
				var article = data.article;
				str2+="<div>"+article.context+"</div>"
				console.log(str2);
				$(".body_right_content").html(str2);
			}
		})
	};
	$(function(){
		selectArticle(11);
	})
	</script>
	<style type="text/css">
	.aaa{
		width: 200px;
		float: left;
		margin-left: 40px;
		margin-top:20px;
		font-size: 15px;
	}
	.aaa_div{
		padding:5px;
		border: 1px solid #BEBEBE;
		height:130px;
		width:180px;
		margin:0 auto;
	}
	.body_right_menu_content{
		text-decoration:none;
		color: #115970;
		font-size: 12px; 
	}
	.body_right_menu_content:hover{
		color: red;
	}
	#mname{
		font-weight: bold;
	}
	</style>
</head>
<body>
	<input type="hidden" id="message" value="<%=request.getParameter("articleId") %>">
	<input type="hidden" id="type" value="<%=request.getParameter("type") %>">
	<div class="top">
        <div class="logo">
            <span class="logoleft"><a href="http://www.sctlxx.com/"><img src="images/logo.png" alt="" title="成都高铁专业招生网" /></a></span>
            <span class="logoright"><a href=""><img src="images/logo_r.png" alt="" /></a></span>
        </div>
        <div class="daohang">
            <ul class="daohangul">
                <li><a href="index.html">学校首页</a></li>
                <li><a href="about.html">学校概况</a></li>
                <li><a href="news.jsp">学校新闻</a></li>
                <li><a href="major.jsp">专业设置</a></li>
                <li><a href="job.jsp">招生就业</a></li>
                <li><a href="culture.jsp">校园文化</a></li>
                <li><a href="environment.jsp">校园环境</a></li>
                <li><a href="message.html">报名留言</a></li>
                <li><a href="callWe.html">联系我们</a></li>
            </ul>
        </div>
        <!-- body -->
		<div class="body">
	        <div id="lunbo">
	            <ul class="luoboimg">
	                <li><a href=""><img src="images/20171221121441115.jpg" alt=""/></a></li>
	                <li><a href=""><img src="images/201792416555364889.jpg" alt=""/></a></li>
	                <li><a href=""><img src="images/2017924165451208390.jpg" alt=""/></a></li>
	                <li><a href=""><img src="images/2017924165430161836.jpg" alt=""/></a></li>
	            </ul>
	            <ul class="lunbodaohang">
	                <li class="shownumber color"></li>
	                <li class="shownumber"></li>
	                <li class="shownumber"></li>
	                <li class="shownumber"></li>
	            </ul>
	        </div>
	        <div class="notice">
	            <div class="gonggao">最新公告:</div>
	            <marquee class="marquee" behavior="scroll" direction="left" scrollamount="4" onmouseover="this.stop()"  onmouseout="this.start()"><p>《<strong><a href="">2018年招生简章</a></strong>》2018年招生预报名已经正式开始，需符合相关招生要求即可报读相关专业，详情观看《<strong><a href="">2018年招生简章</a></strong>》</p></marquee>
	        </div>
			<div class="body_left">
				<div class="body_left_menu">
					<p class="body_left_menu_title">校园环境</p>
					<p><a href="javascript:selectArticle(11)" class="body_left_menu_content">校园环境</a></p>
					<p><a href="javascript:selectArticle(12)" class="body_left_menu_content">实训基地</a></p>
					<p><a href="javascript:selectArticle(13)" class="body_left_menu_content">实践训练</a></p>
					<p class="body_left_menu_title">联系我们</p>
					<div class="contact_us">
						<ul>
							<a><li class="contact_us_one">132 8180 6252</li></a>
							<a><li class="contact_us_tow">132 8180 6252</li></a>
							<a href=""><li class="contact_us_three"></li></a>
							<a href=""><li class="contact_us_four" style="width: 200px;">点击查看 报名须知</li></a>
						</ul>
					</div>
				</div>
				<div class="body_left_box">
					<p><a href=""><img src="images/baoming.jpg" alt=""></a></p>
					<p><a href=""><img src="images/liuyan.jpg" alt=""></a></p>
				</div>
			</div>
			<div class="body_right">
				<p class="body_right_navigation">
					<span><a href="">首页</a></span> > 校园环境 >
					<span class="body_right_navigation_now">校园环境</span>
				</p>
				<div class="body_right_content"></div>
			</div>
			<div style="width: 1000px; background-color: #EAEAEA;padding: 15px 0; margin: 0;float: left;">
				<p style="text-align: center;font-size: 12px; line-height: 25px;" >
					<a href="" style="color: black;text-decoration: none;">成都铁路运输学校</a> 内设置了高铁乘务,铁路运输,铁路机车车辆检测与维修,铁路地勤安检,铁路轨道交通物流管理等专业,成都铁路学校,进修铁路专业的好学校
				</p>
	        	<p style="text-align: center; font-size: 12px; line-height: 25px;">
					咨询电话：<strong><span style="color:#ff0000;">13281806252&nbsp;</span>QQ：</strong><span style="color: rgb(255, 0, 0);"><strong>372353879</strong></span>&nbsp; 学校网站：<strong><span style="color:#ff0000;">www.sctlxx.com </span></strong>&nbsp; 学校地址：<span style="color:#ff0000;"><strong>成都市.郫县大学城</strong></span>
				</p>
				<p style="text-align: center; font-size: 12px; line-height: 25px;">
					<a href="" style="color: black;text-decoration: none;">成都铁路学校</a> &nbsp;版权所有 &nbsp; &nbsp;Chengdu high speed rail vocational school all rights reserved&nbsp;
				</p>
			</div>
		</div>
    </div>
    
    
    <div class="leftHangingbox">
        <div class="count">
            <div class="up"></div>
            <div class="qqlist">
                <div class="zixun">咨询电话</div>
                <div class="tel"><strong>132</strong><strong>8180</strong><strong>6252</strong></div>
                <div class="qqzixun">QQ在线咨询</div>
                <div class="qqzixun1">在线咨询</div>
                <div class="erweima">
                    <img src="images/qrcode.jpg" alt="" />
                </div>
                <a href="javascript:void(0)" class="dianwo">点我报名</a>
            </div>
            <div class="down"></div>
        </div>
        <a href="javascript:void(0)" class="baoming lbaoming"></a>
    </div>
    <div class="rightHangingbox">
        <div class="count" style="position:absolute;right:0px;">
            <div class="up"></div>
            <div class="qqlist">
                <div class="zixun">在线报名</div>
                <div class="qqlistname">
                    <p><span>*</span>你的姓名:</p>
                    <input type="text"  class="rightHangingboxaaa"/><span style="display:none">请输入姓名</span>
                </div>
                <div class="qqlistname">
                    <p><span>*</span>联系电话:</p>
                    <input type="text" class="rightHangingboxaaa" /><span style="display:none">请输入电话</span>
                </div>
                <div class="qqlistname" >
                    <p><span>*</span>通信地址:</p>
                    <input type="text" class="rightHangingboxaaa"/><span style="display:none">请输入地址</span>
                </div>
                <div class="qqlistname" >
                    <p><span>*</span>意向专业:</p>
                    <select name=""  class="rightHangingboxaaa">
                        <option value="">请选择专业</option>
                        <option value="高铁（和谐号）、动车乘务专业">高铁（和谐号）、动车乘务专业</option>
                        <option value="铁路运输/客运专业">铁路运输/客运专业</option>
                        <option value="铁道车辆运用与检修培养班"> 铁道车辆运用与检修培养班</option>
                        <option value="航空地勤服务专业">航空地勤服务专业</option>
                        <option value="航空空乘服务专业">航空空乘服务专业 </option>
                        <option value="铁路轨道运输物流专业">铁路轨道运输物流专业</option>
                    </select>
                    <span style="display:none">请选择专业</span>
                </div>
                <div class="qqlistname">
                    <p>其他说明:</p>
                    <input type="text" class="qqlistname_input" />
                </div>
                <div class="qqlistname qqlistbtn">
                    <input type="button" id="qqlistbtn"  value="提交申请"/>
                </div>
            </div>
            <div class="down"></div>
        </div>
        <a href="javascript:void(0)" class="baoming rbaoming" id="baoming"></a>
    </div>
    <div class="boying">
        <p>2018年春季高铁/铁路运输订单班招生面试已经开始，详询：13281806252请问有什么要咨询？</p>
        <div class="x"></div>
        <div class="zixun zixunone">稍后咨询</div>
        <div class="zixun zixuntwo">现在咨询</div>
    </div>
    <form action="">
        <div class="gaotiexi">
            <div class="jian"></div>
            <div class="top">请你留言</div>
            <div class="top1">
                <p>高铁系</p>
                <p>13281806252</p>
            </div>
            <div class="top2">
                <textarea name="" id="" cols="32" rows="7"placeholder="请在此输入留言内容，我们会尽快与您联系。（必填)"></textarea>
            </div>
            <div class="top3">
                <input type="text" placeholder="姓名（必填）" />
            </div>
            <div class="top4">
                <input type="text" placeholder="电话（必填）" />
            </div>
            <div class="top5">
                <input type="text" placeholder="地址（必填）" />
            </div>
            <div class="top6">
                <input type="text" placeholder="QQ（必填）" />
            </div>
            <div class="send"><input type="submit"  value="提交"/></div>
        </div>
        <div class="zuixiaohua">
            <span>请你留言</span>
            <div class="zuidahua"></div>
        </div>
        <div class="topleft">
            <div class="topleft1">
                <div class="topleft0"></div>
            </div>
            <div class="topleft2">
                <div class="topleft21">
                    <div class="topleft211"></div><span>高铁系宋老师</span>
                </div>
                <div class="topleft21">
                    <div class="topleft211"></div><span>高铁系王老师</span>
                </div>
            </div>
        </div>
    </form>
</body>
</html>