package ch04

class UserBackingField(val name: String){
    var address: String = "unspecified"
        set(value) {
            println("""
                Address was changed for $name:
                "$field" -> "$value".""")
            field = value
        }
}

fun main() {
    val user = UserBackingField("Alice")
    user.address ="Elsenhimerstrasse 47, 80687 Muenchen"
    println(user.address)
}
