<script setup>
import { ref } from 'vue'

const value = ref('')
const list = ref([
  { value: '先吃饭', isCompleted: true },
  { value: '先洗澡', isCompleted: false },
  { value: '还是先Play game', isCompleted: false },
])

function add() {
  list.value.push({
    value: value.value,
    isCompleted: false,
  })

  value.value = ''
}

function del(index) {
  list.value.splice(index, 1)
}
</script>

<template>
  <div class="todo-app">
    <div class="title">Todo App</div>

    <div class="todo-form">
      <input
        v-model="value"
        type="text"
        class="todo-input"
        placeholder="Add a todo"
      />
      <div @click="add" class="todo-button">Add Todo</div>
    </div>

    <div
      v-for="(item, index) in list"
      :class="[item.isCompleted ? 'completed' : 'item']"
    >
      <div>
        <input v-model="item.isCompleted" type="checkbox" />
        <span class="name">{{ item.value }}</span>
      </div>

      <div @click="del(index)" class="del">del</div>
    </div>
  </div>
</template>

<style scoped>
.todo-app {
  box-sizing: border-box;
  width: 100%;
  max-width: 820px;
  min-height: 500px;
  margin: 0 auto;
  padding: 46px 54px 54px;
  background: #ffffff;
  border: 1px solid #e5eaf2;
  border-radius: 22px;
  box-shadow: 0 18px 45px rgba(44, 62, 80, 0.08);
}

.title {
  text-align: center;
  color: #24364b;
  font-size: 36px;
  font-weight: 700;
}

.todo-form {
  display: flex;
  width: 100%;
  margin: 30px 0 38px;
}

.todo-button {
  width: 128px;
  height: 52px;
  border-radius: 0 20px 20px 0;

  text-align: center;
  background: linear-gradient(
    to right,
    rgb(113, 65, 168),
    rgba(44, 114, 251, 1)
  );
  color: #fff;
  line-height: 52px;
  cursor: pointer;
  font-size: 15px;
  font-weight: 600;
  user-select: none;
}

.todo-input {
  flex: 1;
  min-width: 0;
  padding: 0 18px;
  border-radius: 20px 0 0 20px;
  border: 1px solid #dfe1e5;
  outline: none;
  height: 50px;
  font-size: 15px;
  transition: border-color 0.2s, box-shadow 0.2s;
}

.todo-input:focus {
  border-color: #7650c8;
  box-shadow: 0 0 0 4px rgba(118, 80, 200, 0.12);
}

.item {
  box-sizing: border-box;
  display: flex;
  align-items: center;
  justify-content: space-between;
  width: 100%;
  min-height: 58px;
  margin: 12px 0;
  padding: 16px 20px;
  border: 1px solid #edf0f5;
  border-radius: 16px;
  box-shadow: rgba(149, 157, 165, 0.14) 0px 8px 20px;
}

.del {
  padding: 5px 8px;
  color: #e05252;
  cursor: pointer;
  font-weight: 600;
}

.completed {
  box-sizing: border-box;
  display: flex;
  align-items: center;
  justify-content: space-between;
  width: 100%;
  min-height: 58px;
  margin: 12px 0;
  padding: 16px 20px;
  border: 1px solid #edf0f5;
  border-radius: 16px;
  box-shadow: rgba(149, 157, 165, 0.14) 0px 8px 20px;
  text-decoration: line-through;
  opacity: 0.4;
}

.name {
  margin-left: 8px;
}

@media (max-width: 640px) {
  .todo-app {
    padding: 34px 22px 40px;
  }

  .todo-button {
    width: 104px;
  }
}
</style>
