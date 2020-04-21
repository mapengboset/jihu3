<template>
	<div class="leibox">
		<div class="pad">
			<div class="list">
				<span><slot name='xp'></slot></span>
				<span><slot name='ximg'></slot></span>
			</div>
			<div class="justFlex">
				<span class="spanFlex">
					<img src="../assets/images/yan.png" class="imgyan" />
					<span><slot name='xs'></slot></span>
					<span><slot name=xtime></slot></span>
				</span>
				<img src="../assets/images/huo.png" class="imghuo" />
			</div>
		</div>
	</div>
</template>
<script>
	
</script>
<style scoped>
	.leibox{
		width: 100%;
	}
	.pad{
		padding: 0 15px 15px;
	}
	.list{
		width: 100%;
		display: flex;
		justify-content: space-between;
		padding: 15px 0;
		border-top: 1px solid #f4f4f4;
	}
	.list img{
		width: 115px;
		height: 68px;
		margin-left: 10px;
	}
	.list p{
		font-size: 1rem;
		line-height: 24px;
	}
	.imgyan{
		width: 14px;
		height: 10px;
	}
	.spanFlex{
		display: flex;
		align-items: center;
	}
	.spanFlex font{
		color: #999;
		font-size: 1rem;
		margin-left: 10px;
	}
	.spanFlex i{
		margin-left: 20px;
		color: #ccc;
	}
	.imghuo{
		width: 10px;
		height: 13px;
	}
	.justFlex{
		display: flex;
		justify-content: space-between;
		align-items: center;
	}
</style>
