package ru.otus.homework

fun main() {
    val iBox: GenericBox = createBox(10)
    val iAnyValue: Any = iBox.value
    val i: Int = iAnyValue as Int

    val fBox: GenericBox = createBox(10F)
    val fAnyValue: Any = fBox.value
    val f: Float = fAnyValue as Float

    val sBox: GenericBox = createBox("Ten")
    val sAnyValue: Any = sBox.value
    val s: String = sAnyValue as String

    println("${i.toString()}, $f, $s")
}

data class GenericBox(val value: Any)
fun createBox(value: Any): GenericBox = GenericBox(value)