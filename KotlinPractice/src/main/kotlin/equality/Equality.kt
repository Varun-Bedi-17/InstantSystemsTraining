fun main() {
    // == -> Structural Equality (Can be override)
    // === -> Referential Equality (Cannot be override)

    //    For values represented by primitive types at runtime
    //    (for example, Int, String etc), the === equality check is equivalent to the == check.
    val p = "Hello"
    val q = "Hello"
    val r = "Hello World"

    println(p == q)
    println(p === q)
    println(p == r)
    println(p === r)

    // We can override equals method(==) in classes but not  ===.

}

