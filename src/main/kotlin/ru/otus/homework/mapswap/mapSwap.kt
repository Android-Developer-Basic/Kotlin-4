package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 */
fun <K, V> Map<K, V>.swap(): Map<V, K> {
    var result= mutableMapOf<V,K>()
    for(entry in this){
        result.put(entry.value, entry.key)
    }
    return result
}
