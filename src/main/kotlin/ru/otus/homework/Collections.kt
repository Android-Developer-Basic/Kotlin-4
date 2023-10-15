package ru.otus.homework

fun main() {
    println(createBox(10))
    println(createBox(10F))
    println(createBox("Ten"))
}

data class GenericBox<D>(val value: D)
fun <D> createBox(value: D): GenericBox<D> = GenericBox(value)