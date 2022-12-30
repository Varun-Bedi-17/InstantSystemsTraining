package coroutinescope

import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    // this -> coroutinescope instance
    runBlocking {
        println("runBlocking : $this}")

        launch {
            println("Parent launch : $this")
            launch {
                println("Child Launch : $this")
            }
        }

        async {
            println("async : $this")
        }

    }
}


