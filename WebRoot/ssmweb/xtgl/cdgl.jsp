<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>AdminLTE 2 | General Form Elements</title>
<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<!-- Bootstrap 3.3.7 -->
<link rel="stylesheet"
	href="<%=basePath%>skin/bower_components/bootstrap/dist/css/bootstrap.min.css">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="<%=basePath%>skin/bower_components/font-awesome/css/font-awesome.min.css">
<!-- Ionicons -->
<link rel="stylesheet"
	href="<%=basePath%>skin/bower_components/Ionicons/css/ionicons.min.css">
<!-- Theme style -->
<link rel="stylesheet"
	href="<%=basePath%>skin/dist/css/AdminLTE.min.css">
<!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
<link rel="stylesheet"
	href="<%=basePath%>skin/dist/css/skins/_all-skins.min.css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->

<!-- jQuery 3 -->
<script
	src="<%=basePath%>skin/bower_components/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script
	src="<%=basePath%>skin/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- FastClick -->
<script
	src="<%=basePath%>skin/bower_components/fastclick/lib/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="<%=basePath%>skin/dist/js/adminlte.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="<%=basePath%>skin/dist/js/demo.js"></script>
<script src="<%=basePath%>ssmweb/xtgl/cdgl.js" charset="utf-8" type="text/javascript"></script>
<script src="<%=basePath%>ssmweb/common/tsk.js" charset="utf-8" type="text/javascript"></script>
<title>菜单管理</title>
</head>
<body>
<input type="hidden" id="basePath" name="basePath" value="<%=basePath%>"/>
	<section class="content-header">
	
	<h1><i class="fa fa-list"></i> 菜单管理</h1>
	</section>

	<section class="content">
	<div class="box box-default">
		<form role="form">

			<div class="box-body">
				<div class="form-group">
					<label for="menu_name" class="col-sm-2 control-label">菜单名称</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="menu_name">
					</div>
				</div>
			</div>
			<div class="box-body">
				<div class="form-group">
					<label for="menu_jc" class="col-sm-2 control-label">菜单简称</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="menu_jc"
							placeholder="菜单名称小写首字母">
					</div>
				</div>
			</div>
			<div class="box-body">
				<div class="form-group">
					<label for="menu_url" class="col-sm-2 control-label">菜单路径</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="menu_url">
					</div>
				</div>
			</div>
			<div class="box-body">
				<div class="form-group">
					<label for="yx_bz" class="col-sm-2 control-label">有效标志</label>
					<div class="col-sm-10">
						<select id="yx_bz" name="yx_bz" class="form-control select2"
							style="width: 100%;">
							<option selected="selected" value="">---请选择---</option>
							<option value="0">有效</option>
							<option value="1">无效</option>
						</select>
					</div>
				</div>
			</div>
			<div class="box-body">
				<div class="form-group">
					<label for="xy_bz" class="col-sm-2 control-label">选用标志</label>
					<div class="col-sm-10">
						<select id="xy_bz" name="xy_bz" class="form-control select2"
							style="width: 100%;">
							<option selected="selected" value="">---请选择---</option>
							<option value="0">选用</option>
							<option value="1">不选用</option>
						</select>
					</div>
				</div>
			</div>
			<div class="box-body">
				<div class="form-group">
					<label for="cd_dj" class="col-sm-2 control-label">菜单等级</label>
					<div class="col-sm-10">
						<select id="cd_dj" name="cd_dj" class="form-control select2"
							style="width: 100%;">
							<option selected="selected" value="">---请选择---</option>
							<option value="1">一级菜单</option>
							<option value="2" onclick="">二级菜单</option>
						</select>
					</div>
				</div>
			</div>
			<div class="box-body">
				<div class="form-group">
					<label for="sjcd_dj" class="col-sm-2 control-label">上级菜单</label>
					<div class="col-sm-10">
						<select id="sjcd_dj" name="sjcd_dj" class="form-control select2"
							style="width: 100%;">
							<option selected="selected" value="">---请选择---</option>
						</select>
					</div>
				</div>
			</div>
			<div class="box-footer with-border" align="center">
				<button type="button" class="btn btn-primary" onclick="tj()">提交</button>
				<button type="reset" class="btn btn-default" style="margin-left:30px;">重置</button>
			</div>
		</form>
	</div>
	</section>
</body>
</html>