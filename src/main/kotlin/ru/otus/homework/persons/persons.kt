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
fun List<Person>.sortByName(): List<Person> = sortedBy { "${it.surname} ${it.name}" }
fun List<Person>.sortByNameComparator(): List<Person> = sortedWith { p1: Person, p2: Person ->
    when {
        p1.surname > p2.surname -> 1
        p1.surname < p2.surname -> -1
        else ->
            when {
                p1.name > p2.name -> 1
                p1.name < p2.name -> -1
                else -> 0
            }
    }
}