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
fun List<Person>.sortByName(): List<Person> = sortedWith(Comparator<Person>{ t1, t2 ->
    val compareSurname = t1.surname.compareTo(t2.surname)
    if (compareSurname == 0)
        return@Comparator t1.name.compareTo(t2.name)
    else
        return@Comparator compareSurname
})