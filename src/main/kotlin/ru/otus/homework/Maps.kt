package ru.otus.homework

import kotlin.system.measureNanoTime

fun main() {
    val absList = createAbsList().mapToBook()
    val unwrittenBook = Book("Книга которой нет", 2023)

    Book.logHashcode = false
    val absYearMap = absList.associateWith { it.year }
    Book.logHashcode = true
    println("Время поиска года в Map по книге: " + measureNanoTime { absYearMap[unwrittenBook] })
}