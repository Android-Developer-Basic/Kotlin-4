package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 */
fun <K, V> Map<K, V>.swap(): Map<V, K> {
    val res = mutableMapOf<V, K>()
    for((i,k) in this){
        res[k] = i
    }
    return res
}