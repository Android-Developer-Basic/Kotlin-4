package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 */
//fun <K, V> Map<K, V>.swap(): Map<V, K> = this.map { (k, v) -> v to k }.toMap()

fun <K, V> Map<K, V>.swap(): Map<V, K> {

    val result = mutableMapOf<V, K>()
    this.forEach { (k, v) -> result.put(v, k) }
    return result
}