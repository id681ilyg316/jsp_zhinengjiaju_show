<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>个人主页 - 智能家居店-网上家居店</title>
<link type="text/css" rel="stylesheet"
	href="/css/style.css" />
<script type="text/javascript"
	src="/scripts/function-manage.js"></script>
<script type="text/javascript"
	src="/scripts/calendar.js"></script>
</head>
<body>
	<c:if test="${ commom_user eq null }">
		<script>
		alert("请先登录！");
			window.location.href="
			/login.jsp";
		</script>

	</c:if>
	<div id="header" class="wrap">
		<div id="logo">
			<img src="/images/logo.gif" />
		</div>
		<div class="help">
			<a href="/">返回主页页面</a>
		</div>
		<div class="navbar">
			<ul class="clearfix">
				<c:choose>
					<c:when test="${empty selected_fid}">
						<li class="current"><a href="indexSelect">首页</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="indexSelect">首页</a></li>
					</c:otherwise>
				</c:choose>
			</ul>
		</div>
	</div>
	<div id="childNav">
		<div class="welcome wrap">亲爱的客户${name.EU_USER_ID}，您好。</div>
	</div>
	<div id="position" class="wrap">
		您现在的位置：<a href="myindex.jsp">智能家居店-网上家居店</a> &gt; 修改个人信息
	</div>
	<div id="main" class="wrap">

		<div class="main">
			<h2>修改用户</h2>
			<div class="manage">
				<form action="userModify" onsubmit="return check()">
					<input type="hidden" name="userStatus"
						value="${commom_user.EU_STATUS }" />
					<table class="form">
						<tr>
							<td class="field">用户名：</td>
							<td><input type="text" class="text" name="userName"
								value="${commom_user.EU_USER_ID }" readonly="readonly" /></td>
						</tr>
						<tr>
							<td class="field">姓名：</td>
							<td><input type="text" class="text" name="name"
								value="${commom_user.EU_USER_NAME }" /></td>
						</tr>
						<tr>
							<td class="field">密码：</td>
							<td><input type="text" class="text" name="passWord"
								value="${commom_user.EU_PASSWORD }" /></td>
						</tr>
						<tr>
							<td class="field">性别：</td>
							<td><input type="radio" name="sex" value="T"
								${commom_user.EU_SEX=='T' ? "checked" :""} />男 <input
								type="radio" name="sex" value="F"
								${commom_user.EU_SEX=='F' ? "checked" :""} />女</td>
						</tr>
						<tr>
							<td class="field">出生日期：</td>
							<td><input type="text" name="birthday"
								onfocus="c.showMoreDay = false;c.show(this);"
								value="${commom_user.EU_BIRTHDAY }" readonly="readonly" /></td>
						</tr>
						<tr>
							<td class="field">邮箱：</td>
							<td><input type="text" class="text" name="email"
								value="${commom_user.EU_EMAIL }" /></td>
						</tr>
						<tr>
							<td class="field">手机号码：</td>
							<td><input type="text" class="text" name="mobile"
								value="${commom_user.EU_MOBILE}" /></td>
						</tr>
						<tr>
							<td class="field">区域选择：</td>
							<td><select name="courty">
									<option value="中国大陆"
										<c:if test="${commom_user.EU_COURTY eq '中国大陆'}">selected</c:if>>中国大陆</option>
									<option value="港澳台"
										<c:if test="${commom_user.EU_COURTY eq '港澳台'}">selected</c:if>>港澳台</option>
									<option value="海外"
										<c:if test="${commom_user.EU_COURTY eq '海外'}">selected</c:if>>海外</option>
							</select></td>
						</tr>
						<tr>
							<td class="field">详细地址：</td>
							<td><input type="text" class="text" name="address"
								value="${commom_user.EU_ADDRESS }" /></td>
						</tr>
						<tr>
							<td class="field">兴趣爱好：</td>
							<td><input type="text" class="text" name="like"
								value="${commom_user.EU_LIKE }" /></td>
						</tr>

						<tr>
							<td></td>
							<td><label class="ui-blue"><input type="submit"
									name="submit" value="更新" /></label></td>
						</tr>

					</table>
				</form>
				<a href="selectdd?dd=${name.EU_USER_ID }">个人订单管理</a>
			</div>
		</div>
		<script>
			
		</script>
		<div class="clear"></div>
	</div>

	<%@ include file="/include/footer.jsp"%>
</body>
</html>
