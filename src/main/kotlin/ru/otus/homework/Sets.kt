package ru.otus.homework

import kotlin.system.measureNanoTime

fun main() {
    val absList = createAbsList().mapToBook()
    val unwrittenBook = Book("Книга которой нет", 2023)
    println("Время поиска в List: " + measureNanoTime { absList.contains(unwrittenBook) })

    Book.logHashcode = false
    val absSet = absList.toSet()
    Book.logHashcode = true
    println("Время поиска в Set: " + measureNanoTime { absSet.contains(unwrittenBook) })

    val numSet: Set<Int> = setOf(1, 2, 3)
    println("2 находится в наборе: " + numSet.contains(2)) // true
    println("5 находится в наборе: " + numSet.contains(5)) // false

    val listToAdd = listOf(4, 4, 4, 4, 4)
    println("listToAdd: $listToAdd") // [4, 4, 4, 4, 4]
    val numSet2 = numSet + listToAdd
    println("numSet2: $numSet2") // [1, 2, 3, 4]
    val numSet3 = numSet2 + 5
    println("numSet3: $numSet3")
}
