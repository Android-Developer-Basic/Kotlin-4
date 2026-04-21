package ru.otus.homework

import ru.otus.homework.mapswap.swap
import ru.otus.homework.persons.Person
import ru.otus.homework.persons.sortByAge
import ru.otus.homework.persons.sortByName

fun main() {

    val persons = listOf(
        Person("Ivan", "Petrov", 10),
        Person("Sergey", "Petrov", 35),
        Person("Tatyana", "Petrova", 36),
        Person("Natalya", "Sidorova", 50),
        Person("Nilolay", "Zatochkin", 65)
    )

    println("1. Сортировка справочника по возрасту")
    println("sortByAge:")
    persons.sortByAge().forEach(::println)
    println()

    println("2. Сортировка справочника по имени")
    println("sortByName:")
    persons.sortByName().forEach(::println)
    println()

    println("3. Переворот Map")
    val sourceMap = mapOf(
        1 to "one",
        2 to "two",
        3 to "three"
    )
    println("sourceMap:")
    sourceMap.forEach { (key, value) -> println("$key -> $value") }
    println("swap:")
    sourceMap.swap().forEach { (key, value) -> println("$key -> $value") }
    println()

    println("4. Собственный List")
    val naturalList = NaturalList(5)
    println("naturalList: $naturalList")
    println("subList(1, 3): ${naturalList.subList(1, 3)}")
    println("containsAll(listOf(1, 2, 3, 4, 5)): ${naturalList.containsAll(listOf(1, 2, 3, 4, 5))}")
    println("containsAll(listOf(1, 2, 3, 4, 5, 6)): ${naturalList.containsAll(listOf(1, 2, 3, 4, 5, 6))}")
    println()

    println("5. equals() и hashCode() для списка")
    val kotlinList = listOf(1, 2, 3, 4, 5)
    println("naturalList == kotlinList: ${naturalList == kotlinList}")
    println("kotlinList == naturalList: ${kotlinList == naturalList}")
    println("naturalList.hashCode(): ${naturalList.hashCode()}")
    println("kotlinList.hashCode(): ${kotlinList.hashCode()}")
}
