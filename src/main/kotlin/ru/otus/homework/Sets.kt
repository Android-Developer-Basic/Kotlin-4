package ru.otus.homework

import kotlin.system.measureNanoTime

fun main() {
    val absList = createAbsList().mapToBook()
    val unwrittenBook = Book("Книга которой нет", 2023)

    Book.logHashcode = false
    val absSet = absList.toSet()
    Book.logHashcode = true
    println("Время поиска в Set: " + measureNanoTime { absSet.contains(unwrittenBook) })
}
