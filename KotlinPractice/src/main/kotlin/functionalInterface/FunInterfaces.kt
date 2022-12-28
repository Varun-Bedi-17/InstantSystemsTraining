fun interface firstInterface{
    fun check()

    fun check2(){
        println("Second method")
    }
}

// Example 1
fun interface Second{
    fun check3(i:Int) : Boolean
}

fun test(a : Int, checking: Second){
    if (checking.check3(a)){
        println("Valid")
    }
    else{
        println("Not Valid")
    }
}

fun main() {
// without SAM conversion
    test(6, object:Second{
        override fun check3(i: Int): Boolean {
            return i%2 == 0
        }
    })

    // With SAM conversion
    test(9, {i -> i % 2 == 0})

    // It can also be assigned to a variable.
    val ab = Second{i -> i%2==0}
    test(23, ab)
}


