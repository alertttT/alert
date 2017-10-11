var news=[
{"shangpinmingcheng":"asd","suoshuleibie":"1","huohao":"001","shangchuantupian":"","shangpinjiage":"100","tejia":"on","xiangqing":"khjhk"},
{"shangpinmingcheng":"asd","suoshuleibie":"1","huohao":"001","shangchuantupian":"","shangpinjiage":"100","tejia":"on","xiangqing":"khjhk"},
{"shangpinmingcheng":"asds","suoshuleibie":"1","huohao":"001","shangchuantupian":"","shangpinjiage":"100","tejia":"on","xiangqing":"khjhk"},

{"shangpinmingcheng":"asd","suoshuleibie":"1","huohao":"001","shangchuantupian":"","shangpinjiage":"100","tejia":"on","xiangqing":"khjhk"},
{"shangpinmingcheng":"asd","suoshuleibie":"1","huohao":"001","shangchuantupian":"","shangpinjiage":"100","tejia":"on","xiangqing":"khjhk"},
{"shangpinmingcheng":"asd","suoshuleibie":"1","huohao":"001","shangchuantupian":"","shangpinjiage":"100","tejia":"on","xiangqing":"khjhk"},
{"shangpinmingcheng":"asd","suoshuleibie":"1","huohao":"001","shangchuantupian":"","shangpinjiage":"100","tejia":"on","xiangqing":"khjhk"},
{"shangpinmingcheng":"asd","suoshuleibie":"1","huohao":"001","shangchuantupian":"","shangpinjiage":"100","tejia":"on","xiangqing":"khjhk"},
{"shangpinmingcheng":"asd","suoshuleibie":"1","huohao":"001","shangchuantupian":"","shangpinjiage":"100","tejia":"on","xiangqing":"khjhk"}
	

];



function _shangpinliebiao(){
	
	var main=document.getElementById("main");//找到右侧的div
/*	var _img1=document.getElementById("_img1");
	_img1.innerHTML="商品管理→商品列表"
	if(main.style.display.match("none")){
		main.style.display="block";
	}else if(main.style.display.match("block")){
		main.style.display.match("none");
	}
	/*解决了无限建造的问题*/
	/*main.innerHTML="";*/
	
	
	for(var i=0;i<news.length;i++){
		
		/*循环创建一个div*/
		var _div=document.createElement("div");
		/*div起名id*/
		_div.setAttribute("id","_div"+i);
		/*div样式*/
		var _div_style=" width:100%;height:80px;box-shadow: 0 10px 10px 0 rgba(7,17,27,.1);padding: 10px; ";
		_div.setAttribute("style",_div_style);
		main.appendChild(_div);
		
		var _title_p=document.createElement("p");			
		var _p_title_text=document.createTextNode(news[i].shangpinmingcheng);
		/*传进来的P标签设置*/
		_title_p.setAttribute("style","display: inline; text-align: center;margin:60px;line-height: 80px;");
		_title_p.appendChild(_p_title_text);
		_div.appendChild(_title_p);
		var _title_p=document.createElement("p");			
		var _p_title_text=document.createTextNode(news[i].suoshuleibie);
		
		/*传进来的P标签设置*/
		_title_p.setAttribute("style","display: inline;text-align: center;margin:60px;line-height: 80px;");
		_title_p.appendChild(_p_title_text);
		_div.appendChild(_title_p);
		var _title_p=document.createElement("p");			
		var _p_title_text=document.createTextNode(news[i].huohao);
		/*传进来的P标签设置*/
		_title_p.setAttribute("style","display: inline;text-align: center;margin:60px;line-height: 80px;");
		_title_p.appendChild(_p_title_text);
		_div.appendChild(_title_p);
		var _title_p=document.createElement("p");			
		var _p_title_text=document.createTextNode(news[i].shangpinjiage);
		/*传进来的P标签设置*/
		_title_p.setAttribute("style","display: inline;text-align: center;margin:60px;line-height: 80px;");
		_title_p.appendChild(_p_title_text);
		_div.appendChild(_title_p);
		var _title_p=document.createElement("p");			
		var _p_title_text=document.createTextNode(news[i].tejia);
		/*传进来的P标签设置*/
		_title_p.setAttribute("style","display: inline;text-align: center;margin:60px;line-height: 80px;");
		_title_p.appendChild(_p_title_text);
		_div.appendChild(_title_p);
		var _title_p=document.createElement("p");			
		var _p_title_text=document.createTextNode(news[i].xiangqing);
		/*传进来的P标签设置*/
		_title_p.setAttribute("style","display: inline;text-align: center;margin:60px;line-height: 80px;");
		_title_p.appendChild(_p_title_text);
		_div.appendChild(_title_p);
	
	
}
}