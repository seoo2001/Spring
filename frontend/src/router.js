import { createWebHistory, createRouter } from "vue-router";

import Home from "./views/HomePage.vue";
import Error from "./views/ErrorPage.vue";
import Input from "./views/InputPage.vue";
import NotFound from "./views/NotFoundPage.vue";
const routes = [
    {
        path: "/",
        name: "Input",
        component: Input,
    },
    {
        path: "/home",
        name: "Home",
        component: Home,
    },
    {
        path: "/error-vue",
        name: "Error",
        component: Error,
    },
    {
        path: "/notFound",
        name: "notFound",
        component: NotFound
    },
    {
        path: "/:pathMatch(.*)*",
        redirect: "/notFound"
    }
];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;