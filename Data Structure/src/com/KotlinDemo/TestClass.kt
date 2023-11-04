package com.KotlinDemo

data class TestClass(val value:Int) {
    var safe:Int? = null
        get() =if (value<0) 0 else value

}
 const val name="Prashant kumar"
fun main() {

    val data=TestClass(-1)
    println(data.safe)

}