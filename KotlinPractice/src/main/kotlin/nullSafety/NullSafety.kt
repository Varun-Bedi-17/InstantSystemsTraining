
fun main() {
    val string = "Hello"
    val nullString: String? = null

    println(string.length)
    // println(b.length)                      // throw error

    //=========================================================================================

    // Safe call operator(?.)
    println(nullString?.length)

    //=========================================================================================

    // Safe call with let        -> Run when value left side of safe call is not null
    nullString?.let {                          // Not running
        println(nullString.uppercase())
        println(nullString.lowercase())
    }

    string?.let {
        println(string.uppercase())
        println(string.lowercase())
    }

    // =====================================================================================

    // Elvis Operaor -> ?:   If left side of this operator is null then right side is executed.
    val elvis= nullString?.length ?: -1
    val nullElvis = string?.length ?: -1
    println(elvis)
    println(nullElvis)

    // =====================================================================================

    // not null assertion operator -> !!
    val assert = nullString!!.length                     // Throws null pointer exception. use it when sure value is not null.
    val nullAssert = string!!.length

}