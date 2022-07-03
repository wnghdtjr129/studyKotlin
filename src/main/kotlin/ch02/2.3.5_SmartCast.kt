package ch02

interface Expr
class Num(val value: Int): Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun evaluate(e: Expr): Int {
    if (e is Num) {
        val n = e as Num // 쓸데 없는 부분
        return n.value
//        return e.value
    }
    if (e is Sum) {
        return evaluate(e.left) + evaluate(e.right)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun evaluate1(e: Expr): Int =
    if (e is Num)
        e.value
    else if (e is Sum)
        evaluate1(e.left) + evaluate1(e.right)
    else
        throw IllegalArgumentException("Unknown expression")

fun evaluate2(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> evaluate2(e.left) + evaluate2(e.right)
        else -> throw IllegalArgumentException("Unknown expression")
    }

fun evaluateWithLogging(e: Expr): Int =
    when (e) {
        is Num -> {
            println("Num: ${e.value}")
            e.value
        }
        is Sum ->{
            val left = evaluateWithLogging(e.left)
            val right = evaluateWithLogging(e.right)
            println("sum: $left + $right")
            left + right
        }
        else -> throw IllegalArgumentException("Unknown expression")
    }

fun main() {
    println(evaluate(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(evaluate1(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(evaluate2(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(evaluateWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
}