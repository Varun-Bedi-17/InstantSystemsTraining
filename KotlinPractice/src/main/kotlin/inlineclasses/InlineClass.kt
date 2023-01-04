// inline keyword is depreceated.


@JvmInline
value class InlineClass(val s: String) {
    init {
        require(s.length > 0) { }
    }

    val length: Int
        get() = s.length

    fun greet() {
        println("Hello, $s")
    }
}
fun main() {
    val name = InlineClass("Kotlin")
    name.greet() // method `greet` is called as a static method
    println(name.length) // property getter is called as a static method
}


// ===================================================================================================

@JvmInline
value class UInt(val x: Int)

// Represented as 'public final void compute(int x)' on the JVM
fun compute(x: Int) { }

// Also represented as 'public final void compute(int x)' on the JVM!
// add @Jvmname("Function") to call this function from java
fun compute(x: UInt) { }             // Represented as
                                    // public static final void compute_fLmw4x8/* $FF was: compute-fLmw4x8*/(int x)
                                    // IN BYTECODE. This is called mangling.


