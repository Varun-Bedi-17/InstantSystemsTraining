package suspendingfunction

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * declared with suspend modifier.
 * Allowed to call only from a coroutine and or another suspending function.
 * await, join, cancel all are suspended function
 * */

fun main() {
    runBlocking {
        suspendedFunction(2000)
    }
}

// .We can't create local coroutine within suspended function. We can use runBlocking also in place of Coroutine Scope.
// coroutineScope provides us our own scope. It must be inside any suspending function or in coroutine.
// Difference between runblocking and coroutine scope is that latter can be suspendable(join can cancel it).
suspend fun suspendedFunction(time: Long) = coroutineScope {
    launch {
        println(Thread.currentThread().name)
        delay(time)
    }
}