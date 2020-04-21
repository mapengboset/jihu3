<template>
  <div>
    <div class="loginBoxTop">
      <img src="http://p2a60yqmm.bkt.clouddn.com/jhLogoLogin.png" alt="">
      <h2>欢迎来到机呼联盟</h2>
    </div>
    <div class="mobileInput">
      <i><img src="http://p2a60yqmm.bkt.clouddn.com/newJhMoileIcon.png" alt=""></i>
      <input maxlength="11" @blur="toDo" onkeyup="this.value=this.value.replace(/\D/g,'')"  v-model="mobileNum" class="mobile"
             type="tel">
      <span v-if="isDel" @click="toDelMobile"><img src="http://p2a60yqmm.bkt.clouddn.com/newJhDel.png" alt=""></span>
    </div>
    <div class="getMobileCode">
      <a :class="isTrue?'on':''" @click="toGetMobileCode">获取短信验证码</a>
    </div>
    <div class="loginDoc">

      点击“获取短信验证码”表示您已同意 <router-link to="/doc" style="color:#3E95FF;">《机呼联盟用户服务协议》</router-link>
    </div>
    <verifycode v-if="verifyShow"
            @close="verifyShow = false"
            @success="onMpanelSuccess"></verifycode>
  </div>
</template>
<script>
  import verifycode from '../../components/verify/verify.vue'
  export default {
    data() {
      return {
        msg: '',
        mobileNum: '',
        isDel:false,
        isTrue:false,
        verifyShow:false,
      }
    },
    watch:{
      mobileNum:function(n,o) {
        if(n.length>0){
          this.isDel=true;
        }else{
          this.isDel=false;
        }
        if(n.length==11){
          this.isTrue=true;
        }else{
          this.isTrue=false;
        }
      }
    },
    methods: {
      toDo(){
        setTimeout(function() {
          var scrollHeight = document.documentElement.scrollTop || document.body.scrollTop || 0;
          window.scrollTo(0, Math.max(scrollHeight - 1, 0));
        }, 300);
      },
      // 验证通过
      onMpanelSuccess() {
        this.verifyShow = false;
        //执行代码
        this.$router.push({name:'logincode',params:{mobile:this.mobileNum}})
      },
      toDelMobile(){
        this.mobileNum=this.mobileNum.substring(0,this.mobileNum.length-1);
      },
      toGetMobileCode(){
//        this.$router.push({name:'logincode',params:{mobile:this.mobileNum}})
        if(this.isTrue){
          if(!(/^1[3456789]\d{9}$/.test(this.mobileNum))) {
            Toast({
              message: '手机号不正确请重新填写',
              duration: 2000
            });
            this.mobileNum=''
          }else{
            this.verifyShow=true
          }
        }else{
          return
        }
      }
    },
    components:{
      verifycode
    },
    mounted(){
    }

  }
</script>
<style>
  @import "../../assets/css/verify.css";
  .loginBoxTop {
    margin-top: 20%;
  }

  .loginBoxTop img {
    width: 96px;
    height: 96px;
    margin-left: 4%;
  }

  .loginBoxTop h2 {
    height: 33px;
    font-size: 24px;
    font-family: PingFangSC-Medium;
    font-weight: 500;
    color: rgba(68, 68, 68, 1);
    line-height: 33px;
    margin-top: 15px;
    margin-left: 4%;
  }

  .mobileInput {
    margin-left: 4%;
    margin-right: 4%;
    position: relative;
    margin-top: 15%;
    width: 92%;
  }

  .mobileInput i img {
    width: 12px;
    height: 16px;
    vertical-align: middle;
    position: absolute;
    bottom: 13px;
  }
  .mobileInput span img {
    width: 28px;
    height: 17px;
    vertical-align: middle;
    position: absolute;
    bottom: 13px;
    right: 5px;
  }

  .mobileInput input {
    border: none;
    padding-left: 8%;
    width: 92%;
    height: 40px;
    line-height: 40px;
    font-size: .75em;
    color: #8a8a8a;
    border-bottom: .5px #979797 solid;
    outline: none;
    border-radius: 0;
  }

  .getMobileCode {
    width: 100%;
    text-align: center;
  }

  .getMobileCode a {
    width: 90%;
    display: block;
    height: 45px;
    line-height: 45px;
    background: #ddd;
    color: #fff;
    font-size: 14px;
    border-radius: 30px;
    margin: 30% auto 20% auto;
  }

  .loginDoc {
    text-align: center;
    color: #444;
    width: 94%;
    margin: 0 4%;
    bottom: 20px;
    font-size: 10px;
    margin-bottom: 10px;
  }
  .on{
    background: linear-gradient(90deg, rgb(221, 60, 73) 0%, rgb(132, 6, 16) 100%) !important;

  }
</style>
