package ru.otus.homework.mapswap

fun <K, V> Map<K, V>.swap(): Map<V, K> {
    val invertedMap = mutableMapOf<V, K>()

    this.forEach {
        invertedMap[it.value] = it.key
    }
    return invertedMap
}