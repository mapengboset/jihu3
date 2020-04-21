<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>申请退款记录</title>
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
            <h1 class="wzListH1">申请退款</h1>
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
                ,{field: 'outTradeNo', title: '订单号',Width: 40}
                ,{field: 'refundFee', title: '退款金额', width: 120}
                ,{field: 'buyerLogonId', title: '退款账号', width: 120}
                ,{field: 'gmtRefundPay', title: '退款时间', minWidth: 100, sort: true}
                ,{field: 'fundChange', title: '退款状态', Width: 50,toolbar:'#issucc'}
               
            ];
    function search(){
    	var company=$("#company").val();
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
                ,url:'../manageWB/alreadyRefundList'    //全局定义常规单元格的最小宽度，layui 2.2.1 新增
                ,cols: [arr]
                ,where:{name:company,stime:stime,etime:etime}
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
            ,url:'../manageWB/alreadyRefundList'    //全局定义常规单元格的最小宽度，layui 2.2.1 新增
            ,cols: [arr]
           // ,where:{name:company,stime:stime,etime:etime}
//            ,skin: 'line' //表格风格
            ,even: true
            ,page: true //是否显示分页
            //,limits: [5, 7, 10]
            ,limit: 10 //每页默认显示的数量
        });
        
        
        //监听行单击事件（单击事件为：rowDouble）
     	 //监听行工具事件
        
        
        
        
    });
   
</script>

<script type="text/html" id="issucc">
        {{#if (d.fundChange == "Y") { }}
         <span>退款成功</span>
        {{# }else{ }}
        <span>退款失败</span>
        {{# } }}
       
</script>
<script type="text/html" id="zizeng">
    {{d.LAY_TABLE_INDEX+1}}
</script>
</body>
</html>