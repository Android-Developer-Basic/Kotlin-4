package ru.otus.homework.persons

fun List<Person>.sortByAge(): List<Person> = this.sortedByDescending { it.age }
