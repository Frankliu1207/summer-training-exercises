<script setup>
 import { ref } from 'vue';
 import mySalaryInfo from './components/mySalaryInfo.vue';
      
  let salaryInfo = ref()

  function Show(){
    console.log(salaryInfo)
    console.log(salaryInfo.value)
    console.log(salaryInfo.value.name)
    console.log(salaryInfo.value.salary)
    

  }
</script>

<template>
   <mySalaryInfo ref="salaryInfo"></mySalaryInfo>
   <button @click="Show">查看薪水信息</button>
</template>

<style scoped>
 

</style>
