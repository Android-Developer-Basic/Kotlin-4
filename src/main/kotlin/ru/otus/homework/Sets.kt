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
    println("numSet3: $numSet3") // [1, 2, 3, 4, 5]
    val numSet4 = numSet3 - 1
    println("numSet4: $numSet4") // [2, 3, 4, 5]

    val diff = setOf(1, 2, 3, 4, 5) - setOf(2, 4)
    println("diff: $diff") // [1, 3, 5]
    val sum = setOf(1, 3, 5) + setOf(2, 4)
    println("sum: $sum") // [1, 3, 5, 2, 4]
}
