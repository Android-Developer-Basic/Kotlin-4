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

    val numMap: Map<String, Int> = mapOf(
        "Один" to 1,
        "Два" to 2,
        "Три" to 3
    )
    println("Дай мне цифру `Два`: " + numMap["Два"]) // 2
    println("Дай мне цифру `Пять`: " + numMap["Пять"]) // null
    println("Дай мне цифру `два`: " + numMap["два"]) // null

    val listToAdd: List<Pair<String, Int>> = listOf(
        "Четыре" to 444,
        "Четыре" to 44,
        "Четыре" to 4
    )
    println("listToAdd: $listToAdd") // [(Четыре, 444), (Четыре, 44), (Четыре, 4)]
    val numMap2 = numMap + listToAdd
    println("numMap2: $numMap2") // {Один=1, Два=2, Три=3, Четыре=4}
    val numMap3 = numMap2 + ("Пять" to 5)
    println("numMap3: $numMap3") // {Один=1, Два=2, Три=3, Четыре=4, Пять=5}
    val numMap4 = numMap3 - "Четыре"
    println("numMap4: $numMap4") // {Один=1, Два=2, Три=3, Пять=5}
}