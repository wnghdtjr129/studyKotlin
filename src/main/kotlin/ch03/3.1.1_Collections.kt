package ch03

import ch03.strings.joinToString
import ch03.strings.join
import ch03.strings.lastChar as last
import java.lang.StringBuilder

fun main() {
    val set = hashSetOf(1, 7, 53)
    val list = arrayListOf(1, 2, 3)
    val list1 = arrayListOf("1", "2", "3")
    val map = hashMapOf(1 to "one", 7 to "seven")

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    println(list)
    println(joinToStringV1(list, separator = "; ", prefix = "(", postfix = ")"))
    println(joinToStringV2(list))
    println(joinToString(list, ", "))

    println("Kotlin".last())
    println("Kotlin".last())

    println(joinToString(list))
    println(list.joinToString(prefix = "(", postfix = ")"))
    println(list1.joinToString(prefix = "(", postfix = ")"))

//    println(list.join()) --> 컴파일 시점에서 잡아줌
    println(list1.join())
}

fun joinToStringV1(collection: ArrayList<Int>, separator: String, prefix: String, postfix: String): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if(index > 0)
            result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun joinToStringV2(collection: ArrayList<Int>,
                   separator: String = ", ",
                   prefix: String = "",
                   postfix: String = ""): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if(index > 0)
            result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}
