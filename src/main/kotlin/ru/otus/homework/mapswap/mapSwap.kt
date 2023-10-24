package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 */
fun <K, V> Map<K, V>.swap(): Map<V, K> {
    val changedMap = mutableMapOf<V, K>()
    this.forEach {(key, value) -> changedMap.put(value, key)}
    return changedMap
}

