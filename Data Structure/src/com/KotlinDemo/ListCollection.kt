package com.KotlinDemo

fun main() {
    println("Hello, world!")
    val list = mutableListOf(1, 2, 2, 3, 4, 5)
    list.add(2, 6)
    println("size list : ${list.size}")
    println("List : ${list}")
    println("sorted List : ${list.sorted()}")
//convert list to set
    val listSet = list.toSet()
    println(listSet)

    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
    val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
    println(filteredWords)

    val filteredWordss = words.filter { it.startsWith("b", ignoreCase = true) }
            .shuffled()//fist two words
            .take(2)
            .sorted()

    println(filteredWordss)
}