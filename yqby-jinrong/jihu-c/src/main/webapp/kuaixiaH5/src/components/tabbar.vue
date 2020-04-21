<template>
	<div class="tab">
		<Item txt='首页' mark='Index' :sel='select' @bott='getval'>
			<img src="../assets/images/11.png" slot='act' />
			<img src="../assets/images/1.png" slot='nor' />
		</Item>
		<Item txt='休闲' mark='Leisure' :sel='select' @bott='getval'>
			<img src="../assets/images/22.png" slot='act' />
			<img src="../assets/images/2.png" slot='nor' />
		</Item>
		<Item txt='资讯' mark='Information' :sel='select' @bott='getval'>
			<img src="../assets/images/33.png" slot='act' />
			<img src="../assets/images/3.png" slot='nor' />
		</Item>
		<Item txt='我的' mark='Mine' :sel='select' @bott='getval'>
			<img src="../assets/images/44.png" slot='act' />
			<img src="../assets/images/4.png" slot='nor' />
		</Item>
	</div>
</template>
<script>
	import Item from './item'
	export default{
		props: ['active'],
		components: {
			Item
		},
		data: function(){
			return {
				select: 'Index'
			}
		},
		watch: {
        	'active'(newVal,oldVal) {
            	this.select = newVal;
	        }
	    },
		methods: {
			getval:function(val){
				this.select= val;
			}
		},
		mounted:function(){
			this.select = this.$route.name
		},
		updated:function(){
			this.select = this.$route.name
		}
	}
</script>
<style>
	.tab{width: 100%;height: 64px; background: #fff;  position: fixed; left: 0; bottom: 0; display: flex; box-shadow: 0 2px 6px #bbb;}
</style>