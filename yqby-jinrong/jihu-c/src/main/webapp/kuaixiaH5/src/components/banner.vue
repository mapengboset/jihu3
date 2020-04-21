<!-- <div v-wechat-title="$route.meta.title"></div>  -->
<template>
	<div>
		<div class="swipe-wrapper">
			<mt-swipe :auto="4000" :continuous='true' >
			  <mt-swipe-item v-for='(item,index) in arr' :key='index'><img :src="item.imgurl" /></mt-swipe-item>
			</mt-swipe>
		</div>
		<!-- <div>
			<mt-navbar v-model="selected">
			  <mt-tab-item id="1">选项一</mt-tab-item>
			  <mt-tab-item id="2">选项二</mt-tab-item>
			  <mt-tab-item id="3">选项三</mt-tab-item>
			</mt-navbar>

			
			<mt-tab-container v-model="selected">
			  <mt-tab-container-item id="1">
			    <mt-cell v-for="n in 10" :title="'内容《家里比海盗》 ' + n" :key='n' @click.native='showToast' />
			  </mt-tab-container-item>
			  <mt-tab-container-item id="2">
			    <mt-cell v-for="n in 4" :title="'测试 ' + n" :key='n' />
			  </mt-tab-container-item>
			  <mt-tab-container-item id="3">
			    <mt-cell v-for="n in 6" :title="'选项 ' + n" :key='n' />
			  </mt-tab-container-item>
			</mt-tab-container>
		</div> -->
	</div>
	
</template>
<script>
	export default{
		data:function(){
			return {
				arr: [
					{
						title: '《家里比海盗》 14年老粉给你带来所有的彩蛋和深梗', desc: '此影评送给那些不离不弃得捞粉们不一样得情感', author: '来自北方得狼',mid: '001',
						imgurl: 'https://f10.baidu.com/it/u=2987595138,4271236850&fm=72'
					},
					{
						title: '《泰坦尼克》 14年老粉给你带来所有的彩蛋和深梗', desc: '此影评送给那些不离不弃得捞粉们不一样得情感', author: '小伙的短裤', mid: '002',
						imgurl: 'https://f10.baidu.com/it/u=765686064,1077157424&fm=72'
					},
					{
						title: '《越狱》 14年老粉给你带来所有的彩蛋和深梗', desc: '此影评送给那些不离不弃得捞粉们不一样得情感', author: '姑娘的秋裤', mid:'003',
						imgurl: 'https://f11.baidu.com/it/u=3699489413,3855986846&fm=72'
					},
				],
				//selected: '1'
			}
		},
		mounted:function(){
			
		},
		methods:{	
			goto:function() {
			    // MessageBox('提示', '操作成功');
			    MessageBox({
				  title: '提示',
				  message: '确定执行此操作?',
				  showCancelButton: true
				});
			},
			showToast:function(){
				Indicator.open();
				Indicator.open('Loading...');
				Indicator.open({
				  text: '加载中...',
				  spinnerType: 'fading-circle'
				});
			},
			hideShow:function(){
				Indicator.close();
			}
		}
	}
</script>
<style scoped>
	*{
		margin: 0; padding: 0;
	}
	.gonty{
		font-size: 20px;
		color: #000;
	}
	ul,li{
		list-style: none;
	}
	ul li{
		padding: 5px 10px;
	}
	.swipe-wrapper{
        width: 100%;
        height: 150px;
    }
    .swipe-wrapper img {
    	width: 100%
    }
    .mint-navbar{
    	margin-bottom: 2px;
    }
    .topbott{
    	margin-bottom: 40px;
    }
</style>