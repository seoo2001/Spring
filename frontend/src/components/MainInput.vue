<template>
  <form v-on:submit.prevent="submitForm">
    <div>
      <label>id: </label>
      <input id="username" type="text" v-model="username"/>
    </div>
    <div>
      <label>pw: </label>
      <input id="password" type="password" v-model="password"/>
    </div>
    <button type="submit">login</button>
  </form>
</template>

<script>
import axios from 'axios'
export default {
  name: 'MainInput',
  data: function (){
    return {
      username: '',
      password: '',
    }
  },
  methods: {
    submitForm: function () {
      let url = 'http://localhost:3000/api/member';
      let data = {
        username: this.username,
        password: this.password
      }
      axios.post(url, data)
          .then(function(response){
            console.log(response);
          })
          .catch(function(error){
            console.log(error);
          });
    }
  }
}

</script>