<template>
	<div class="icon" @click='fn'>
		<span><slot name='act'></slot></span>
		<font>{{txt}}</font>
	</div>
</template>
<script>
	export default{
		props: ['txt'],
		methods:{
			fn:function(){
				this.$emit('bott')
			}
		}
	}
</script>
<style scoped>
	.icon{
		width: 25%;
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
		min-height: 7.14rem;
	}
	.icon img {
		width: 2.71rem;
		height: 2.71rem;
	}
	.icon img.img40 {
		width: 2.85rem;
		height: 2.85rem;
	}
	.icon font {
		font-size: 1rem;
		color: #242424;
		margin-top: 0.35rem;
	}
</style>