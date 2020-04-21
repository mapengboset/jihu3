<template>
	<div class="item" @click='fn'>
		<span v-show='!bol'><slot name='act'></slot></span>
		<span v-show='bol'><slot name='nor'></slot></span>
		<span :class="{cur: !bol}">{{txt}}</span>
	</div>
</template>
<script>
	export default{
		props: ['txt','mark','sel'],
		computed:{
			bol:function(){
				if(this.mark==this.sel){
					return false
				}
				return true
			}
		},
		methods:{
			fn:function(){
				this.$emit('bott', this.mark);
				this.$router.push('/' + this.mark);
			}
		}
	}
</script>
<style>
	.item{width: 25%; display: inline-flex; height: 64px; flex-direction: column; align-items: center; justify-content: center;}
	.item img { width: 26px; }
	.item span{font-size: 12px; margin: 0; padding: 0;}
	.cur{ color: #e45650; }
</style>