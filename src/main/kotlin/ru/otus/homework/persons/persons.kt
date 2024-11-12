package ru.otus.homework.persons

fun main(){
    listOf<Person>().sortByAge()
}

fun List<Person>.sortByAge(): List<Person> = this.sortedByDescending { it.age }

fun List<Person>.sortByName(): List<Person> = this.sortedWith(compareBy{it.surname})