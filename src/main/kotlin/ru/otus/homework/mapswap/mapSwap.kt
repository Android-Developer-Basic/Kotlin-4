package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 */
fun <K, V> Map<K, V>.swap(): Map<V, K> = entries.associate { (k, v) -> v to k }


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