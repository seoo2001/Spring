<template>
  <form v-on:submit.prevent="submitForm">
    <div>
      <label>id: </label>
      <input id="username" type="text" v-model="username"/>
    </div>
    <button type="submit">login</button>
  </form>
</template>

<script>
import axios from 'axios'
export default {
  name: 'TestInput',
  data: function (){
    return {
      username: '',
    }
  },
  methods: {
    submitForm: function () {
      let url = 'http://localhost:3000/api/member';
      let data = {
        username: this.username
      }
      console.log(data);
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