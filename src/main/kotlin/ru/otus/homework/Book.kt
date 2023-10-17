package ru.otus.homework

class Book(val title: String, val year: Int) {

    operator fun component1(): String = title
    operator fun component2(): Int = year

    override fun equals(other: Any?): Boolean {
        println("Equals called on: $this with $other")
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Book

        if (title != other.title) return false
        if (year != other.year) return false

        return true
    }

    override fun hashCode(): Int {
        println("Hash-code called on: $this")
        var result = title.hashCode()
        result = 31 * result + year
        return result
    }

    override fun toString(): String {
        return "Book(title='$title', year=$year)"
    }
}