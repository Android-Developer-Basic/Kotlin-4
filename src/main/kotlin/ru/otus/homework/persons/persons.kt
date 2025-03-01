package ru.otus.homework.persons

/**
 * Отсортировать список персон по возрасту в порядке убывания
 */
fun List<Person>.sortByAge(): List<Person> = sortedByDescending { it.age }

/**
 * Отсортировать список персон по фамилии
 * - Фамилии сортируются по алфавиту в порядке возрастания
 * - Если фамилии совпадают, персоны сортируются по имени в порядке возрастания
 */
fun List<Person>.sortByName(): List<Person> = sortedWith(compareBy({it.surname}, {it.name}))


fun List<String>.mapToPerson(): List<Person> {
    return this.map {
        val name = it.split(", ")[0]
        val surname = it.split(", ")[1]
        val age = it.split(", ")[2]
        Person(name, surname, age.toInt())
    }
}

fun main() {
    val p = listOf(
        "Иван, Иванов, 1",
        "Сидор, Сидоров, 100",
        "Петр, Петров, 10",
        "Иван, Сидоров, 100"
    ).mapToPerson()

    println("Initial: $p")
    println("By Age:  ${p.sortByAge()}")
    println("By Name: ${p.sortByName()}")
}