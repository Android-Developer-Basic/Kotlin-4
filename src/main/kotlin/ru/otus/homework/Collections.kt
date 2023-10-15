package ru.otus.homework

fun main() {
    println("-= Array =-")
    val a1 = Array(3) { it }
    println("Размер массива: ${a1.size}")
    println("Итерация по массиву:")
    for (element in a1) { println(element) }
    println("Чтение элемента по индексу 1: ${a1[1]}")
    // Можно изменить элемент массива
    a1[1] = 100
    println("Массив после изменения элемента по индексу 1: ${a1.joinToString()}")
    // Добавить элемент в массив нельзя - только создать новый, скопировав старый
    val a2 = a1.plus(200)
    println("Новый массив : ${a2.joinToString()}")

    println("-= List =-")
    val l1 = listOf(1, 2, 3)
    println("Размер списка: ${l1.size}")
    println("Элементы списка:")
    for (element in l1) { println(element) }
    println("Чтение элемента по индексу 1: ${l1[1]}")
    // Элемент List изменить нельзя
    // Добавить элемент в List нельзя - только создать новый, скопировав старый
    val l2 = l1.plus(100)
    println("Новый список : $l2")

    println("-= MutableList =-")
    val ml = mutableListOf(0, 1, 2)
    println("MutableList - это List? ${ ml is List<Int> }")
    // Можно изменить элемент MutableList
    ml[1] = 100
    println("MutableList после изменения элемента по индексу 1: $ml")
    // В MutableList можно добавить элемент
    ml.add(300)
    println("MutableList после добавления элемента: $ml")
}
