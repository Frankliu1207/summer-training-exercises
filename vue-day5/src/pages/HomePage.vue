<template>
  <section class="home-card">
    <p class="section-label">HOME</p>
    <h2>你好，<span>{{ name }}</span></h2>
    <p class="description">在下方修改姓名，标题会通过 v-model 实时更新。</p>

    <label for="name-input">你的名字</label>
    <input
      id="name-input"
      v-model="name"
      type="text"
      placeholder="请输入你的名字"
    >
  </section>
</template>

<script setup>
import { ref } from 'vue'

const name = ref('请先输入姓名')
</script>

<style scoped>
.home-card {
  width: 100%;
  min-height: 360px;
  padding: 54px;
  background: #ffffff;
  border: 1px solid #e5eaf2;
  border-radius: 22px;
  box-shadow: 0 18px 45px rgba(44, 62, 80, 0.08);
}

.section-label {
  margin-bottom: 12px;
  color: #6d50c7;
  font-size: 12px;
  font-weight: 700;
  letter-spacing: 0.16em;
}

h2 {
  color: #24364b;
  font-size: clamp(30px, 5vw, 48px);
  font-weight: 700;
  line-height: 1.25;
}

h2 span {
  color: #5f55ca;
  font-weight: 700;
}

.description {
  margin: 14px 0 36px;
  color: #718096;
  font-size: 16px;
}

label {
  display: block;
  margin-bottom: 10px;
  color: #3b4d61;
  font-weight: 600;
}

input {
  width: min(100%, 520px);
  height: 52px;
  padding: 0 18px;
  color: #24364b;
  background: #f8faff;
  border: 1px solid #dce3ee;
  border-radius: 14px;
  outline: none;
  font-size: 16px;
  transition: border-color 0.2s, box-shadow 0.2s;
}

input:focus {
  border-color: #7650c8;
  box-shadow: 0 0 0 4px rgba(118, 80, 200, 0.12);
}

@media (max-width: 640px) {
  .home-card {
    min-height: 320px;
    padding: 32px 24px;
  }
}
</style>
