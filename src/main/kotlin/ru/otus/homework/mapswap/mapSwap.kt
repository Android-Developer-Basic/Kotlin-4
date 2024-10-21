package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 */
fun <K, V> Map<K, V>.swap(): Map<V, K>{
    val mapTemp: MutableMap<V, K> = mutableMapOf()
    for(i in this){ mapTemp[i.value] = i.key }
    return mapTemp.toMap()
}