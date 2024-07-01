package introduction

import kotlinx.coroutines.*
import kotlin.concurrent.thread

fun main() {
    println("Main starts : ${Thread.currentThread().name}")

    // When we use thread the main program ends after the execution of thread
    thread {
        println("Thread starts : ${Thread.currentThread().name}")
        Thread.sleep(1000)               // It blocks the whole thread.
        println("Thread ends : ${Thread.currentThread().name}")
    }


    // But in coroutines, the main program doesn't wait for execution of coroutines.
    GlobalScope.launch {
        println("launch coroutine starts : ${Thread.currentThread().name}")
        delay(500)                   // It blocks only coroutine not whole thread.
        println("launch coroutine ends : ${Thread.currentThread().name}")
    }                               // If we don't use the thread.sleep in thread then this will not print.

    // Async execute code parallel, meaning both async can be executed in any order, all other launch and runblocking works sequentially.
    // But the code under async block run sequentially, async execute parallel if we have different async blocks.
    GlobalScope.async {
        println("async coroutine starts : ${Thread.currentThread().name}")
        delay(500)                   // It blocks only coroutine not whole thread.
        println("async coroutine ends : ${Thread.currentThread().name}")
    }

    GlobalScope.async {
        println("async2 coroutine starts : ${Thread.currentThread().name}")
        delay(500)                   // It blocks only coroutine not whole thread.
        println("async2 coroutine ends : ${Thread.currentThread().name}")
    }

    runBlocking {
        println("runblocking coroutine : ${Thread.currentThread().name}")
    }

    println("Main ends : ${Thread.currentThread().name}")
}