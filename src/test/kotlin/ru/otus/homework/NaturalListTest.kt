package ru.otus.homework

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NaturalListTest {

    @Test
    fun returnsRequestedSize() {
        val list = NaturalList(5)
        assertEquals(5, list.size)
    }

    @Test
    fun nonEmptyListIsNotEmpty() {
        val list = NaturalList(5)
        assertFalse(list.isEmpty())
    }

    @Test
    fun emptyListIsEmpty() {
        val list = NaturalList(0)
        assertTrue(list.isEmpty())
    }

    @Test
    fun firstElementIsOne() {
        val list = NaturalList(5)
        assertEquals(1, list[0])
    }

    @Test
    fun lastElementIsN() {
        val list = NaturalList(5)
        assertEquals(5, list.last())
    }

    @Test
    fun returnsElementInRange() {
        val list = NaturalList(5)
        assertEquals(4, list[3])
    }

    @Test
    fun throwsIfElementIsOutOfRange() {
        val list = NaturalList(5)
        assertThrows(NoSuchElementException::class.java) { list[5] }
        assertThrows(NoSuchElementException::class.java) { list[-1] }
    }

    @Test
    fun iteratorWorksTillTheEnd() {
        val list = NaturalList(2)
        val iterator = list.iterator()

        assertTrue(iterator.hasNext())
        assertEquals(1, iterator.next())

        assertTrue(iterator.hasNext())
        assertEquals(2, iterator.next())

        assertFalse(iterator.hasNext())
        assertThrows(NoSuchElementException::class.java) { iterator.next() }
    }

    @Test
    fun listIteratorWorksTillTheEnd() {
        val list = NaturalList(2)
        val iterator = list.listIterator(1)

        assertTrue(iterator.hasNext())
        assertEquals(2, iterator.next())

        assertFalse(iterator.hasNext())
        assertThrows(NoSuchElementException::class.java) { iterator.next() }
    }

    @Test
    fun listIteratorWorksTillTheBeginning() {
        val list = NaturalList(2)
        val iterator = list.listIterator(1)

        assertTrue(iterator.hasPrevious())
        assertEquals(1, iterator.previous())

        assertFalse(iterator.hasPrevious())
        assertThrows(NoSuchElementException::class.java) { iterator.previous() }
    }

    @Test
    fun containsElementInRange() {
        val list = NaturalList(2)
        assertTrue(list.contains(2))
    }

    @Test
    fun doesNotContainElementNotInRange() {
        val list = NaturalList(2)
        assertFalse(list.contains(0))
        assertFalse(list.contains(3))
    }

    @Test
    fun returnsIndexOfElementInRange() {
        val list = NaturalList(2)
        assertEquals(1, list.indexOf(2))
    }

    @Test
    fun returnsMinusOneIfElementNotInRange() {
        val list = NaturalList(2)
        assertEquals(-1, list.indexOf(0))
        assertEquals(-1, list.indexOf(3))
    }

    @Test
    fun returnsLastIndexOfElementInRange() {
        val list = NaturalList(2)
        assertEquals(1, list.lastIndexOf(2))
    }

    @Test
    fun returnsMinusOneForLastIndexIfElementNotInRange() {
        val list = NaturalList(2)
        assertEquals(-1, list.lastIndexOf(0))
        assertEquals(-1, list.lastIndexOf(3))
    }

    @Test
    fun returnsValidSublist() {
        val list = NaturalList(5)
        val subList = list.subList(1, 3)
        assertEquals(2, subList.size)
        assertEquals(2, subList[0])
        assertEquals(3, subList[1])
    }

    @Test
    fun returnsTrueIfListContainsAllNumbers() {
        val list = NaturalList(5)
        assertTrue(list.containsAll(listOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun returnsFalseIfListDoesNotContainAnyNumber() {
        val list = NaturalList(5)
        assertFalse(list.containsAll(listOf(1, 2, 3, 4, 5, 6)))
    }

    @Test
    fun equalsToOtherListWithSameValues() {
        assertEquals(
            listOf(1, 2, 3, 4, 5),
            NaturalList(5)
        )
    }

    @Test
    fun otherListEqualsWithSameValues() {
        assertEquals(
            NaturalList(5),
            listOf(1, 2, 3, 4, 5)
        )
    }

    @Test
    fun hashCodeOfEqualListEquals() {
        assertEquals(
            listOf(1, 2, 3, 4, 5).hashCode(),
            NaturalList(5).hashCode()
        )
    }
}