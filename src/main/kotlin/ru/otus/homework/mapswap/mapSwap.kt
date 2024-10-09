package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 */
fun <K, V : Any> Map<K, V>.swap(): Map<V, K> = this.map { it -> Pair(it.value, it.key) }.toMap()