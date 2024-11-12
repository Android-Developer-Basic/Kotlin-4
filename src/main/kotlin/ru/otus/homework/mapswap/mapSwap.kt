package ru.otus.homework.mapswap

fun <K, V> Map<K, V>.swap(): Map<V, K> {

    val result = HashMap<V, K>()
    for (key in this.keys) {
        val target = this[key] ?: continue
        result[target] = key
    }
    return result
}
