package ru.otus.homework

fun main() {
    val abs: List<String> = createAbsList()
    val absBooks: List<Book> = abs.mapToBook()
    println("Список книг:")
    println(absBooks)

    val shuffled = absBooks.shuffled()
    println("Перемешанные книги:")
    println(shuffled)

    val sortedByYear = shuffled.sortByYear()
    println("Сортированные книги по году:")
    println(sortedByYear)

    val sortedByO = shuffled.toMutableList()
    sortedByO.onlyWithO()
    sortedByO.sortByO()

    println("Сортированные книги по букве `О` только с буквой `О`:")
    println(sortedByO)
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

data class Book(val title: String, val year: Int)

internal fun List<String>.mapToBook(): List<Book> {
    val regex = "([^(]+)\\((\\d+)".toRegex()
    return mapNotNull { regex.find(it) }
        .map { it.destructured }
        .map { (title, year) -> Book(title.trim(), year.toInt()) }
}

internal fun List<Book>.sortByYear(): List<Book> = sortedBy { it.year }

internal fun MutableList<Book>.sortByO() {
    sortWith(
        compareBy<Book> { (title,_)  -> title.count { 'о' == it || 'О' == it} }.reversed()
    )
}

internal fun MutableList<Book>.onlyWithO() {
    this.retainAll { (title, _) -> title.any { 'о' == it || 'О' == it } }
}