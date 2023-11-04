package com.KotlinDemo

fun main(){
    val peopleage=mutableMapOf<String,Int>("Prashant" to 28, "Amit" to 26)
    peopleage.put("pd",28)
    println(peopleage)
    println(peopleage.size)
    peopleage["pd"]=29
    println(peopleage)

//     for(people in peopleage){
//         print("${people.key} :${people.value} ,")
//     }

//     peopleage.forEach{
//         print("${it.key} is ${it.value}, ")
//     }

    println(peopleage.map{"${it.key} is ${it.value}"}.joinToString(", "))
    val filterPeople=peopleage.filter{it.key.length<=2}
    println(filterPeople)
}