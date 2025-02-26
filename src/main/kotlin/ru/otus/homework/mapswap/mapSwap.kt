package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 */
fun <K, V> Map<K, V>.swap(): Map<V, K> {
//    return this.map { (key, value) -> value to key }.toMap()
//    return this.entries.associate { (key, value) -> value to key }
    val result: MutableMap<V, K> = emptyMap<V, K>().toMutableMap()

    for (m in this) {
        result[m.value] = m.key
    }

    return result.toMap()
}