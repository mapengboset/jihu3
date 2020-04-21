<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>店铺申请花呗记录</title>
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
            <h1 class="wzListH1">店铺申请记录</h1>
             <div class="layui-form-item">
                 <div class="layui-inline">
                    <label class="layui-form-label">店铺查找</label>
                    <div class="layui-input-inline" style="width: 120px;">
                        <input type="text" id="storeName" autocomplete="off" class="layui-input" >
                    </div>
                     <div class="layui-inline" >
                     <label class="layui-form-label">状态查找</label>
                     <div class="layui-input-block">
	                    <select id="statustype" lay-verify="required">
					        <option value=""></option>
					        <option value="1">成功</option>
					        <option value="-1">失败</option>
				      	</select>
      				</div>
      				</div>
                    <label class="layui-form-label">申请时间</label>
                    <div class="layui-input-inline">
                        <input type="text" class="layui-input" id="st" placeholder="开始时间">
                    </div>
                    <div class="layui-form-mid">-</div>
                    <div class="layui-input-inline">
                        <input type="text" class="layui-input" id="et" placeholder="结束时间">
                    </div>
                </div>
                 <div class="layui-inline">
                    <button class="layui-btn layui-btn-normal" onclick="search()">搜索</button>
                </div>
            </div>
            <table class="layui-hide" id="zcTable" lay-filter="zlcaozuo"></table>
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
<script>
   

    //JavaScript代码区域toolbar: '<div><a href="{{d.picUrl}}" target="_blank ">查看图片</a></div>'
    var arr = [ //标题栏
                 {field: 'id', title: '序号', width: 80, sort: true,templet:'#zizeng'}
                ,{field: 'storeName', title: '门店名称', Width: 40}
                ,{field: 'sellerNo', title: '支付宝账号',Width: 120}
                ,{field: 'orderNo', title: '订单号', width: 120}
                ,{field: 'phone', title: '联系方式', width: 120}
                ,{field: 'status', title: '审核状态',width:120,toolbar:'#issucc'}
                ,{field: 'createTime', title: '申请时间', sort: true}
                ,{field: 'reason', title: '失败原因'}
              
            ];
    function search(){
        var storeName = $("#storeName").val();
        var statustype = $("#statustype").val();
        var stime = $("#st").val();
        var etime = $("#et").val();
        layui.use(['element','table','laydate'], function(){
            var table = layui.table;
            var element = layui.element;
            var laydate = layui.laydate;
            
            laydate.render({
                elem: '#st'
            });
            laydate.render({
                elem: '#et'
            });
            table.render({
                elem: '#zcTable'
                ,cellMinWidth: 80 
                ,url:'../manageWB/stroreOpenOrder'    //全局定义常规单元格的最小宽度，layui 2.2.1 新增
                ,cols: [arr]
                ,where:{statustype:statustype,storeName:storeName,stime:stime,etime:etime}
//                ,skin: 'line' //表格风格
                ,even: true
                ,page: true //是否显示分页
                ,limits: [10, 20, 30]
                ,limit: 10 //每页默认显示的数量
            });
            //监听行单击事件（单击事件为：rowDouble）
           
        });
    }
   
    	
    layui.use(['element','table','laydate'], function(){
        var table = layui.table;
        var element = layui.element;
        var laydate = layui.laydate;
        
        
        laydate.render({
            elem: '#st'
        });
        laydate.render({
            elem: '#et'
        });
        table.render({
            elem: '#zcTable'
            ,cellMinWidth: 80 
            ,url:'../manageWB/stroreOpenOrder'    //全局定义常规单元格的最小宽度，layui 2.2.1 新增
            ,cols: [arr]
           // ,where:{name:company,stime:stime,etime:etime}
//            ,skin: 'line' //表格风格
            ,even: true
            ,page: true //是否显示分页
            //,limits: [5, 7, 10]
            ,limit: 10 //每页默认显示的数量
        });
        
    });
   
</script>
   
<script type="text/html" id="issucc">
        {{#if (d.status == 1) { }}
         <span>成功</span>
        {{# }else if(d.status == -1){ }}
        <span>失败</span>
         {{# }else if(d.status == 0){ }}
        <span>审核中</span>
        {{# } }}
       
</script>
<script type="text/html" id="zizeng">
    {{d.LAY_TABLE_INDEX+1}}
</script>
</body>
</html>