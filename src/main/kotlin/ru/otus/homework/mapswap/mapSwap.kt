package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 */
fun <K, V> Map<K, V>.swap(): Map<V, K>  {
    val result: MutableMap<V,K> = mutableMapOf<V, K>()
    for (item in this){
        result[item.value] = item.key
    }
    return result
}