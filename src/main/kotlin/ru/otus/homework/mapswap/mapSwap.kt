package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 */
fun <K, V> Map<K, V>.swap(): Map<V, K> {
    val map = mutableMapOf<V, K>()
    for (entries in this.entries) {
        map[entries.value] = entries.key
    }
    return map
}