package ru.otus.homework.persons

/**
 * По-умолчанию используется сортировка по возрасту
 */
fun List<Person>.sortByAge(): List<Person> = sorted()
/**
 * Отсортировать список персон по фамилии
 * - Фамилии сортируются по алфавиту в порядке возрастания
 * - Если фамилии совпадают, персоны сортируются по имени в порядке возрастания
 */
fun List<Person>.sortByName(): List<Person> = sortedWith(compareBy(Person::surname).then(compareBy(Person::name)))
