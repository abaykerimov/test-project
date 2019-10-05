<template>
    <v-app>
        <v-toolbar app>
            <v-toolbar-title>Simple text project</v-toolbar-title>
            <v-spacer></v-spacer>
        </v-toolbar>
        <v-content>
            <v-container>
                <text-list :texts="texts" />
            </v-container>
        </v-content>
    </v-app>
</template>

<script>
    import TextList from 'components/texts/TextList.vue'
    export default {
        components: {
            TextList
        },
        data() {
            return {
                texts: textData
            }
        }
    }
</script>

<style>
</style>