<div v-wechat-title="$route.meta.title"></div>
<template>
	<div class="boxbg">
		<!-- <div class="topt">机呼联盟</div> -->
		<div class="pad">
			<div class="swipe-wrapper">
				<mt-swipe :auto="4000" :continuous='true' >
				  <mt-swipe-item v-for='(item,index) in bannerBox' :key='index'><img :src="item.imgUrl" /></mt-swipe-item>
				</mt-swipe>
			</div>
			<div class="title">实用工具</div>
			<img src="../../assets/images/iad.png" class="imgad" @click='myOrder' />
			<div class="title">拉新专区</div>
			<div class="cbox">
				<Icon txt='快下' @bott='gotoKx'>
					<img src="../../assets/images/i1.png" slot='act' />
				</Icon>
				<Icon txt='支付宝'  @bott='gotoZfb'>
					<img src="../../assets/images/i2.png" slot='act' />
				</Icon>
				<Icon txt='淘宝'  @bott='gotoTb'>
					<img src="../../assets/images/i3.png" slot='act' />
				</Icon>
				<Icon txt='京东金融'  @bott='gotoJdjr'>
					<img src="../../assets/images/i4.png" slot='act' />
				</Icon>
				<Icon txt='百度'  @bott='gotoBd'>
					<img src="../../assets/images/i5.png" slot='act' />
				</Icon>
				<Icon txt='云闪付'  @bott='gotoYsf'>
					<img src="../../assets/images/i6.png" slot='act' />
				</Icon>
				<Icon txt='美团外卖'  @bott='gotoMt'>
					<img src="../../assets/images/i7.png" slot='act' />
				</Icon>
				<Icon txt='京东'  @bott='gotoJd'>
					<img src="../../assets/images/i8.png" slot='act' />
				</Icon>
				<Icon txt='一淘'  @bott='gotoYt'>
					<img src="../../assets/images/i9.png" slot='act' />
				</Icon>
			</div>
			</div>
		</div>
</template>
<script>
	import Icon from '../../components/icon'
	export default{
		data:function(){
			return {
				index: 0,
				arr: [
					{title: '耿爽介绍，目前中美两国工作团队正在围绕会晤的准备工作保持着密切沟通，我们希望美方能同中方。', ximg: 'https://f10.baidu.com/it/u=2987595138,4271236850&fm=72', xs: '6120', xtime: '10'},
					{title: '耿爽介绍，目前中美两国工作团队正在围绕会晤的准备工作保持着密切沟通，我们希望美方能同中方。', ximg: 'https://f10.baidu.com/it/u=765686064,1077157424&fm=72', xs: '1320', xtime: '150'},
					{title: '耿爽介绍，目前中美两国工作团队正在围绕会晤的准备工作保持着密切沟通，我们希望美方能同中方。', ximg: 'https://f11.baidu.com/it/u=3699489413,3855986846&fm=72', xs: '5620', xtime: '36'},
				],
				bannerBox: [],
				addMap: '',
				token: 'xV/VnzzCnmZ9XvlcfhMmSugU9iPpkkxJlCx%2BsJjr5pppAfnxSCLuPorai7TcLwlM0Kn2ye5g99mRRUiO0Rijqw==d12cpy/a8iHhJ%2Bz3zccpMiOIacoFyr86eE5FfQ6tm4BzAI8/CVM15avHjA==',
				version: '1.0.0',
				appChannel: '2',
			}
		},
		components: {
			Icon,
		},
		created: function(){
			this.$router.push('/')
			if(!localStorage.getItem('token')){
				this.$router.push('./login')
			}else{
				this.token = localStorage.getItem('token')
			}
			if(location.hostname=='localhost'){
				this.addMap = 'http://jhtest.yqbing.com'
			}else if(location.hostname == 'http://jhtest.yqbing.com' ){
				this.addMap = 'http://jhtest.yqbing.com'
			}else{
				this.addMap = 'http://jhtest.yqbing.com'
			}
			this.getBanner()

		},
		methods:{
			//快下
			gotoKx:function(){
				location.href= this.addMap + '/page/mobilePage/html/kxPage/kxUpdate.html?token='+this.token+'&version='+this.version+'&appChannel='+this.appChannel
			},
			//支付宝
			gotoZfb:function(){
				location.href= this.addMap + '/page/mobilePage/html/taobaoPage/taobaoUpdate.html?token='+this.token+'&version='+this.version+'&appChannel='+this.appChannel
			},
			//淘宝
			gotoTb:function(){
				location.href= this.addMap + '/page/mobilePage/html/taobaoPage/taobaoUpdate.html?token='+this.token+'&version='+this.version+'&appChannel='+this.appChannel
			},
			//京东金融
			gotoJdjr:function(){
				location.href= this.addMap + '/page/mobilePage/html/jdPage/jdUpdate.html?token='+this.token+'&version='+this.version+'&appChannel='+this.appChannel
			},
			//百度
			gotoBd:function(){
				location.href= this.addMap + '/page/mobilePage/html/baiduPage/baiduUpdate.html?token='+this.token+'&version='+this.version+'&appChannel='+this.appChannel
			},
			//云闪付
			gotoYsf:function(){
				location.href= this.addMap + '/page/mobilePage/html/yunPage/yunUpdate.html?token='+this.token+'&version='+this.version+'&appChannel='+this.appChannel
			},
			//美团
			gotoMt:function(){
				location.href= this.addMap + '/page/mobilePage/html/mtPage/mtUpdate.html?token='+this.token+'&version='+this.version+'&appChannel='+this.appChannel
			},
			//京东
			gotoJd:function(){
				location.href= this.addMap + '/page/mobilePage/html/jdPage/jdUpdate.html?token='+this.token+'&version='+this.version+'&appChannel='+this.appChannel
			},
			//一淘
			gotoYt:function(){
				location.href= this.addMap + '/page/mobilePage/html/ytPage/ytUpdate.html?token='+this.token+'&version='+this.version+'&appChannel='+this.appChannel
			},
			//我的账单
			myOrder:function(){
				location.href= this.addMap + '/page/mobilePage/html/newMyStandard/myStandardIndex.html?token='+this.token
			},
			getBanner:function(){
				let postData = '{"token":"'+ this.token +'","version":"'+this.version+'","appChannel":"'+this.appChannel+'"}';
				this.$axios({
				    method: 'post',
				    url:'/queryIndexBannerH5.do?data='+postData,
				}).then((res)=>{
					this.bannerBox = res.data.body.retList
				});
			}
		}
	}
</script>
<style scoped>
	.boxbg{
		width: 100%;
		background: url(../../assets/images/bg2x.png) no-repeat left top;
		background-size: 100%;
		padding-top: 20px;
	}
	.pad{
		padding: 0 15px 15px;
	}
	.imgad{
		width: 100%;
	}
	.cbox{
		width: 100%;
		background: #fff;
		border-radius: 6px;
		display: flex;
		flex-wrap: wrap;
		padding: 10px 0;
		box-shadow: 0 2px 4px #ccc;
	}
	.swipe-wrapper{
        width: 100%;
        height: 10.14rem;
        border-radius:8px;
        margin-bottom: 20px;
    }
    .swipe-wrapper img {
    	width: 100%;
    	height:10.14rem;
        border-radius:8px;
    }
    .topt{
		line-height: 40px;
		font-size: 16px;
		text-align: center;
		color: #fff;
		letter-spacing: 1px;
		padding-top: 10px;
	}
	.title{
		width: 100%;
		font-size: 16px;
		padding: 10px 0;
		color: #2e2e2e;
		font-weight: 700;
		margin-top: 1.42rem;
	}
</style>
