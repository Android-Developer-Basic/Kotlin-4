package ru.otus.homework.persons

/**
 * Запись в справочнике
 * @property name Имя
 * @property surname Фамилия
 * @property age Возраст
 */
data class Person(val name: String, val surname: String, val age: Int): Comparable<Person> {
    override fun compareTo(other: Person): Int {
        var res = this.surname.compareTo(other.surname)
        if(res == 0)
            res = this.surname.compareTo(other.name)

        return res
    }
}