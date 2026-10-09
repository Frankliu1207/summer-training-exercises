<template>
  <div class="app-shell">
    <header class="app-header">
      <div>
        <p class="eyebrow">VUE 3 PRACTICE</p>
        <h1>简易多页面应用</h1>
        <p class="subtitle">使用响应式数据与路由完成的 Vue 入门练习</p>
      </div>

      <nav class="app-nav" aria-label="页面导航">
        <router-link to="/home">首页</router-link>
        <router-link to="/todo">待办清单</router-link>
      </nav>
    </header>

    <main class="page-content">
      <router-view></router-view>
    </main>
  </div>
</template>

<script setup>
</script>

<style scoped>
.app-shell {
  width: 100%;
}

.app-header {
  display: flex;
  align-items: flex-end;
  justify-content: space-between;
  gap: 32px;
  padding: 30px 34px;
  background: #ffffff;
  border: 1px solid #e5eaf2;
  border-radius: 22px;
  box-shadow: 0 18px 45px rgba(44, 62, 80, 0.08);
}

.eyebrow {
  margin-bottom: 8px;
  color: #6d50c7;
  font-size: 12px;
  font-weight: 700;
  letter-spacing: 0.16em;
}

h1 {
  color: #24364b;
  font-size: clamp(30px, 4vw, 42px);
  font-weight: 700;
  line-height: 1.2;
}

.subtitle {
  margin-top: 10px;
  color: #718096;
  font-size: 15px;
}

.app-nav {
  display: flex;
  gap: 10px;
  flex-shrink: 0;
}

.app-nav a {
  padding: 10px 18px;
  color: #526173;
  font-weight: 600;
  border-radius: 12px;
  transition: background-color 0.2s, color 0.2s, transform 0.2s;
}

.app-nav a:hover {
  color: #6842c2;
  background: #f2edff;
  transform: translateY(-1px);
}

.app-nav a.router-link-active {
  color: #ffffff;
  background: linear-gradient(135deg, #7650c8, #3478f6);
  box-shadow: 0 8px 20px rgba(78, 92, 212, 0.24);
}

.page-content {
  margin-top: 28px;
}

@media (max-width: 720px) {
  .app-header {
    align-items: flex-start;
    flex-direction: column;
    padding: 24px;
  }
}
</style>
