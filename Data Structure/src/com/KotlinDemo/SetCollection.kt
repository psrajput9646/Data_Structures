package com.KotlinDemo

fun main() {
    val set1=setOf(1,2,3)
    val set2=mutableSetOf(3,2,1)

    println("$set1 == $set2 ${set1 == set2}")
    println("contain 7 : ${set1.contains(7)}")
}