package suspendingfunction

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

suspend fun add(x: Int, y: Int): Int {
    delay(500)
    return x + y
}

suspend fun subtract(x: Int, y: Int): Int {
    delay(500)
    return x - y
}

fun main() = runBlocking {
    val time = measureTimeMillis {
        val sum = add(5, 8)
        val difference = subtract(9, 4)
        println("Sum is $sum and difference is $difference")
    }
    println("Time taken : $time")

    // If we want to get our work done faster in which there are no dependencies, so we can use these function under coroutines.
    val timeUsingCoroutine = measureTimeMillis {
        val sumUsingCoroutine = async { add(5, 8) }    // We can't use launch here as fun add and subtract are returning values
        val differenceUsingCoroutine = async { subtract(9, 4) }
        println("Sum is ${sumUsingCoroutine.await()} and difference is ${differenceUsingCoroutine.await()}")
    }
    println("Time taken using Coroutine : $timeUsingCoroutine")
}