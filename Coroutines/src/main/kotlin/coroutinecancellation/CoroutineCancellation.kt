package coroutinecancellation

import kotlinx.coroutines.*

/**
 * Coroutine must be cooperative to cancel
 * Two ways to cancel -
 * 1. Only those suspending functions(delay(), yield(), withContext() etc ) belong to kotlinx.coroutines.* will make coroutine cooperative.
 * 2. By checking using isActive
 */
fun main() = runBlocking {

    val cancel = launch{
    repeat(500){ i ->
        print(" i : ${i}")
    //        delay(10)
         yield()
    }
    }
    delay(1)
    println()
    println(cancel.isActive)               // Boolean flag to check coroutine is cooperative or not.
    cancel.cancel()                        // Used to cancel the coroutine
    cancel.join()
    println(cancel.isActive)
    // cancel.cancelAndJoin()                   // if cooperative then cancel it else wait for coroutine to finish.
    println("Quiting main")
}


