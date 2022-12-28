fun main() {

    /** Scope Function: 'also'              'ALSO PERFORM THE FOLLOWING EXTRA OPERATION'
    Refer to context object by using 'it'
    The return value is the 'context object'
     Extension function*/

    // Initialise numbersList
    val numbersList: MutableList<Int> = mutableListOf(1, 2, 3)

    // Some other code... may be a function call or program to swap numbers (doesn't matter what code)

    val duplicateNumbers = numbersList.also {
        println("The list elements are: $it")
        it.add(4)
        println("The list elements after adding an element: $it")
        it.remove(2)
        println("The list elements after removing an element: $it")
    }

    // duplicateNumbers will be same as numbersList
    println("Original numbers: $numbersList")
    println("Duplicate numbers: $duplicateNumbers")
}