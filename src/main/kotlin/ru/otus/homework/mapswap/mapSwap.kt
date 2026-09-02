package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 * памятка: associate оставит только последнее встреченное значение (по порядку обхода) т.е. из {1: "a", 2: "a"} сделает {"a": 2}
 */
fun <K, V> Map<K, V>.swap(): Map<V, K> = entries.associate { (key, value) -> value to key }