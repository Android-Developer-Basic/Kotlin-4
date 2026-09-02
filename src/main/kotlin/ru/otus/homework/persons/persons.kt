package ru.otus.homework.persons

import kotlin.comparisons.compareBy

/**
 * Отсортировать список персон по возрасту в порядке убывания
 */
fun List<Person>.sortByAge(): List<Person> =
    this.sortedByDescending { it.age }
/**
 * Отсортировать список персон по фамилии
 * - Фамилии сортируются по алфавиту в порядке возрастания
 * - Если фамилии совпадают, персоны сортируются по имени в порядке возрастания
 */
fun List<Person>.sortByName(): List<Person> =
    this.sortedWith(compareBy(
            { it.surname }, // Первый критерий: фамилия
            { it.name }      // Второй критерий: имя (сработает, если фамилии равны)
        ))