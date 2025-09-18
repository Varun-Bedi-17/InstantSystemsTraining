package coroutinebuilders

import kotlinx.coroutines.*

/**
 * async - It will run in its immediate parent thread and must be defined in coroutine.
 *  It will create the new coroutine without blocking main thread.
 *  It has a reference of deferred object which is an interface of job, and it can return values also.
 */

fun main() = runBlocking {
    println("Before async block : ${Thread.currentThread().name}")

    val jobDeferred: Deferred<String> = async {         // Main thread
        println("On async  starts : ${Thread.currentThread().name}")
        delay(500)
        println("On async ends : ${Thread.currentThread().name}")
        "Deferred object"
    }

    println("After async block : ${Thread.currentThread().name}")
    // It can call all functions of Job type.
    //    println(jobDeferred.isActive)
    //    jobDeferred.cancel()
    //    jobDeferred.join()

    // async also has some functions
    val asyncResult = jobDeferred.await() // await -> Similar to .join() but used to get returned value.
    println(asyncResult)

    println("Main ends : ${Thread.currentThread().name}")
}