package ru.otus.homework.mapswap

import org.junit.jupiter.api.Assertions

/**
 * Меняет местами ключи и значения
 */
fun <K, V> Map<K, V>.swap(): Map<V, K> {
    val result = mutableMapOf<V, K>()
    for ((key, value) in this) {
        result[value] = key
    }
    return result
}
