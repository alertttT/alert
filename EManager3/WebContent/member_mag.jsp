<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<link rel="stylesheet" href="css/member_mag.css" />
	<body>
		<form>
			<div style="margin-top: 40px;"></div>
			<div style="width: 70%;margin: 0px auto;">
			<input type="button" value="按消费日期排序" style="cursor: pointer;" />
			<input type="button" value="按订单总数排序" style="cursor: pointer;" />
			<input type="button" value="按消费金额排序" style="cursor: pointer;" />
			</div>
			<div style="margin-top: 5px;"></div>
			<table>
				<tr style="background-color: aliceblue;color: black;font-weight: bold;">
					<td>会员ID</td>
					<td>用户名</td>
					<td>已完成订单金额</td>
					<td>已完成订单总数</td>
					<td>最近消费</td>
					<td>操作</td>
				</tr>
				
				
				<tr>
					<td>996</td>
					<td>asdasdsadASdqwe</td>
					<td>0.01</td>
					<td>10</td>
					<td>2014-04-23 08:30:23</td>
					<td><a href="#"> 修改 </a><img src="img/upd.gif" width="14px" height="14px"/><a href="#"> 删除 </a><img src="img/del.gif" width="14px" height="14px"/></td>
				</tr>
			</table>
		</form>
	</body>
</html>
