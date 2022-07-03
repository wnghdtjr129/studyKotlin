package ch02

class Rectangle(val height: Int, val width: Int){
    val isSquare: Boolean
        get() {
            return height == width
        }
}

fun main() {
    val rectangle = Rectangle(10, 10)
    println(rectangle.isSquare)

    val rectangle1 = Rectangle(10, 15)
    println(rectangle1.isSquare)
}