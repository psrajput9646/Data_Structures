package com.KotlinDemo

fun main() {
  fun Circle.primeter():Double{
      return Math.PI * radius * radius;
  }
    val cir=Circle(2.5)
    println("This is circle premeter :"+cir.primeter())
    val arr = arrayListOf<Int>(1, 2, 2, 4, 3, 2, 4, 7, 8, 1)
    val arry= arrayOf(1, 2, 2, 4, 3, 2, 4, 7, 8, 1)
    val n = arry.size - 1
    var mapObj = mutableMapOf<Int, Int>()
    for (i in 0..n) {
        if (mapObj.containsKey(arr[i])) {
            val j = mapObj.get(arr[i])?.plus(1)
            if (j != null) {
                mapObj.put(arr[i], j)
            }
        } else {
            mapObj.put(arr[i], 1)
        }
    }
    var l=2
    for (i in 1..26){
      l=l*2
    }
    println(l)
    println(mapObj)
}

