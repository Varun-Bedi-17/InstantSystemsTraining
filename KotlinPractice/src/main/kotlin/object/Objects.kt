fun main() {

    // Object Expression
    val hello = object {
        val hello = "Hello"
        val world = "World"

        override fun toString(): String = "$hello $world"
    }
    println(hello)             // Calls toString

    //================================================================================================
    println(ObjectA.num)            // we can use num directly
    ObjectA.test()

}

// Object declaration
object ObjectA{
    init{
        println("Object A is created")
    }
    val num = 0
    fun test(){
        println("Testing")
    }

}
