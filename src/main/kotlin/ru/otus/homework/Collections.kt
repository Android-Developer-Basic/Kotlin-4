package ru.otus.homework

fun main() {
    println(createBox(10))
    println(createBox(10F))
    println(createBox("Ten"))
}

data class IntBox(val value: Int)
fun createBox(int: Int): IntBox = IntBox(int)

data class FloatBox(val value: Float)
fun createBox(flt: Float): FloatBox = FloatBox(flt)

data class StringBox(val value: String)
fun createBox(str: String): StringBox = StringBox(str)