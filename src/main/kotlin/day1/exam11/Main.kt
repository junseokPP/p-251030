package day1.exam11

data class Person(
    val name: String,
    val age: Int){}

fun main(){
    val p1 = Person("Alice", 29)
    val p2 = Person("Bob", 30)

    println(p1)
    println(p1 == p2)
}