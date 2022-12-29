package introduction

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
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
    // Output - Main starts : main
    //          Main ends : main

    runBlocking {
        println("runblocking coroutine : ${Thread.currentThread().name}")
    }

    println("Main ends : ${Thread.currentThread().name}")
}