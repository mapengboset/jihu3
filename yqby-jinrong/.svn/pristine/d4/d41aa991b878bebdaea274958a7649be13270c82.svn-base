<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>报价信息</title>
    <link rel="stylesheet" href="../wzBac/lib/layui/css/layui.css">
    <style>
        .wzListH1{
            padding:10px 0 20px 0;
            font-size: 26px;
            color: #333;
        }
    </style>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">

    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->

        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">
            <h1 class="wzListH1">报价信息开关</h1>
            <div class="layui-form">
	            <div class="layui-form-item">
	                 <label class="layui-form-label">开关-默认开</label>
		             <div class="layui-input-block">
		                <input type="checkbox" id="openTakeaway" lay-skin="switch" lay-filter="switchTest" lay-text="开|关">
		       		 </div>
          		 </div>
         	</div>
        </div>
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © layui.com - 底部固定区域
    </div>
</div>

<script src="../wzBac/js/jquery-3.2.1.min.js"></script>
<script src="../wzBac/js/common.js"></script>
<script src="../wzBac/lib/layui/layui.js"></script>
<script type="text/javascript">

layui.use(['form', 'layedit', 'laydate'], function(){
 	$.ajax({
	    type:"get"
	   ,url:"../manageWB/queryofferopen"
       ,dataType:"json"
       ,success:function(data){
      	 console.log(data.result.offerisopen);
      	  if(data.result.offerisopen == 1){//开启
      		
      		  $("#openTakeaway").attr("checked", "checked");
      		  form.render();
      	  }else{//关闭
      		  $("#openTakeaway").remove("checked");
      		 
      	  }
      	 
       }
})
	  var form = layui.form
	  ,layer = layui.layer
	  //监听提交
	  form.on('submit(demo1)', function(data){
	      layer.alert(JSON.stringify(data.field), {
	      title: this.checked
	    })
	    return false;
	  });
	  
	  form.on('switch(switchTest)', function(data){
		  $.ajax({
			      type:"get"
			     ,url:"../manageWB/offerisopen"
		         ,dataType:"json"
		         ,data:{"off":this.checked}
		         ,success:function(data){
		        	 console.log(data)
		        	  if(data.errorCode != 0){
		        		  
		        	  }else{
		        		  
		        	
		        	  }
		        	 
		        	 
		         }
		  })
	      
	});
});


</script>

</body>
</html>