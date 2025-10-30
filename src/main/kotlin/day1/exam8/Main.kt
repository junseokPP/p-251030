package day1.exam8

fun main(args: Array<String>){
    val ages = mapOf("peter" to 24,"clack" to 31,"bruce" to 32)

    for((key,value) in ages){
        println("$key -> $value")
    }
}