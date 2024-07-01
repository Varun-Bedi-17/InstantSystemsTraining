package suspendingfunction

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

/**
 * We can make async lazy by setting its start parameter to CoroutineStart.lazy.
 */

/**
 * When you use CoroutineStart.LAZY with async, the coroutine does not start until it is explicitly started or awaited.
 * This can be useful for controlling the exact timing of the coroutine's execution.
 */
suspend fun addLazy(x: Int, y: Int): Int {
    delay(500)
    return x + y
}

suspend fun subtractLazy(x: Int, y: Int): Int {
    delay(500)
    return x - y
}

fun main() = runBlocking{
    val timeUsinglazy = measureTimeMillis {
        val sumUsingLazy = async(start = CoroutineStart.LAZY) { add(5, 8) }    // We can't use launch here as fun add and sutract are returning values
        val differenceUsingLazy = async(start = CoroutineStart.LAZY) { subtract(9, 4) }
        sumUsingLazy.start()    // Starts first
        differenceUsingLazy.start()      // Starts second

        // If we don't use start() and directly call await() then it will run sequentially.
        println("Sum is ${sumUsingLazy.await()} and difference is ${differenceUsingLazy.await()}")
    }
    println("Time taken using Coroutine : $timeUsinglazy")
}
