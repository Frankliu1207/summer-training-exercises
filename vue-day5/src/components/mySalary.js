import { ref } from "vue";

export default function(){
       let name = ref("hellen")
       let salary = ref(10000)

       function addSalary(){
        salary.value += 1000
        console.log(salary)
       }

       return{name,salary,addSalary}
}