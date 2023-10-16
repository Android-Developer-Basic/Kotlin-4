package ru.otus.homework

fun main() {
    EntranceDoor.use()
    BathroomDoor.use()
    RoomDoor.use()
    println("Наконец-то дома!")
}

interface Door {
    fun open()
    fun close()
}

fun Door.use() {
    this.open()
    this.close()
}

object RoomDoor : Door {
    override fun open() {
        println("Дверь в комнату открывается")
    }

    override fun close() {
        println("Дверь в комнату закрыватся")
    }
}

object EntranceDoor : Door {
    override fun open() {
        println("Входная дверь открывается")
    }

    override fun close() {
        println("Входная дверь закрыватся")
    }
}

object BathroomDoor : Door {
    override fun open() {
        println("Дверь в ванную открывается")
    }

    override fun close() {
        println("Дверь в ванную закрыватся")
    }
}
