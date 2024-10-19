package ru.otus.homework.mapswap
fun <K, V> Map<K, V>.swap(): Map<V, K> {
    return this.entries.associate { (key, value) -> value to key }
}
