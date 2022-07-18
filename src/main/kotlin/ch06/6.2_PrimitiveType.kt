package ch06

fun showProgress(progress: Int) {
    val percent: Int = progress.coerceIn(0, 100) //int
    println("We're $percent% done!")
}

data class Person(val name: String, val age: Int? = null){
    fun isOrderThan(other: Person): Boolean?{
        if (age == null || other.age == null) {
            return null;
        }
        return age > other.age
    }
}

interface Processor<T>{
    fun process(): T
}

class NoResultProcessor : Processor<Unit> {
    override fun process() {
        println("hello")
    }
}

fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}
fun main() {
    showProgress(146)
    println(Person("personA", 10).isOrderThan(Person("personB")))
    println(Person("personA", 10).isOrderThan(Person("personB", 20)))

    val i = 1
//    val l: Long = i --> 자동 캐스팅 불가
    val l: Long = i.toLong()
    val l1: Long = i + 0L
    val answer: Any = 42

    fail("Error occurred")
}