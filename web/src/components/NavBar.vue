<template>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container">
        <router-link class="navbar-brand" :to="{name: 'home'}">BotsFight</router-link>
        <div class="collapse navbar-collapse" id="navbarText">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <li class="nav-item">
            <router-link :class="route_name == 'pk_index' ? 'nav-link active' : 'nav-link'" :to="{name: 'pk_index'}">Fight</router-link>
            </li>
            <li class="nav-item">
            <router-link :class="route_name == 'record_index' ? 'nav-link active' : 'nav-link'" :to="{name: 'record_index'}">Records</router-link>
            </li>
            <li class="nav-item">
            <router-link :class="route_name == 'ranklist_index' ? 'nav-link active' : 'nav-link'" :to="{name: 'ranklist_index'}">Ranking</router-link>
            </li>
        </ul>
        <ul class="navbar-nav">
            <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Jie
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <router-link class="dropdown-item" :to="{name: 'user_bot_index'}">My Bot</router-link>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">Logout</a></li>
          </ul>
        </li>
        </ul>
        </div>
    </div>
    </nav>
</template>

<script>
import { useRoute } from 'vue-router';
import { computed } from 'vue';

export default {
    setup() {
        const route = useRoute();
        let route_name = computed(() => route.name)
        return {
            route_name
        }
    }
}
</script>

<style scoped>

</style>