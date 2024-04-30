package ru.otus.homework

/**
 * Список натуральных чисел от 1 до n
 * @param n Последнее натуральное число в списке
 */
class NaturalList(n: Int) : List<Int> {
    override val size: Int = n

    override fun get(index: Int): Int = if (index in 0 until size) {
        index + 1
    } else {
        throw NoSuchElementException("No such index $index. Total elements: $size")
    }

    override fun isEmpty(): Boolean = 0 == size

    override fun iterator(): Iterator<Int> = NaturalIterator(size)

    override fun listIterator(): ListIterator<Int> = NaturalListIterator(size)

    override fun listIterator(index: Int): ListIterator<Int> = NaturalListIterator(size, index)

    override fun contains(element: Int): Boolean = element in 1..size

    override fun indexOf(element: Int): Int = if (contains(element)) {
        element - 1
    } else {
        -1
    }

    override fun lastIndexOf(element: Int): Int = indexOf(element)

    /**
     * Вернуть под-список этого списка, включая [fromIndex] и НЕ включая [toIndex]
     */
    override fun subList(fromIndex: Int, toIndex: Int): List<Int> {
        val newList: MutableList<Int> = mutableListOf()
        for (i in fromIndex until toIndex){
            newList.add(this[i])
        }
        return newList
    }

    /**
     * Returns true if list contains all numbers in the collection
     */
    override fun containsAll(elements: Collection<Int>): Boolean {
        val templist: MutableList<Int> = mutableListOf()
        for (i in this)
            templist.add(i)
        if (templist.containsAll(elements))
            return true
        else
            return false
    }

    override fun toString(): String {
        return "NaturalList(1..$size)"
    }

    /**
     * Функция должна возвращать true, если сравнивается с другой реализацией списка тех же чисел
     * Например, NaturalList(5) должен быть равен listOf(1,2,3,4,5)
     */
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is List<*>)  // если этот список null или не является списком, то дропаем
        {
            return false
        } else if (other.size != this.size) { // если размер этого списка не равен размеру другого, то дропаем
            return false
        }

        for (i in other.indices) { // Последняя проверка. Дропаем так же если объекты одного списк не равны объекту другого
            if (this[i] != other[i]) {
                return false
            }
        }
        // ...
        return true // Profit
    }

    /**
     * Функция должна возвращать тот же hash-code, что и список другой реализации тех же чисел
     * Например, NaturalList(5).hashCode() должен быть равен listOf(1,2,3,4,5).hashCode()
     */
    override fun hashCode(): Int{ // Считаем сами hashcode
        var hashCode = 1 // присваиваем единицу, чтобы не умножать на ноль
        for (i in this)
            hashCode = 31 * hashCode + i.hashCode() // 31 * 1 + реальный хэшкод и так по всем элементам.
        return hashCode // возвращаем пересчитанный хэшкод
    }
}

private class NaturalIterator(private val n: Int) : Iterator<Int> {
    private var index = 0
    override fun hasNext(): Boolean = index < n
    override fun next(): Int = if (hasNext()) {
        ++index
    } else {
        throw NoSuchElementException()
    }
}

private class NaturalListIterator(private val n: Int, index: Int = 0) : ListIterator<Int> {
    private var index:Int = index.coerceIn(0, n - 1)
    override fun hasNext(): Boolean = index < n
    override fun hasPrevious(): Boolean = index > 0
    override fun next(): Int = if (hasNext()) {
        ++index
    } else {
        throw NoSuchElementException()
    }
    override fun nextIndex(): Int = index
    override fun previous(): Int = if (hasPrevious()) {
        index--
    } else {
        throw NoSuchElementException()
    }
    override fun previousIndex(): Int = index
}