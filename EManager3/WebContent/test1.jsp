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
   
    <script src="common/js/js.js"> 
    
    </script>
 
  </head>
  
  <body onload="_shangpinliebiao()">
  <div id="p_99"><p class="p99"> 你的位置:商品管理</p></div>
   <div id="button_div">
   	<button id="button_add" class="button_on" onclick="test2.jsp">添加</button>
   	<button id="button_delete" class="button_on">删除</button>
   	<button id="button_recycle" class="button_on">回收站</button>
   	<input  id="check_article" value="商品编号/名称"></input>
   	<button>搜索</button>
   </div>
   <div id="test1_big">
   	<div id="list_across_div" style="width: 100%;height: 110px;">
   	
   	 <input type="checkbox" id="checkbox1" ></input>
   	 <span id="span">
   	 	
   	 
   	 	<ul id="list_across">
   		<li class="list_across_li">编号</li>
   		<li class="list_across_li">名称</li>
   		<li class="list_across_li">库存</li>
   		<li class="list_across_li">上架</li>
   		<li class="list_across_li">排序</li>
   		<li class="list_across_li">操作</li>
   		</ul>
   		</span>
  
   	</div>
   	<div id="main" style="width: 100% ; height: 700px;" >
   
   	</div>
   	
   	
   	
   </div>
  </body>
</html>
