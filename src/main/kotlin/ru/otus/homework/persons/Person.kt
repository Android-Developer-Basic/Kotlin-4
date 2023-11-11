package ru.otus.homework.persons

/**
 * Запись в справочнике
 * @property name Имя
 * @property surname Фамилия
 * @property age Возраст
 */
data class Person(val name: String, val surname: String, val age: Int): Comparable<Person> {
    override fun compareTo(other: Person): Int {
        if(surname != other.surname) return surname.compareTo(other.surname)
        return name.compareTo(other.name)
    }

}