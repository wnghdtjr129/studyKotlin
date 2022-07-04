package ch04

class A{
    companion object{
        fun bar(){
            println("Companion object called")
        }
    }
}

class CompanionUser private constructor(val nickname: String){
    companion object{
        fun newSubscribingUser(email: String) {
            CompanionUser(email.substringBefore('@'))
        }
    }
}

class Person(val name: String){
    companion object Loader{
        fun fromJson(jsonText: String): Person {
            return Person("person")
        }
    }
}
fun main() {
    A.bar()

//    val companionUser1 = CompanionUser("userA") 불가
    val companionUser = CompanionUser.newSubscribingUser("userA")
    CompanionUser.Companion.newSubscribingUser("user@naver.com") // 동일한 문장
}