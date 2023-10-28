package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 */
fun <K, V> Map<K, V>.swap(): Map<V, K> {

    var newMap = mutableMapOf<V,K>()
    for ((key, value ) in this){
        newMap[value] = key
    }
    return newMap
}
