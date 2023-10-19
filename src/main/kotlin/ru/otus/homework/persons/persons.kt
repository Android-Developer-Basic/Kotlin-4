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
fun List<Person>.sortByName(): List<Person> = sortedWith { p0, p1 ->
  if (p0.surname == p1.surname) {
    if (p0.name > p1.name) {
      1
    } else if (p0.name < p1.name) {
      -1
    } else 0
  } else {
    if (p0.surname > p1.surname) {
      1
    } else -1
  }
}