package ch04

class User(val nickname: String)

class User1 (nickname: String){
    val nickname: String

    init {
        this.nickname = nickname
    }
}

open class User2(nickname: String){
    val nickname = nickname
}
open class User3 private constructor(nickname: String){
    val nickname = nickname
}

interface UserInter{
    val nickname: String
}

class UserImpl(override val nickname: String) :UserInter
class UserImpl2(val email:String) :UserInter{
    override val nickname: String
        get() = email.substringBefore("@")
}
class TwitterUser(nickname: String): User2(nickname)
class TwitterUser2: User2 {
    constructor(nickname: String):super(nickname)
}