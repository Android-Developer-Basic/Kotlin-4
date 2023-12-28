package ru.otus.homework.persons

/**
 * Отсортировать список персон по возрасту в порядке убывания
 */
fun List<Person>.sortByAge(): List<Person> = sortedByDescending { x ->  x.age }

/**
 * Отсортировать список персон по фамилии
 * - Фамилии сортируются по алфавиту в порядке возрастания
 * - Если фамилии совпадают, персоны сортируются по имени в порядке возрастания
 */
fun List<Person>.sortByName(): List<Person> = sortedWith(PersonComparator)

val PersonComparator = Comparator{ p1: Person, p2: Person ->
    if (p1.surname > p2.surname)
        return@Comparator 1

    if (p1.surname < p2.surname)
        return@Comparator -1
    else{
        if (p1.name > p2.name)
            return@Comparator 1

        if (p1.name < p2.name)
            return@Comparator -1
        else
            return@Comparator 0
    }
}