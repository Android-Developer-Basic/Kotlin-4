package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 */
fun <K, V> Map<K, V>.swap(): Map<V, K> {
    //var swapMap = mutableMapOf<V,K>()
    val swapMap = LinkedHashMap<V,K>(this.size)

    val it = this.entries.iterator()
    while(it.hasNext()){
        val entry = it.next()
        val k = entry.key
        val v = entry.value
        swapMap[v] = k
    }

    return swapMap
}