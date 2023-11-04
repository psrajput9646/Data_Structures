package com.KotlinDemo

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

suspend fun fetchData(): String {
    delay(1000L)
//    withContext(Dispatchers.IO){
//        delay(1000L)
//    }
    return "Data fetched"
}

fun main() = runBlocking {
    val result = fetchData()
    println(result)
    println("Hi all")
}