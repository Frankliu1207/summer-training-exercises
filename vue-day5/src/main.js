import './assets/main.css'

import { createApp } from 'vue'
import App from './App.vue'
import {createRouter, createWebHashHistory} from "vue-router"


import HomePage from './pages/HomePage.vue';
import TodoPage from './pages/TodoPage.vue';

//配置路由规则
const routes = [
  {path:'/',redirect:'/home'},
  {path:'/home',component:HomePage},
  {path:'/todo',component:TodoPage},

]

//创建路由器

const router = createRouter({
    history:createWebHashHistory(),
    routes 
})
//加载路由器

const app = createApp(App)
app.use(router)
app.mount('#app')
