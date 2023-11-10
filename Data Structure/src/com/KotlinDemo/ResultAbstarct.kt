package com.KotlinDemo

abstract class ResultAbstarct
     class Demo(val message: String) : ResultAbstarct()
     class Sample(val error: String) : ResultAbstarct()

    fun proccesResult(result: ResultAbstarct) {
        when (result) {
            is Demo -> print("Demo")
            is Sample -> print("Sample")
        }
    }


fun main() {
    val success = Demo("Operation succeeded")
    val error = Sample("Operation failed")

    proccesResult(success) // Output: Success: Operation succeeded
    proccesResult(error)
}


