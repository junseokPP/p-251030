package day1.exam21

fun main() {

    val obj: Any = "Hello"

    if(obj is String) {
        println(obj.length)
    }

}