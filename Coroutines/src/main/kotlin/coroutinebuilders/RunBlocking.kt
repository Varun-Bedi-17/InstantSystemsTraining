package coroutinebuilders

import kotlinx.coroutines.*

/**
 *  runBlocking - Creates a coroutine that blocks the current main thread.
 *  Compiler doesn't allow local coroutines call and suspended function calls from main(). So, to call coroutine
 *  function we used runBlocking builder to call those functions.
 */

fun main() {
    println("Before runBlocking block : ${Thread.currentThread().name}")

    runBlocking {         // Main thread
        println("On runBlocking starts : ${Thread.currentThread().name}")
        delay(500)
        println("On runBlocking ends : ${Thread.currentThread().name}")
    }

    println("After runBlocking block : ${Thread.currentThread().name}")
}