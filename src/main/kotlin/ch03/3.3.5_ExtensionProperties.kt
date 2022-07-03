package ch03

val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length-1)
    set(value: Char) = setCharAt(length-1, value)

fun main(args: Array<String>) {
    println("Kotlin".lastChar)
    val sb = StringBuilder("Kotlin@")
    sb.lastChar = '!'
    println(sb)

    val list = listOf("args: ", *args)
    println(list)

}