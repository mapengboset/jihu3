<template>
  <div class="modal-box" >
    <div class="modal-box" style="z-index: -1" @click="onCancel"></div>
    <div class="modal-content">
      <!--头部-->
      <div class="modal-header">
        <!--<p class="title">验证码验证</p>-->
      </div>
      <!--内容区域-->
      <div class="modal-body">

        <div style="background: #fff;width: 100%;border-radius: 10px;padding: 55% 5% 21% 5%;margin-left: -5%;">
          <div id="mpanel"
               ref="mpanel" style="background: #fff;width: 94%;">

          </div>
          <!--<div id="check-btn" class="verify-btn">确定</div>-->
        </div>
      </div>
      <!--尾部,操作按钮  -->
      <!-- <div class="modal-footer">
      </div> -->
    </div>
  </div>
</template>

<script>
  import '../../assets/js/verify'
//  import { XDialog, TransferDomDirective as TransferDom } from 'vux'
  export default {
    name: 'verifycode',
    data() {
      return {
        path: null
      }
    },
    mounted() {
      this.initMpanel();
    },
    methods: {
      onCancel() {
        this.$emit('close');
      },
      // 提示框
   /*   showToolTip(text, timeout = 2000) {
        this.$vux.toast.text(text);
      },*/
      // 验证
      initMpanel() {
//        this.codeVerify()  //运算验证码
         this.slideVerify()  //拼图验证码
        // this.pointsVerify()  //拼字验证码
      },
      // 运算验证码
    /*  codeVerify() {           // https://veui.net/document/index
        let _this = this
        $('#mpanel').codeVerify({
          type: 2,
          figure: 100,
          arith: 0,
          width: '100%',
          height: '50px',
          fontSize: '30px',
          btnId: 'check-btn',
          ready: function () {
          },
          success: function () {
//            _this.showToolTip("验证成功！")
            // 向父组件传值
            _this.$emit('success');
          },
          error: function () {
//            _this.showToolTip("验证码不匹配！")
          }
        });
      },*/
      // 拼图验证码
      slideVerify() {           // https://veui.net/document/index
        let _this = this
        $('#mpanel').slideVerify({
          type: 2,
          mode: 'pop',
          vOffset: 5,
          vSpace: 5,
          explain: '向右滑动模块完成验证',
//          imgUrl: 'http://p2a60yqmm.bkt.clouddn.com/',
          imgName : ['http://p2a60yqmm.bkt.clouddn.com/checkTestImg1.png', 'http://p2a60yqmm.bkt.clouddn.com/checkTestImg2.png'],
          imgSize: {
            width: '100%',
            height: '180px',
          },
          blockSize: {
            width: '40px',
            height: '40px',
          },
          barSize: {
            width: '100%',
            height: '40px',
          },
          ready: function () {
          },
          success: function () {
//            _this.showToolTip("验证成功！")
            // 向父组件传值
            _this.$emit('success');
          },
          error: function () {
//            _this.showToolTip("验证码不匹配！")
          }
        });
      },
    /*  // 拼字验证码
      pointsVerify() {           // https://veui.net/document/index
        let _this = this
        $('#mpanel').pointsVerify({
          mode: 'pop',
          defaultNum: 4,
          checkNum: 2,
          vSpace: 5,
          imgUrl: 'http://txh-cdn.96qbhy.com/',
          imgName: ['20181010170653M58v1KlH.jpg', '20181010170719McH7EkZK.jpg'],
          imgSize: {
            width: '100%',
            height: '200px',
          },
          barSize: {
            width: '100%',
            height: '40px',
          },
          ready: function () {
          },
          success: function () {
//            _this.showToolTip("验证成功！")
            // 向父组件传值
            _this.$emit('success');
          },
          error: function () {
//            _this.showToolTip("验证码不匹配！")
          }
        });
      }*/
    }
  }
</script>
<style scoped>

  .modal-box {
    position: fixed;
    display: flex;
    justify-content: center;
    align-items: center;
    left: 0;
    top: 0;
    z-index: 100;
    width: 100%;
    height: 100%;
    background: rgba(0, 0, 0, 0.25);
  }
  .modal-content {
    position: relative;
    width: 300px;
    /* background: #fff; */
    border-radius: 10px;
    box-sizing: border-box;
    font-size: 13px;
  }
  .modal-header {
    text-align: center;
    border: 0;
  }
  .modal-header .title {
    font-size: 20px;
    font-weight: bold;
  }
  .modal-body{
    margin-top: -25px;
  }
  .modal-close {
    position: absolute;
    right: -10px;
    top: -15px;
    color: #999494;
    font-size: 14px;
  }

  .fade-enter-active {
    animation: fade-in 0.5s;
  }
  .fade-leave-active {
    animation: fade-in 0.5s reverse;
  }
  @keyframes fade-in {
    0% {
      transform: scale(0);
    }
    50% {
      transform: scale(1.5);
    }
    100% {
      transform: scale(1);
    }
  }
</style>
