<template>
    <div>
        <input type="text" placeholder="Type any text" v-model="text" />
        <input type="button" value="Save" @click="save" />
    </div>
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
</style>