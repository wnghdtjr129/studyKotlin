package ch06

fun main() {
    val array = arrayOf("a", "b", "c")
    for (index in array.indices) {
        println("Argument $index is : ${array[index]}")
    }

    val result = Array(26) { i -> ('a' + i).toString() }
    println(result.joinToString() )
    val intArray = IntArray(5){ i -> i+1}
    val intArrayOf = intArrayOf(1, 2, 3, 4, 5)
    println(intArray.joinToString())

    intArray.forEachIndexed{index, element -> println("$index is: $element") }
}