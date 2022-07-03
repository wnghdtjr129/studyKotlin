package ch03

fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")
    println("Dir: $directory, name $fileName, ext: $extension")
}

fun parsePath1(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
       val (directory, fileName, extension) = matchResult.destructured
        println("Dir: $directory, name $fileName, ext: $extension")
    }
}

fun main() {
    parsePath("/Users/jhs/kotlin/chapter.adoc")
    parsePath1("/Users/jhs/kotlin/chapter.adoc")
}