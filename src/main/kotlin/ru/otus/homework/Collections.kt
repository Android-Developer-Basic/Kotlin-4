package ru.otus.homework

fun main() {
    val iBox: GenericBox<Int> = createBox(10)
    val i: Int = iBox.value

    val fBox: GenericBox<Float> = createBox(10F)
    val f: Float = fBox.value

    val sBox: GenericBox<String> = createBox("Ten")
    val s: String = sBox.value

    println("${i.toString()}, $f, $s")
}

data class GenericBox<D>(val value: D)
fun <D> createBox(value: D): GenericBox<D> = GenericBox(value)