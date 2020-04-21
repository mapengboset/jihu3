<template>
  <div style="background: #fff;">
    <div class="loginBoxTop">
      <h2>输入验证码</h2>
      <p>短信验证码已发送至 <span style="color: #999;">+86 {{mobileNum}}</span></p>
    </div>
    <div class="mobileInput">
      <i><img src="http://p2a60yqmm.bkt.clouddn.com/newJhMoileIcon.png" alt=""></i>
      <input placeholder="请输入短信验证码" @blur="toDo" class="mobile" v-model="checkCode" onkeyup="this.value=this.value.replace(/\D/g,'')"
             type="tel">
    </div>
    <div v-if="isShowAgain" class="again" @click="againGet">重新获取</div>
    <div v-if="isShowAgainTime" class="again1">重新获取 {{times}}s</div>
    <div class="getMobileCode">
      <a :class="isTrue?'on':''" @click="enterLogin">确认</a>
    </div>
  </div>
</template>
<script>
  export default {
    data() {
      return {
        msg: '',
        mobileNum: this.$route.params.mobile,
        checkCode: '',
        isDel:false,
        isTrue:false,
        verifyShow:false,
        isShowAgain:true,
        verifyCode:'',
        isShowAgainTime:false,
        times:59,
      }
    },
    watch:{
      checkCode(n,o){
        if(n.length>0){
          this.isTrue=true;
        }else{
          this.isTrue=false;
        }
      },
      times(n,o){

      },
    },
    methods: {
      toDo(){
        setTimeout(function() {
          var scrollHeight = document.documentElement.scrollTop || document.body.scrollTop || 0;
          window.scrollTo(0, Math.max(scrollHeight - 1, 0));
        }, 300);
      },
      requestData(){
        const that=this;
        var codeJson = '{"version":"' + this.$store.state.version + '","appChannel":"' + this.$store.state.appChannel+'","platformId":"' + 2+'","verifyType":"' + 3+'","mobile":"' + this.mobileNum+'"}';
        var url='http://webtest.yqbing.com/jhStore/sendMobileVerifyCode.do?'
        fetch(url+'data='+codeJson).then(response=>{
          return response.json();
        }).then(function(data) {
          console.log(data);
          if(data.code==0){
            Toast('发送成功');
            that.isShowAgainTime=true;
            that.isShowAgain=false;
            that.timesC();
          }else{
            Toast(data.msg)
            window.history.go(-1);
          }
        })
      },
      againGet(){
        const that=this;
        var codeJson = '{"version":"' + that.$store.state.version + '","appChannel":"' + that.$store.state.appChannel+'","platformId":"' + 2+'","verifyType":"' + 3+'","mobile":"' + that.mobileNum+'"}';
        var url='http://webtest.yqbing.com/jhStore/sendMobileVerifyCode.do?'
        fetch(url+'data='+codeJson).then(response=>{
          return response.json();
        }).then(function(data) {
          console.log(data);
          if(data.code==0){
            Toast('发送成功');
            that.isShowAgainTime=true;
            that.isShowAgain=false;
            that.timesC();
          }else{
            Toast(data.msg)
          }
        })

      },
      timesC(){
        const that=this;
        let intervalFunc = setInterval(() => {
          that.times=that.times-1;
          console.log(that.times);
          if (that.times < 1) {
            window.clearInterval(intervalFunc);
            this.isShowAgain=true;
            this.isShowAgainTime=false;
            that.times=59
          }
        }, 1000)
      },
      enterLogin(){
        if(this.isTrue==true){
          const that=this;
          var codeJson = '{"version":"' + that.$store.state.version + '","appChannel":"' + that.$store.state.appChannel+'","platformId":"' + 2+'","plat":"' + 2+'","verifyType":"' + 3+'","mobile":"' + that.mobileNum+'","verifyCode":"' + that.checkCode+'","password":"e10adc3949ba59abbe56e057f20f883e"}';
          var url='http://webtest.yqbing.com/jhStore/verifyCodeLogin.do?'
          fetch(url+'data='+codeJson).then(response=>{
            return response.json();
          }).then(function(data) {
            console.log(data);
            if(data.code==0){
              localStorage.setItem('token',data.body.token);
               that.$router.push({name:'Index',params:{}})
            }else{
              that.verifyCode=''
              Toast(data.msg)
            }
          })
        }
      }
    },
    components:{
    },
    mounted(){
      this.requestData();
    }

  }
</script>
<style>
  .loginBoxTop {
    margin-top: 25%;
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
    margin: 30% auto;
  }

  .loginDoc {
    text-align: center;
    color: #444;
    width: 94%;
    margin: 0 4%;
    position: absolute;
    bottom: 20px;
    font-size: 10px;
  }
  .on{
    background: linear-gradient(90deg, rgb(221, 60, 73) 0%, rgb(132, 6, 16) 100%) !important;
  }
  .loginBoxTop p{
    margin-left: 4%;
    margin-top: 4%;
  }
  .again{
    text-align: right;
    margin-right: 5%;
    margin-top: 20px;
    color: #3E95FF;
    font-size: .7em;
  }
  .again1{
    text-align: right;
    margin-right: 5%;
    margin-top: 20px;
    color: #999;
    font-size: .7em;
  }
</style>
