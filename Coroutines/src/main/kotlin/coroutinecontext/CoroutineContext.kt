package coroutinecontext

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

/**
 * The coroutine context is a set of elements that define the behavior of a coroutine.
 * It includes elements such as the dispatcher that determines the thread where the coroutine runs,
 * the job that controls its lifecycle, and other elements like coroutine names or custom elements.
 *
 * Key Components of Coroutine Context:
 * - Dispatcher: Determines the thread or thread pool where the coroutine will be executed.
 *    - Dispatcher.DEFAULT
 *    - Dispatcher.UNCONFINED
 *    - Dispatcher.IO
 *    - Dispatcher.MAIN
 * - Job: Controls the lifecycle of the coroutine, including its cancellation.
 * - CoroutineName: Assigns a name to the coroutine, useful for debugging.
 * - CoroutineExceptionHandler: Handles uncaught exceptions in the coroutine.
 */
fun main(){
    runBlocking {
        launch{
            println("Launch before delay : ${Thread.currentThread().name}")  // Thread : main
            delay(500)
            println("Launch after delay : ${Thread.currentThread().name}")   // Thread : main
        }
        launch(Dispatchers.Default){
            println("Launch Dispatcherdefault before delay : ${Thread.currentThread().name}")    // Thread: T1
            delay(500)
            println("Launch Dispatcherdefault after delay : ${Thread.currentThread().name}")     // Thread : T1 or some other
        }
        launch(Dispatchers.Unconfined){
            println("Launch unconfined before delay : ${Thread.currentThread().name}")  // Thread : main
            delay(500)
            println("Launch unconfined after delay : ${Thread.currentThread().name}")  // Thread : some other thread
            launch(coroutineContext){
                println("Launch coroutineContext delay : ${Thread.currentThread().name}")
                delay(500)
                println("Launch coroutineContext after delay : ${Thread.currentThread().name}")
            }
        }
        launch(newSingleThreadContext("My thread")){
            println("${Thread.currentThread().name}")
            delay(500)
            println("${Thread.currentThread().name}")
        }
    }
}