package ru.otus.homework.persons

/**
 * Отсортировать список персон по возрасту в порядке убывания
 */
fun List<Person>.sortByAge(): List<Person> = sortedByDescending { it.age }

/**
 * Альтернативная функция сортировки, с использованием [Comparator]
 * */
fun List<Person>.sortByAgeWithComparator(): List<Person> = sortedWith { it1, it2 -> it2.age - it1.age }


/**
 * Отсортировать список персон по фамилии
 * - Фамилии сортируются по алфавиту в порядке возрастания
 * - Если фамилии совпадают, персоны сортируются по имени в порядке возрастания
 */
fun List<Person>.sortByName(): List<Person> = TODO("Доделать sortBySurname")