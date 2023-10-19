package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 */
fun <K, V> Map<K, V>.swap(): Map<V, K> {
    val answer: MutableMap<V, K> = mutableMapOf()
    forEach { answer[it.value] = it.key }
    return answer
}