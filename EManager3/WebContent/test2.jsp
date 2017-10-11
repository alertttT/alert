<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
	<meta name="keywords" >
	<meta name="description" >
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta http-equiv="Cache-Control" content="no-siteapp" />
    <title>首页</title>
    <link rel="stylesheet" href="common/css/p99.css" />
    <p class="p99">主页>商品管理>商品列表</p>
  </head>
  
  <body>
		<form action="addpro" method="get" >
		 <div id="test2_big">
				<table>
					<tr>
        <td class="td_1">商品名称</td>
        <td><input type="text" name="pro_name" value="安踏男装"/></td>
        </tr>
        
				<tr>
					<td class="td_1">所属类别</td>
				<td>
					<select class="select_value" name="region">
					<option value="1">衣服</option>
					<option value="2" >asdasdasdasdasda</option>
				</select>
				<select class="select_value">	
					<option value="1">休闲卫衣</option>
					<option value="2" >asdasdasdasdasda</option>
				</select>
				</td>
				</tr>
				
				<tr>
				<td class="td_1">货号</td>
					<td><input type="text" name="pro_no" />&nbsp;*</td>
				</tr>
				
				<tr>
					<td class="td_1">规格</td>
						<td>
					<select class="select_value" name="pro_spec">	
					<option value="1">衣服尺码</option>
					<option value="2">asdasdasdasdasda</option>
					</select>
					40,43,44,46,48</td>
				</tr>
				
				<tr>
					<td class="td_1" >上传照片</td>
				<td><input type="file" name="pro_img_src" /></td>
				</tr>
				
				<tr>
					<td class="td_1">商品价格</td>
				<td><input type="text" value="100" name="pro_price" />&nbsp;*</td>
				</tr>
				
				<tr>
					<td class="td_1">点击数</td>
				<td><input type="text" value="99" name="pro_hits" />&nbsp;*</td>
				</tr>
				<tr>
					<td class="td_1">是否推荐</td>
				<td ><input type="radio" name="pro_rem" value="1" checked="checked" />是
							<input type="radio" name="pro_rem" value="2" />否<td>
				</tr>
				
				<tr>
					<td class="td_1">是否特价</td>
				<td ><input type="radio" name="pro_tj" value="1" checked="checked" />是
							<input type="radio" name="pro_tj" value="2" />否</td>
				</tr>
				
				<tr>
					<td class="td_1">是否上线</td>
				<td ><input type="radio" name="pro_sx" value="1" checked="checked" />是
							<input type="radio" name="pro_sx" value="2" />否<td>
				</tr>
				
				<tr>
					<td class="td_1">商品详情</td>
				<td id="textarea">
					<textarea id="editor1" name="edit"></textarea>
				     <script src="ckeditor/ckeditor.js"></script>
  					 <script>
  							CKEDITOR.replace("editor1");
  					 </script>	
				</td>
				</tr>
				<tr>
				<td>
				<button>提交</button>
				</td>
				</tr>
				</table>
			</div>
		</form>
  </body>
</html>
