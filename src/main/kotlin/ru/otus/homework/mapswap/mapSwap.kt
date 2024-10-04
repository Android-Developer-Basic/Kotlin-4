package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 */
fun <K, V> Map<K, V>.swap(): Map<V, K> {
    val res = mutableMapOf<V, K>()
    forEach {
        res[it.value] = it.key
    }

    return res
}