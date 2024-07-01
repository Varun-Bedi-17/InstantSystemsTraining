package coroutinecancellation

import kotlinx.coroutines.*

/**
 * Cancellable suspending functions such as yield, delay always throws exception, so we can catch them using try catch block.
 */

fun main() = runBlocking {

    val jobCatchException = launch{
        try {
            repeat(500) { i ->
                println(" i : $i")
                delay(100)
            }
        }
        catch(e : CancellationException){
            println("Exception caught : $e")
        }
        finally {
            // We cannot call suspending function from finally block.
            // For executing a suspending function from finally block then wrap the code with
            withContext(NonCancellable) {
                delay(1000)
                println("Finally block")
            }

        }
    }
    delay(500)
//     jobCatchException.cancel()                    // Only cancel the coroutine and doesn't wait for it to catch error and run finally block
    jobCatchException.cancelAndJoin()                // It will cancel and then wait for coroutine to finish and then run the code after this.
    // We can pass cancellation exception while cancelling it.
    // jobCatchException.cancel(CancellationException("Exception"))              // Use e.message to print message only in exception
    println("Main ends")
}