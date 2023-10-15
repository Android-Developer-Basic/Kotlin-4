package ru.otus.homework

fun main() {
    println(createBox(10))
}

data class IntBox(val value: Int)
fun createBox(int: Int): IntBox = IntBox(int)