package day1.exam6

class Person(
    val name: String
){
    fun greet(){
        println("name is $name")
    }
}

fun main(args : Array<String>){
    val person = Person("Alice")
    person.greet()
}