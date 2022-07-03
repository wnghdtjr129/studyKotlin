package ch02

fun main() {
    val question = "삶, 우주, 그리고 모든 것에 대한 궁극적인 질문"
    val answer = 42
    val answer1:Int = 42
    val yearsToCompute = 7.5e6

    val answer2: Int
    answer2 = 42

    val value = 1
    var value2 = 1

//    value = 2
    println("this is an immutable value : $value")
    println("this is a mutable variation : $value2")

    val message:String

    if (value == 1) {
        message = "Success"
    } else {
        message = "Fail"
    }

    val languages = arrayListOf("Java")
    languages.add("Kotlin")
}