package ch02

import java.io.BufferedReader
import java.io.StringReader

fun readNumber(reader: BufferedReader): Int?{
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        return null
    }finally {
        reader.close()
    }
}

fun readNumber1(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        return
    }
    println(number)
}

fun readNumber2(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }
    println(number)
}

fun readNumber3(reader: BufferedReader) =
    try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }

fun main() {
    val number = 10
    println("${if (number in 0..100) number
        else throw IllegalArgumentException("A percentage value must be between 0 and 100: $number")}")

    println("readNumber = ${readNumber(BufferedReader(StringReader("23")))}")
    println("readNumber1 = ${readNumber1(BufferedReader(StringReader("23")))}")
    println("readNumber2 = ${readNumber2(BufferedReader(StringReader("sadf")))}")
    println("readNumber3 = ${readNumber3(BufferedReader(StringReader("sadf")))}")
}