<template>
    <v-layout row>
        <v-form>
            <v-text-field
                    label="New text"
                    placeholder="Type here"
                    v-model="text"
            />
            <v-btn @click="save">
                Save
            </v-btn>
        </v-form>
    </v-layout>
</template>

<script>
    export default {
        props: ['texts', 'textAttr'],
        data: function() {
            return {
                text: '',
            }
        },
        watch: {
            textAttr: function(newVal) {
                this.text = newVal.text;
            }
        },
        methods: {
            save() {
                const text = { text: this.text };
                this.$resource('/text').save(text).then(result =>
                    result.json().then(data => {
                        this.texts.push(data);
                        this.text = ''
                    })
                )
            }
        }
    }
</script>

<style>
    button {
        margin-left: 0 !important;
        margin-top: 0 !important;
    }
</style>