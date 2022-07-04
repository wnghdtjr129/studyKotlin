package ch04

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

sealed class Expr1{
    class Num(val value: Int) : Expr1()
    class Sum(val left: Expr1, val right: Expr1) : Expr1()
}

fun eval(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        else ->
            throw IllegalArgumentException("Unknown expression")
    }

fun eval1(e: Expr1): Int =
    when (e) {
        is Expr1.Num -> e.value
        is Expr1.Sum -> eval1(e.right) + eval1(e.left)
    }


fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(eval1(Expr1.Sum(Expr1.Sum(Expr1.Num(1), Expr1.Num(2)), Expr1.Num(4))))
}
