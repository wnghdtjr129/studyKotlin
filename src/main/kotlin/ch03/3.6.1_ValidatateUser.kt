package ch03

class User(val id: Int, val name: String, val address: String)

fun saveUserV1(user: User) {
    if(user.name.isEmpty())
        throw IllegalArgumentException("Can't save user ${user.id}: empty Name")

    if(user.address.isEmpty())
        throw IllegalArgumentException("Can't save user ${user.id}: empty address")

    println("save user ${user.id}")
}

fun saveUserV2(user: User) {
    fun validate(user: User, value: String, fieldName: String) {
        if(value.isEmpty())
            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
    }

    validate(user, user.name, "Name")
    validate(user, user.address, "Address")

    println("save user ${user.id}")
}

fun saveUserV3(user: User) {
    fun validate(value: String, fieldName: String) {
        if(value.isEmpty())
            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
    }

    validate(user.name, "Name")
    validate(user.address, "Address")

    println("save user ${user.id}")
}

fun User.validate(){
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty())
            throw IllegalArgumentException("Can't save user $id: empty $fieldName")
    }

    validate(name, "Name")
    validate(address, "Address")

    println("save user $id")

}
fun main() {
//    saveUserV1(User(1,"",""))
//    saveUserV2(User(1,"",""))
    saveUserV3(User(1,"",""))
    val user = User(1, "", "")
    user.validate()
}