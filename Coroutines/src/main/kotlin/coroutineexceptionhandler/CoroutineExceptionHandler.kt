import kotlinx.coroutines.*

fun main() = runBlocking {
    // Define a coroutine exception handler
    val exceptionHandler = CoroutineExceptionHandler { coroutineContext, throwable ->
        println("Caught exception: ${throwable.localizedMessage}")
    }

    // Create a coroutine scope with the exception handler
    val scope = CoroutineScope(Dispatchers.Default + exceptionHandler)

    // Launch a coroutine in the scope
    scope.launch {
        println("Coroutine started")
        throw RuntimeException("Something went wrong!")
    }.join() // Wait for the coroutine to complete

    // Launch another coroutine without the handler to demonstrate uncaught exception
    launch {
        println("Another coroutine started")
        throw RuntimeException("Another error occurred!")
    }.join() // Wait for the coroutine to complete

    println("Program finished")
}

// Nested
/*
fun main() = runBlocking {
    // Custom exception handler
    val handler = CoroutineExceptionHandler { _, exception ->
        println("Caught $exception")
    }
    val coroutineScope = CoroutineScope(Dispatchers.Default+handler)

    // Parent coroutine with a custom exception handler
    val parentJob = coroutineScope.launch {
        // Nested coroutine with its own try-catch block
        val nestedJob = launch {
            try {
                // Simulating an error
                throw ArithmeticException("Division by zero")
            } catch (e: ArithmeticException) {
                println("Caught ArithmeticException in nested coroutine: $e")
            }
        }

        // Waiting for the nested job to complete
        nestedJob.join()

        // Another nested coroutine
        launch {
            // Simulating an error
            throw IllegalStateException("Illegal state")
        }
    }

    // Waiting for the parent job to complete
    parentJob.join()
}
*/
