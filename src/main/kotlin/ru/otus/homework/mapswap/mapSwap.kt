package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 */
fun <K, V> Map<K, V>.swap(): Map<V, K> = this.entries.associate { (key, value) -> value to key }
fun <K, V> Map<K, V>.swapForEach(): Map<V, K> {
    val swappedMap = mutableMapOf<V, K>()
    this.forEach { (key, value) ->
        swappedMap[value] = key
    }
    return swappedMap
}

fun <K, V> Map<K, V>.swapMapValues(): Map<V, K> = this.mapValues { it.value to it.key }.map { it.value }.toMap()