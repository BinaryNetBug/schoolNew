<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../../js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="../ueditor/ueditor.config.js"></script>
<script type="text/javascript" src="../ueditor/ueditor.all.min.js"></script>
</head>
<body>
	<form action="updateArticle.action" method="post">
		<input type="hidden" id="articleId" name="article.articleId" value="<%=request.getParameter("articleId") %>">
		<p>标题：<input type="text" name="article.title" id="title"></p>
		<p>作者：<input type="text" name="article.author" id="author"></p>
		<p>类型：<select name="article.type.typeId" id="type">
		</select></p>
		<p>导读：<textarea name="article.intro" id="intro" cols="20" rows="5"></textarea></p>
		<p>缩略图：<img src="" alt="未选择图片" id="image"><input type="file" style="display: none" id="upload"><input type="hidden" name="article.image" id="articleImage"></p>
		<p>内容：<script id="editor" type="text/plain" style="width:830px;height:300px;"></script><input type="hidden" id="context" name="article.context"></p>
		<p><input type="submit" value="修改文章"></p>
	</form>
</body>
<script type="text/javascript">
$(function() {
	var toolbars = [[
    'emotion', //表情
    '|',
	'undo',//撤销
	'redo',//重做
	'|',
    'fontfamily', //字体
    'fontsize', //字号
	'bold',//加粗
	'indent',//首行缩进
	'italic',//斜体
	'underline',//下划线
    'forecolor', //字体颜色
    'backcolor', //背景色
	'|',
	'formatmatch',//格式刷
    'removeformat', //清除格式
	'pasteplain', //纯文本粘贴模式
    'selectall', //全选
    'link', //超链接
    'unlink', //取消链接
    'simpleupload', //单图上传
    'justifyleft', //居左对齐
    'justifyright', //居右对齐
    'justifycenter', //居中对齐
    'justifyjustify', //两端对齐
    '|',
	'insertorderedlist', //有序列表
	'insertunorderedlist', //无序列表
	'imagecenter'],[ //居中
	'inserttable', //插入表格
	'edittable', //表格属性
    'edittd', //单元格属性
    'insertrow', //前插入行
    'insertcol', //前插入列
    'mergeright', //右合并单元格
    'mergedown', //下合并单元格
    'deleterow', //删除行
    'deletecol', //删除列
    'splittorows', //拆分成行
    'splittocols', //拆分成列
    'splittocells', //完全拆分单元格
    'deletecaption', //删除表格标题
    'inserttitle', //插入标题
    'mergecells', //合并多个单元格
    'deletetable', //删除表格
	]];
	var ue = UE.getEditor('editor',{
		toolbars:toolbars,//工具栏
		elementPathEnabled:false//元素路径
	});
    var context = document.getElementById('context');
	ue.addListener("selectionchange",function(){
        context.value = ue.getContent();
	})

	$("#image").click(function(){
		$("#upload").click();
	});

	//上传文件
	$("#upload").change(function(){
		var formData = new FormData();
		formData.append("image",$("#upload")[0].files[0]);
		$.ajax({
			url:"uploadImageArticle.action",
			type:"post",
			data:formData,
			contentType:false,
			processData:false,
			success:function(data) {
				$("#image").attr("src","../../images/"+data.imageFileName);
				$("#articleImage").val("/images/"+data.imageFileName);
			}
		});
	});

	//获取类型
	$.get("selectType.action",function(data){
		var type = data.typeList;
		var str = "<option value=''>请选择</option>";
		for(var i = 0;i < type.length;i++){
			str += '<option value="'+type[i].typeId+'">'+type[i].typeName+'</option>';
		}
		$("#type").html(str);
	}); 
	
	$.post("selectOneArticle.action",{"article.articleId":$("#articleId").val()},function(data){
		var article = data.article;
		console.log(article);
		$("#title").val(article.title);
		$("#author").val(article.author);
		$("#type option[value='"+article.type.typeId+"']").attr("selected","selected");
		$("#intro").val(article.intro);
		$("#image").attr("src",article.image);
		$("#articleImage").val(article.image);
		ue.addListener("ready",function(){
			ue.setContent(article.context);
		});
	})
})
</script>
</html>