package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 */
fun <K, V> Map<K, V>.swap(): Map<V, K> {
    val m = mutableMapOf<V, K>()
    for(elem in this){
        m[elem.value] = elem.key
    }
    return m
}