package coroutinecontext

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

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