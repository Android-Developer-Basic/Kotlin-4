package ru.otus.homework.persons

import java.util.Comparator

/**
 * Отсортировать список персон по возрасту в порядке убывания
 *
 */
fun List<Person>.sortByAge(): List<Person> = sortedByDescending { it.age }


/**
 * Отсортировать список персон по фамилии
 * - Фамилии сортируются по алфавиту в порядке возрастания
 * - Если фамилии совпадают, персоны сортируются по имени в порядке возрастания
 */
fun List<Person>.sortByName(): List<Person>{
    val customComparator = Comparator{ obj1: Person, obj2: Person ->
            if(obj1.surname != obj2.surname){
                if (obj1.surname > obj2.surname) return@Comparator 1
                else return@Comparator -1
            }
            else{
                if (obj1.name > obj2.name) return@Comparator 1
                else if (obj1.name < obj2.name) return@Comparator -1
                else return@Comparator 0
            }
         }

    return sortedWith(customComparator)
}