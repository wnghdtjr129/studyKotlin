package ch04

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

open class RichButton : Clickable {

    fun disable() {}

    open fun animate() {}

    final override fun click() {}
}

class RichButton2 : RichButton() {
    override fun animate() {
        println("animate")
    }
}

abstract class Animated{
    abstract fun animate()

    fun animateTwice() {}
}