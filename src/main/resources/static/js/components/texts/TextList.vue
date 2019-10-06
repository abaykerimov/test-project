<template>
    <div style="position: relative; width: 300px;">
        <text-form :texts="texts" :textAttr="text" />
        <v-layout align-space-around justify-start column>
            <v-card class="my-2">
                <v-card-text primary-title
                             v-for="text in texts"
                             v-bind:data="text"
                             v-bind:key="text.id">
                    {{ text.text }}
                </v-card-text>
            </v-card>
        </v-layout>
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