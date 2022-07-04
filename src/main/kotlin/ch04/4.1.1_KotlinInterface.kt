package ch04

interface Click{
    fun click()
    fun showOff() = println("I'm clickable")
}

interface Focusable{
    fun setFocus(b: Boolean) = println("I ${if(b) "got" else "lost"} focus")
    fun showOff() = println("I'm focusable!")
}

class Button : Click, Focusable {
    override fun click() = println("I was Clicked override Function")
    override fun showOff() {
        super<Click>.showOff()
        super<Focusable>.showOff()
    }

    fun click(str: String) = println("Hi $str")
}

fun main() {
    Button().click()

    val button = Button()
    button.click()
    button.click("steve")
    button.showOff()
    button.setFocus(false)
}