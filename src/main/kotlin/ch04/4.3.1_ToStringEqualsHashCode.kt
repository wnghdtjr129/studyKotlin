package ch04

class Client(val name: String, val postalCode: Int){
    override fun toString(): String = "Client(name='$name', postalCode=$postalCode)"

    override fun equals(other: Any?): Boolean {
        if(other !is Client)
            return false
        return name == other.name && postalCode == other.postalCode
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + postalCode
        return result
    }
}

fun main() {
    val client1 = Client("Alice", 34)
    val client2 = Client("Alice", 34)
    println(client1)

    println(client1 == client2)
}
