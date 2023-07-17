<template>
  <MainInput/>
  <a href="/home">home 이동</a>
  <a href="/error-vue">error 이동</a>
</template>

<script>
import MainInput from "@/components/MainInput.vue";

export default {
  name: "InputPage",
  components: {MainInput}
};
</script>

<style>
</style>
