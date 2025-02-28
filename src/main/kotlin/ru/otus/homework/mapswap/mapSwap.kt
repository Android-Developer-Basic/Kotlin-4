package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 */
fun <K, V> Map<K, V>.swap(): Map<V, K> {
    val result = mutableMapOf<V, K>()
    this.forEach {
        result[it.value] = it.key
    }
    return result
}




fun main() {
    val m = mapOf(
        1 to "one",
        2 to "two",
        3 to "three"
    )
    val s = m.swap()

    println("Initial: $m")
    println("Swapped: $s")
}