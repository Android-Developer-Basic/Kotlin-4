package ru.otus.homework

fun main() {
    val abs: List<String> = createAbsList()
    val absBooks: List<Book> = abs.mapToBook()
    println(absBooks)
}

fun createAbsList(): List<String> {
    val result = mutableListOf(
        "Полдень, XXII век (1962)"
    )

    // добавить в конец
    result.add("Обитаемый остров (1969)")

    // вставить в середину
    result.add(1, "Трудно быть богом (1964)")

    // добавить другой список
    result.addAll(listOf(
        "Жук в муравейнике» (1980)",
        "Волны гасят ветер» (1986)"
    ))

    return result
}

data class Book(val title: String, val year: Number)

internal fun List<String>.mapToBook(): List<Book> {
    val regex = "([^(]+)\\((\\d+)".toRegex()
    return mapNotNull { regex.find(it) }
        .map { it.destructured }
        .map { (title, year) -> Book(title.trim(), year.toInt()) }
}
