package ch02

/**
 * 블록이 본문인 함수는 return type 지정 필수
 */
fun max1(a: Int, b: Int): Int {
    return if (a>b) a else b
}

/**
 * 식이 본문인 함수는 return type 컴파일러가 분석해 추론 가능
 */
fun max2(a: Int, b: Int): Int = if(a>b) a else b
fun max3(a: Int, b: Int) = if(a>b) a else b

fun main() {
    println(max1(1,2))
    println(max2(1,2))
    println(max3(1,2))
}