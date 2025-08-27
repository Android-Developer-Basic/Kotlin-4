package ru.otus.homework

import ru.otus.homework.mapswap.swap
import ru.otus.homework.persons.Person
import ru.otus.homework.persons.sortByAge
import ru.otus.homework.persons.sortByName

fun main(){

    var persons = listOf<Person>(  Person("25", "25", 25), Person("Mike", "MM", 20), Person("Maria", "MM", 30) )
    persons = persons.sortByAge()
    println(persons.toString())
    persons = persons.sortByName()
    println(persons.toString())

    val kv = mapOf( 1 to "one", 2 to "two")
    //var test = hashMapOf( 1 to "one", 2 to "two")
    val vk = kv.swap()
    println(vk.toString())


    val myList = NaturalList(5)
    val subList = myList.subList(2, 4)
    println(subList.toString())

    val list11116 = listOf(1, 1, 1, 1, 6)
    val list222 = listOf(2, 2, 2)
    val arrayConstructor = Array(myList.size) { i -> i + 1}

    println(myList.containsAll(list11116))
    println(myList.containsAll(list222))
    println(myList.containsAll(arrayConstructor.toList()))

    val arrayList = listOf(1,2,3,4,5)
    val testSet = setOf<Int>(1,2,3)

    val hashCode = arrayList.hashCode()
    val myListHash = myList.hashCode()

    println("$hashCode $myListHash")

    println(myList.equals(testSet))
    println( myList.equals(arrayList))
    println(myList.equals(arrayConstructor.toList()))

}