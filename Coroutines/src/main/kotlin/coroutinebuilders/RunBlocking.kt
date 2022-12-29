package coroutinebuilders

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

/* runblocking - Creates a coroutine that blocks the current main thread.
Compiler doesn't allow local coroutines call and suspended function calls from main(). So, to call coroutine
function we used runBlocking builder to call those functions.
 */

fun main() = runBlocking {
    println("Thread : ${Thread.currentThread().name}")
    delay(500)
    println("Without runBlocking we can't use this delay directly in main function.")

}