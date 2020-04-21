import Vue from 'vue'
import Router from 'vue-router'
import Index from '../pages/index/index'
import Icon from '../components/icon'
import login from '../pages/login/login'
import logincode from '../pages/login/loginCode'
import doc from '../pages/login/doc'
import VueWechatTitle from 'vue-wechat-title'


Vue.use(VueWechatTitle)
Vue.use(Router)

export default new Router({
  // mode:'history',
  routes: [
    {
      path: '/',
      name: 'Index',
      component: Index,
      meta:{
        title: '机呼联盟'
      }
    },
    {
      path: '/index',
      name: 'Index',
      component: Index,
      meta:{
        title: '机呼联盟'
      }
    },
    {
      path: '/login',
      name: 'login',
      component: login,
      // meta:{
      //   title: '首页'
      // }
    },
    {
      path: '/logincode',
      name: 'logincode',
      component: logincode,
    },,
    {
      path: '/doc',
      name: 'doc',
      component: doc,
    },
  ]
})

