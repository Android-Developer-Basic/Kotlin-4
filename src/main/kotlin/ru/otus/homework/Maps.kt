package ru.otus.homework

import kotlin.system.measureNanoTime

fun main() {
    val absList = createAbsList().mapToBook()
    val unwrittenBook = Book("Книга которой нет", 2023)
    println("Время поиска в List: " + measureNanoTime { absList.contains(unwrittenBook) })

    val absMap = absList.associateBy { it.year }
    println("Время поиска в Map by году: " + measureNanoTime { absMap[unwrittenBook.year] })

    Book.logHashcode = false
    val absYearMap = absList.associateWith { it.year }
    Book.logHashcode = true
    println("Время поиска года в Map по книге: " + measureNanoTime { absYearMap[unwrittenBook] })
}