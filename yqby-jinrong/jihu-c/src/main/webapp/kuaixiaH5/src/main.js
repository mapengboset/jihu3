// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import store from './store/store'
import router from './router'

import axios from 'axios' //引入和配置axios
import { post, get } from './globle/globle'
import {UrlSearch} from './assets/js/urlsearch'//导航url参数截取
import VueAwesomeSwiper from 'vue-awesome-swiper'


import $ from 'jquery'

import 'mint-ui/lib/style.css'
import { Toast } from 'mint-ui';
window.Toast= Toast
//轮播图
import { Swipe, SwipeItem } from 'mint-ui';

Vue.component(Swipe.name, Swipe);
Vue.component(SwipeItem.name, SwipeItem);

//
import { MessageBox } from 'mint-ui';

window.MessageBox= MessageBox



Vue.use(VueAwesomeSwiper);
let Request = new UrlSearch();
Vue.config.productionTip = false
Vue.prototype.$Request = Request
Vue.prototype.$axios = axios;
Vue.prototype.$post = post
Vue.prototype.$get = get
/* eslint-disable no-new */

router.beforeEach((to, from, next) => {
  /* 路由发生变化修改页面title */
  if (to.meta.title) {
    document.title = to.meta.title;
  }
  next()
});
new Vue({
  el: '#app',
  store,
  router,
  components: { App },
  template: '<App/>'
})
