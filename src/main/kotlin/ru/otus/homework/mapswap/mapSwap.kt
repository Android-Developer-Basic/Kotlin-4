package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 */
fun <K, V> Map<K, V>.swap(): Map<V, K>{
    val resultMap:MutableMap<V,K> = mutableMapOf()
    forEach{resultMap.put(it.value,it.key)}
    return resultMap.toMap()
}