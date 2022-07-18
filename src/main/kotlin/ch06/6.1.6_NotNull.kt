package ch06

fun ignoreNull(s: String?) {
    print(s!!.length)
}

fun sendEmail(email: String) {
    println("Sending email to $email")
}

fun main() {
    try {
        ignoreNull(null) // --> nullPointerException
    } catch (e: NullPointerException) {

    }
    "user@naver.com"?.let { sendEmail(it) }
    null?.let{ sendEmail(it) }
}