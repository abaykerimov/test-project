<template>
    <div>
        <text-list :texts="texts" />
    </div>
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