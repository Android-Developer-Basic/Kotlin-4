package ru.otus.homework.mapswap

/**
 * Меняет местами ключи и значения
 */

fun <K, V> Map<K, V>.swap() = this.map { (k, v) -> v to k }.toMap()