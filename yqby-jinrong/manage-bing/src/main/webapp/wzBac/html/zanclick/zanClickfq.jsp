<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>分期费率</title>
    <link rel="stylesheet" href="../wzBac/lib/layui/css/layui.css">
    <style>
        .wzListH1{
            padding:10px 0 20px 0;
            font-size: 26px;
            color: #333;
        }
        .cityBox{
        position: fixed; pointer-events: auto;top: 19%;
    left: 30%;
    width: 500px;
    height: 400px;
         overflow-y:auto;
        z-index:1001;
       background:#fff;
       padding:15px;
       border-radius:8px;
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
        <div style="padding: 15px;" class="layui-form">
            <h1 class="wzListH1">热门城市</h1>
            <div class="layui-form-item">
            <button class="layui-btn addhotcity">添加分期费率</button>
                
            <!--      <div class="layui-inline" >
	                    <label class="layui-form-label">城市</label>
	                    <div class="layui-input-inline" style="width: 120px;">
	                        <input type="text" id="cityname" autocomplete="off" class="layui-input" >
	                    </div>
	                </div>
	                <div class="layui-inline">
	                    <button class="layui-btn layui-btn-normal" onclick="search()">搜索</button>
	                </div> -->
            <table class="layui-hide" id="wzTable" lay-filter="testcity"></table>
            <script type="text/html" id="barDemo">
           <button class="layui-btn layui-btn-xs "  lay-event="edit">修改</button>
	</script>
        </div>
    </div>
	<div class="layui-layer-shade cityOver"  style="z-index: 1000; background-color: rgb(0, 0, 0); opacity: 0.3;position: fixed; pointer-events: auto;top: 0;left: 0; width: 100%;height: 100%;display:none;"></div>
   <form class="layui-form"  lay-filter="priceBoxBody">
    <input type="hidden"  name="myid" id="hotid">
    <div class="cityBox layui-form" style="display:none;">
    <div class="layui-form-item">
      <h1 class="">费率</h1>
    </div>
     	
 	 
    	<div class="layui-form-item">
		    <div class="layui-inline">
		      <label class="layui-form-label">不分期:</label>
		      <div class="layui-input-inline">
		        <input type="tel" name="fq" id="fq" lay-verify="number" autocomplete="off" class="layui-input">
		      </div>
		    </div>
		     <div class="layui-inline">
		      <label class="layui-form-label">分6期:</label>
		      <div class="layui-input-inline">
		        <input type="text" name="fq6" id="fq6" lay-verify="number" autocomplete="off" class="layui-input">
		      </div>
		    </div>
		     <div class="layui-inline">
		      <label class="layui-form-label">分12期:</label>
		      <div class="layui-input-inline">
		        <input type="text" name="fq12" id="fq12" lay-verify="number" autocomplete="off" class="layui-input">
		      </div>
		    </div>
		     <div class="layui-inline">
		      <label class="layui-form-label">分24期:</label>
		      <div class="layui-input-inline">
		        <input type="text" name="fq24" id="fq24" lay-verify="number" autocomplete="off" class="layui-input">
		      </div>
		    </div>
		    
		 
  		</div>
  		 <div class="layui-form-item">
              <div class="layui-input-block">
             <button class="layui-btn subhotcity" lay-submit lay-filter="formDemo">立即提交</button>
              <button type="reset" class="layui-btn layui-btn-primary">重置</button> 
             </div>
  </div>
    </div>
</form>
    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © layui.com - 底部固定区域
    </div>
</div>
<script src="../wzBac/js/jquery-3.2.1.min.js"></script>
<script src="../wzBac/js/common.js"></script>
<script src="../wzBac/lib/layui/layui.js"></script>
<script>
 

    //JavaScript代码区域
    var arr = [ //标题栏
                 {field: 'sid', title: '序号', width: 80, sort: true,templet:'#zizeng'}
                ,{field: 'fq', title: '不分期'}
                ,{field: 'fq6', title: '分期(6)'}
                ,{field: 'fq12', title: '分期(12)'}
                ,{field: 'fq24', title: '分期(24)'}
                ,{field: 'temp', title: '操    作',toolbar: '#barDemo'}
               
            ];
    function search(){
    	
    	var cityname = $("#cityname").val();
         layui.use(['element','table','laydate'], function(){
            var table = layui.table;
            var element = layui.element;
            table.render({
                elem: '#wzTable'
                ,cellMinWidth: 80 
                ,url:'../manageWB/zanClickfq'//全局定义常规单元格的最小宽度，layui 2.2.1 新增
                ,cols: [arr]
                ,where:{city:cityname}
//              ,skin: 'line' //表格风格
                ,even: true
                ,page: true //是否显示分页
              //,limits: [5, 7, 10]
                ,limit: 10 //每页默认显示的数量
            });
            //监听行单击事件（单击事件为：rowDouble）
           
        }); 
    }
   
   
    layui.use(['element','table','laydate','layer'], function(){
    	var layer = layui.layer;
        var form = layui.form;
        var table = layui.table;
        var element = layui.element;
       
        table.render({
             elem: '#wzTable'
            ,cellMinWidth: 80 
             ,url:'../manageWB/zanClickfq'   //全局定义常规单元格的最小宽度，layui 2.2.1 新增
            ,cols: [arr]
           // ,where:{name:company,stime:stime,etime:etime}
//            ,skin: 'line' //表格风格
            ,even: true
            ,page: true //是否显示分页
            //,limits: [5, 7, 10]
            ,limit: 10 //每页默认显示的数量
        });
        //监听行单击事件（单击事件为：rowDouble）
      	$('.addhotcity').click(function(){
      		$("#offerid").val("");
      		$('.cityBox').show();
      		$('.cityOver').show();
      		
      	});
      
      	 //监听行工具事件
        table.on('tool(testcity)', function(obj){ //注：tool 是工具条事件名，test 是 table 原始容器的属性 lay-filter="对应的值"
          var data = obj.data //获得当前行数据
          ,layEvent = obj.event; //获得 lay-event 对应的值
          if(layEvent === 'detail'){
            layer.msg('查看操作');
          } else if(layEvent === 'edit'){
        	   $('.cityBox').show();
        		$('.cityOver').show();
      	  form.val("priceBoxBody", {
      		   "fq": data.fq,// "name": "value"
      		   "fq6":data.fq6,
      		    "fq12":data.fq12,
      		    "fq24":data.fq24
      		
      		})
              
          } 
        });
      
        
        //监听提交
      /*   form.on('submit(formDemo)', function(data){
          layer.msg("成功");
          // console.log(data);"D:/ma/项目/xiangmu/项目/haosha/work22/gym/gym-data/src/main/java/com/hiko/gym/data/service/DataServiceImpl.java"
          return true;
        }); */
        
        //监听行单击事件（单击事件为：rowDouble）
      	$('.subhotcity').click(function(){
      		var 	url = null;
      		var fq = $("#fq").val();
      		var fq6 = $("#fq6").val();
      		var fq12 = $("#fq12").val();
      		var fq24 = $("#fq24").val();
      		if(fq == null || fq6 == null || fq12 == null || fq24 == null){
      		  layer.msg("费率不能为空,请填写");
      			return false;
      		}
      		 $.ajax({
        	     type:"post"
        	     ,url:"../manageWB/apendzanClickfq"
                 ,dataType:"json"
                 ,data:{fq0:fq,fq6:fq6,fq12:fq12,fq24:fq24}
                 ,success:function(data){
                	 console.log(data);
                	  if(data.errorCode != 0){
                		  layer.msg(data.errorMessage);
                	  }else{
                		  layer.msg("成功");
                		  $('.cityBox').hide();
                    	  $('.cityOver').hide();
                //	 form.render();//需要渲染一下
                    	  window.location.reload();
                	  }
                	 
                 }
          })	
      	});

      	$('.cityOver').click(function(){
      		$('.cityBox').hide();
      		$('.cityOver').hide();
      		
      	});
      
      	
    });

</script>
	<script type="text/html" id="zizeng">
    {{d.LAY_TABLE_INDEX+1}}
	</script>
	
	
</body>
</html>