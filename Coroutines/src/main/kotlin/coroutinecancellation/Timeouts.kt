package coroutinecancellation

import kotlinx.coroutines.*

fun main(){
    runBlocking {
//        withTimeout(2000){          // It will throw TimeoutCancellationException
//            try {
//                repeat(1000) {
//                    println(it)
//                    delay(500)
//                }
//            }
//            catch (exception : TimeoutCancellationException){
//                println("Exception")
//            }
//        }

        val returnAfter = withTimeoutOrNull(2000){
            repeat(1000) {
                println(it)
                delay(500)
            }
            "Task is Complete"     // Return this if task is completed else return null
        }
        println(returnAfter)
    }
}