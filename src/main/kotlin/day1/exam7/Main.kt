package day1.exam7

fun main(){
    val names = mutableListOf("A","B","C","D","E","F","G","H")

    names.add("I")

    for(name in names){
        print("$name ")
    }

    println(names)
}