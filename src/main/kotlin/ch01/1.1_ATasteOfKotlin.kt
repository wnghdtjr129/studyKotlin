package ch01

data class Person(val name: String, val age: Int? = null)

fun main() {
    val persons = listOf(Person("영희"), Person("철수", 29))

    val oldest = persons.maxByOrNull { it.age ?: 0 }
    println("The oldest is: $oldest")
}