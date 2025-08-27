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

}