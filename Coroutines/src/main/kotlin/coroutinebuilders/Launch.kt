package coroutinebuilders
import kotlinx.coroutines.*


/**
 * GlobalScope.launch{} - It will run in separate thread. They are top-level coroutines and can run if the
 * lifetime of the screen is over.
 *
 * launch{} - It will run in its immediate parent thread and must be defined in coroutine.
 * It will create the new coroutine without blocking main thread.
 * Also called as 'Fire and Forget' as it does not return anything.
 * It has a reference type of job object.
 * */

fun main() = runBlocking{
    println("Main starts : ${Thread.currentThread().name}")


    val job : Job = launch {         // Main thread
        println("launch coroutine starts : ${Thread.currentThread().name}")
        delay(500)
        println("launch coroutine ends : ${Thread.currentThread().name}")
    }

    println(job.isActive)                                   // check for coroutine is cooperative or not.
    // job.cancel()                  // To cancel launch coroutine if it is cooperative.
    job.join()                   // Code after this line will execute after the complete execution of coroutine.
    println("Main ends : ${Thread.currentThread().name}")
}