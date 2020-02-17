<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html >
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>首页 - GirlInfo</title>

	<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">
	<link rel="shortcut icon" href="img/figure.png">

</head>
<body>
<nav class="navbar navbar-inverse navi navbar-fixed-top">
	<div class="container-fluid">
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li class="active">
					<a style="margin-left: 50px"  href="/index">首页<span class="sr-only">(current)</span></a></li>
				<li><a href="design">设计表单</a></li>
				<li><a href="search">搜索表单</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<c:choose>
					<c:when test="${empty loginUser}">
						<li ><a  href="login}">登录</a></li>
						<li ><a href="register}">注册</a></li>
					</c:when>
					<c:otherwise>
						<li ><p>欢迎您</p></li>
						<li><p>${loginUsergetUsername()}</p></li>

						<li class="dropdown">
							<a href="#" style="margin-right: 40px" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">我的<span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="myform}">我的表单</a></li>
								<li><a href="exit}">退出登录</a></li>
							</ul>
						</li>
					</c:otherwise>
				</c:choose>
			</ul>
		</div><!-- /.navbar-collapse -->
	</div><!-- /.container-fluid -->
</nav>
<div class="jumbotron jumback">
	<div class="container">
		<div class="row">
			<div style="margin-top: 10px"><img src="img/logo.png"/></div>
		</div>
		<div class="row">
			<div class="col-md-6">
				<h2>极简在线表单设计与信息采集工具</h2>
			</div>

			<div class="col-md-2 col-md-offset-1">
				<a class="btn btn-primary btn-lg" href="design" role="button">
					设计表单&nbsp;<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
				</a>
			</div>
			<div class="col-md-1 col-md-offset-0">
				<a class="btn btn-primary btn-lg" href="search" role="button">
					搜索表单&nbsp;<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
				</a>
			</div>
		</div>



	</div>
</div>
<div class="main_nav_bottom">
	<nav  class="navbar navbar-inverse navbar-fixed-bottom">
		<div  class="container" align="center">
			<style>
				.nav-tabs
				{
					text-align: center;
					height: 40px;
					line-height: 40px;
				}
			</style>
			<ul class="nav nav-tabs nav-tabs-justified">
				<div class="row" align="center">
					<div class="col-md-4 col-sm-4 col-xs-4" align="center">
						<li><p><a style="text-decoration: none;color: #9d9d9d" target="_blank" href="https://mylover.cc">联系作者</a></p></li></div>
					<div class="col-md-4 col-sm-4 col-xs-4" align="center"><li><p>© <span id="year"></span> mylover.cn</p></li></div>
					<div class="col-md-4 col-sm-4 col-xs-4" align="center"><li><p>华ICP备123456789号</p></li></div>
				</div>
			</ul>
		</div>
	</nav>
</div>




<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>

<script>
	//关闭click.bs.dropdown.data-api事件，使顶级菜单可点击
	$(document).off('click.bs.dropdown.data-api');
	//自动展开
	$('.nav .dropdown').mouseenter(function(){
		$(this).addClass('open');
	});
	//自动关闭
	$('.nav .dropdown').mouseleave(function(){
		$(this).removeClass('open');
	});

	var mydate = new Date();
	$('#year').text(mydate.getFullYear());
</script>
</html>