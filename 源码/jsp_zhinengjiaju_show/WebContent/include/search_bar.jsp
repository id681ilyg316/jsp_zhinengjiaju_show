<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="childNav">
	<div class="wrap">
		<ul class="clearfix">
		<!-- 	<li class="first"><a href="javascript:searchHot('哈士奇')">哈士奇</a></li>
			<li><a href="javascript:searchHot('柴犬')">柴犬</a></li>
			<li><a href="javascript:searchHot('中华田园犬')">中华田园犬</a></li>
			<li><a href="javascript:searchHot('泰迪犬')">泰迪犬</a></li>
			<li><a href="javascript:searchHot('藏獒')">藏獒</a></li>
			<li><a href="javascript:searchHot('田园猫')">田园猫</a></li>
			<li><a href="javascript:searchHot('波斯猫')">波斯猫</a></li>
			<li><a href="javascript:searchHot('加菲猫')">加菲猫</a></li> -->
			
			<li class="last"><input type="text" id="selectname"
				value="${search_words }" /><a href="javascript:selectname()">&nbsp;&nbsp;搜索</a></li>
			<c:if test="${commom_user ne null}">
			<li><a href="myindex.jsp">个人主页</a></li>
			</c:if>
			 
		</ul>


	</div>
</div>