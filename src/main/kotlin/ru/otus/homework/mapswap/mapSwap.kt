package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 */
fun <K, V : Any> Map<K, V>.swap(): Map<V, K> = this.entries.associateTo(
  mutableMapOf<V, K>()
) {
  it.value to it.key
}