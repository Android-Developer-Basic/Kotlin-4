package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 */
fun <K, V> Map<K, V>.swap(): Map<V, K> {
    val map: MutableMap<V,K> = mutableMapOf()
    for (it in this) {
        map.put(it.value, it.key)
    }
    return map
}