package com.KotlinDemo

fun main(){
    val triple:(Int)->Int={a:Int->a*3}
    val tripleOption:(Int)->Int={it*3}
    println(tripleOption(5))

    val lits=listOf("pk","ak","pd","mk")
    val lits1=listOf("prashant","amit","padmini","mohan")
    val peopleNames = listOf("Fred","Joe" , "Barbara","Ann" )
    println(lits.sorted())
    println(peopleNames.sortedWith { str1: String, str2: String -> str1.length - str2.length })

}