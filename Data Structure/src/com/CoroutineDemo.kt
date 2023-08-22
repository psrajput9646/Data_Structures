package com


import kotlinx.coroutines.*

fun main() = runBlocking {
//    val deferreds: List<Deferred<Int>> = (1..3).map {
//        async {
//            delay(1000L * it)
//            println("Loading $it")
//            it
//        }
//    }
  //  val sum = deferreds.awaitAll().sum()
    launch {
        for (i in 1..3){
             delay(1000L )
            println("Loading2 $i")
        }

    }
 //   println("$sum")

    val input = "example input"
    val isInputValid = input.validate { input -> input.isNotEmpty() }
    println(isInputValid)

    val result = log("myTag", "Calculating result...") {
        // Perform some expensive calculation
        42
    }

    println(result)
}
fun String.validate(validationFunc: (String) -> Boolean): Boolean {
    return validationFunc(this)
}

fun <T> log(tag: String, message: String, function: () -> T): T {
   // Log.d(tag, message)
    val result = function()
   // Log.d(tag, "Function result: $result")
    return result
}