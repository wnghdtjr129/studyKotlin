package ch06

import java.io.BufferedReader
import java.io.StringReader
import java.util.ArrayList

fun readNumbers(reader: BufferedReader): List<Int?> {
//fun readNumbers(reader: BufferedReader): List<Int>? { --> list 자체가 널일 수도 있음 return null 가능
    val result = ArrayList<Int?>()
    for (line in reader.lineSequence()) {
        try {
            val number = line.toInt()
            result.add(number)
        }
        catch(e: NumberFormatException) {
            result.add(null)
        }
    }
    return result
}

fun addValidNumbers(numbers: List<Int?>) {
    var sum = 0
    var invalidNumber = 0
    for (number in numbers) {
        if (number != null) {
            sum += number
        } else {
            invalidNumber++
        }
    }

    println("sum of valid numbers: $sum")
    println("Invalid numbers: $invalidNumber")
}

fun addValidNumbers2(numbers: List<Int?>) {
    val validNumbers = numbers.filterNotNull()
    println("sum of valid numbers: ${validNumbers.sum()}")
    println("Invalid numbers: ${numbers.size - validNumbers.size}")
}

fun main() {
    val numbers = readNumbers(BufferedReader(StringReader("1\na\n42")))
    addValidNumbers(numbers)
    addValidNumbers2(numbers)
}