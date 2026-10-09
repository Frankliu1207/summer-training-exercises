<template>
       姓名：<input v-model="name"/>{{ name }}<br />
       薪水：<input type="number" v-model="salary"/>{{ salary }}<br/>
       <button @click="addsalary">薪水加1000</button> 
</template>

<script>
    export default{
        name:"SalaryInfo"
    }
</script>


<script setup>
import{ ref } from 'vue';

    let name = ref('jack')
    let salary = ref(15000)
    
    function addsalary(){
      salary.value += 1000
      console.log(salary)
      }

      defineExpose({name,salary})
</script>


<style>
</style>
