package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 */
fun <K, V> Map<K, V>.swap(): Map<V, K>{
    return map { it -> Pair(it.value, it.key) }.toMap()
}