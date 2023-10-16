package ru.otus.homework

fun main() {
    val abs = createAbsList()
    println(abs)
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
