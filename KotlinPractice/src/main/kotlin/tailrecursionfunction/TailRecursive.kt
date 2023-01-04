fun main() {
    fun sumTillNumber(x : Long) : Long{
        return if (x <= 1){
            x
        }
        else{
            x + sumTillNumber(x-1)
        }
    }

    //        println(sumTillNumber(20))                         // Throw error

    // To get rid from this we use tail recursive function.

    tailrec fun sumTillNumberTail(x : Long, answer: Long = 0) : Long{
        return if (x <= 0){                                        // Change
            answer
        }
        else{
            sumTillNumberTail(x-1, x+answer)
        }
    }

    println(sumTillNumberTail(100000))
}

