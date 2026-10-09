import { defineStore } from "pinia";

export const userStore = defineStore("userStore",{
    state(){
        return{
            username:"xxx"
        }
    },
    getters:{
        getUsername(){
            return this.username
        }
    },
    actions:{

        changeUsername(value){
            if(value.length < 10){
                this.username +=value
            }
        }

    }


})