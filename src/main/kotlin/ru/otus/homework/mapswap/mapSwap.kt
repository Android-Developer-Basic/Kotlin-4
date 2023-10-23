package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 */
fun <K, V> Map<K, V>.swap(): Map<V, K> {
    val newMap= mutableMapOf<V,K>()
    this.forEach() { K, V ->
        newMap.put(V,K)
    }
    return newMap
}