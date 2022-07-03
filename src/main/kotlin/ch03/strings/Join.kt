package ch03.strings

fun joinToString(collection: ArrayList<Int>,
                 separator: String = ", ",
                 prefix: String = "",
                 postfix: String = ""): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if(index > 0)
            result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun String.lastChar(): Char = get(this.length - 1)

fun <T> Collection<T>.joinToString(separator: String = ", ",
                                   prefix: String = "",
                                   postfix: String = ""):String{
    val result = StringBuilder(prefix)

    for ((index, element) in withIndex()) {
        if(index > 0)
            result.append(separator)
        result.append(element)
    }
    return result.append(postfix).toString()
}

fun Collection<String>.join(
    separator: String = ", ",
    prefix: String = "( ",
    postfix: String = ")") = joinToString(separator, prefix, postfix)
