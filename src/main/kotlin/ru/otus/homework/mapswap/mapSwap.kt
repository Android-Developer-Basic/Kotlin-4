package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 */
fun <K, V> Map<K, V>.swap(): Map<V, K> {
    val newKeys = this.values.toList()
    val newValues = this.keys.toList()
    return newKeys.zip(newValues).toMap()
}