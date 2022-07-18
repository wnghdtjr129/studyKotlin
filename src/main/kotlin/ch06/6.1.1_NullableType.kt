package ch06

fun strLen(s: String) = s.length

fun strLenSafe(s:String?) = if(s!= null) s.length else 0

fun strLenSaveV2(s:String?) = s?.length // --> if(s!= null) s.length else null
fun strLenSaveV3(s:String?) = s?.length ?: 0 // --> if(s!= null) s.length else 0
fun strLenSaveV4(s:String?) = s?.length ?: throw IllegalArgumentException("Null value")

fun main() {
//    strLen(null)
}