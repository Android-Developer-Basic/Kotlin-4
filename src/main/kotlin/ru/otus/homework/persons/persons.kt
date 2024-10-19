package ru.otus.homework.persons
fun List<Person>.sortByAge(): List<Person> {
    return this.sortedByDescending { it.age }
}
fun List<Person>.sortByName(): List<Person> {
    return this.sortedWith(compareBy<Person> { it.surname }.thenBy { it.name })
}
