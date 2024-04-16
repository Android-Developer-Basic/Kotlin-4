package ru.otus.homework.persons

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PersonsKtTest {
    private companion object {
        val P1 = Person("Ivan", "Petrov", 10)
        val P2 = Person("Sergey", "Petrov", 35)
        val P3 = Person("Tatyana", "Petrova", 36)
        val P4 = Person("Natalya", "Sidorova", 50)
        val P5 = Person("Nilolay", "Zatochkin", 65)
    }

    private val persons = listOf(P1, P2, P3, P4, P5).shuffled()

    @Test
    fun sortsByAge() {
        assertEquals(
            listOf(P5, P4, P3, P2, P1),
            persons.sortByAge()
        )
    }

    @Test
    fun sortsByNames() {
        assertEquals(
            listOf(P1, P2, P3, P4, P5),
            persons.sortByName()
        )
    }
}