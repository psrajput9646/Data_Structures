package com.KotlinDemo


data class AlsoScope(var name: String, var age: Int)

fun main() {
    val person = AlsoScope("John Doe", 25).also {
        println("Initializing person: $it")
        it.age += 5
    }

    val runs = AlsoScope("John", 30)
    val result = runs.run {
//        println("Name: $name")
//        println("Age: $age")
        age + 5
    }

    println("Modified run scope: $result")
    println("Modified also scope:: $person")

//    val person = Person().also {
//        it.name = "Tony Stark"
//    }

//    val person = Person().apply {
//        name = "Tony Stark"
//    }
}