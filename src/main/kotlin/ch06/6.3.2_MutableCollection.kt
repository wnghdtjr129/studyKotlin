package ch06

fun <T> MutableCollection<T>.copyElements(source: Collection<T>) {
    for (item in source) {
        add(item)
    }
}

fun printInUpperCase(list: List<String>) {
    println(CollectionUtils.uppercaseAll(list))
    println(list.first())
}
fun main() {
    val source: Collection<Int> = arrayListOf(3, 5, 7)
    val target:MutableCollection<Int> = arrayListOf(1)
    target.copyElements(source)

//    source.add(1) --> 컴파일 오류
    println(target)

    val list = listOf("a", "b", "c")
    printInUpperCase(list) //읽기 전용이지만 자바 코드에선 변경 가능
    println(list is MutableList) // true --> 타입 바뀜
    printInUpperCase(mutableListOf("a", "b", "c")) //변경가능한 리스트로 사용하는 것을 지향하는게 좋을 듯 함
}