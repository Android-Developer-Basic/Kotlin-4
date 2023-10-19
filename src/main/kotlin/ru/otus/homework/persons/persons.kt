package ru.otus.homework.persons

fun List<Person>.sortByAge(): List<Person> = this.sortedByDescending { it.age } //1 задание

fun List<Person>.sortByName(): List<Person> = this.sortedWith(compareBy<Person> { it.surname }.thenBy { it.name }) //2 задание