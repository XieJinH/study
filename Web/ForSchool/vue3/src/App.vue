<script setup>
// import HelloWorld from './components/HelloWorld.vue'
// import TheWelcome from './components/TheWelcome.vue'
</script>

<template>
  <header>
    <!--    <img alt="Vue logo" class="logo" src="./assets/logo.svg" width="125" height="125"/>-->
    <button v-on:click="btnClick">点我</button>

    <h1>v-for</h1>

    <div>
      <div v-for="item in userList">{{ item }}</div>
    </div>
    <button v-for="(item, index) in array" :key="index">{{ item }}</button>

    <h1>v-model</h1>
    <input v-model.number="inputBox">
    <div>我输入的是：{{ inputBox }}</div>

    <!--    <div class="wrapper">-->
    <!--      <HelloWorld msg="You did it!"/>-->
    <!--    </div>-->

    <tr>
      <td>awa</td>
    </tr>
  </header>

  <main>
    <TheWelcome/>
  </main>
</template>

<!--<style scoped>-->
<!--header {-->
<!--  line-height: 1.5;-->
<!--}-->

<!--.logo {-->
<!--  display: block;-->
<!--  margin: 0 auto 2rem;-->
<!--}-->

<!--@media (min-width: 1024px) {-->
<!--  header {-->
<!--    display: flex;-->
<!--    place-items: center;-->
<!--    padding-right: calc(var(&#45;&#45;section-gap) / 2);-->
<!--  }-->

<!--  .logo {-->
<!--    margin: 0 2rem 0 0;-->
<!--  }-->

<!--  header .wrapper {-->
<!--    display: flex;-->
<!--    place-items: flex-start;-->
<!--    flex-wrap: wrap;-->
<!--  }-->
<!--}-->
<!--</style>-->

<script>
export default {
  data() {
    return {
      msg: 'Hello world!',
      userList: [
        {name: '小明'},
        {name: '小红'},
        {name: '小亮'},
      ],
      array: [1, 2, 3, 4, 5, 6, 7, 8, 9],
      inputBox: ''
    }
  },
  methods: {
    btnClick() {
      alert('我被点击了');
    }
  }
}
</script>