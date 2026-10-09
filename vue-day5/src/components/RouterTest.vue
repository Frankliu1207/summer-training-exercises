<template>
<div id="app">
<h1>Hello App!</h1>
<p>
<!-- 使⽤ router-link 组件进⾏导航 -->
<!-- 通过传递 `to` 来指定链接 -->
<!-- `<router-link>` 将呈现⼀个带有正确 `href` 属性的 `<a>` 标签 -->
<router-link to="/Home">⾸⻚</router-link> <!-- 直接跳转 -->
<router-link :to="{ path:'/About'}">关于</router-link> <!-- 路径跳转 -->
<router-link replace :to="{ name:'news'}">新闻</router-link> <!-- 命名跳转 -->
</p>
<div class="content">
<!-- 路由出⼝ -->
<!-- 路由匹配到的组件将渲染在这⾥ -->
<router-view></router-view>
</div>
</div>
</template>
<!-- vue3写法 -->
<script lang="ts" setup >
</script>
<style>
a{
margin: 10px;
}
.content{
background: yellowgreen;
widows: 10%;
height: 400px;
border: 1px solid #000;
border-radius: 10px;
}
</style>