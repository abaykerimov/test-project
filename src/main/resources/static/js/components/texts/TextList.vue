<template>
    <div style="position: relative; width: 300px;">
        <text-form :texts="texts" :textAttr="text" />
        <div v-for="text in texts">
            {{ text.text }}
            <span style="position: absolute; right: 0"></span>
        </div>
    </div>
</template>

<script>
    import TextForm from 'components/texts/TextForm.vue'
    export default {
        props: ['texts'],
        components: {
            TextForm
        },
        data() {
            return {
                text: null
            }
        }
    }
</script>

<style>
</style>