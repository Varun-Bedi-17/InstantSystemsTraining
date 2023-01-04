fun main() {

}

open class Outer {
    private val a = 1
    protected open val b = 2
    internal open val c = 3
    val d = 4  // public by default. Make it open to override in child classes.

    protected class Nested {
        public val e: Int = 5
    }
}

open class Subclass : Outer() {
    // a is not visible
    // b, c and d are visible
    // Nested and e are visible

    override val b = 5   // 'b' is protected
    override val c = 7   // 'c' is internal
//    protected var n = Nested()
//    var e = n.e
}

class Another : Subclass(){
    override val b = 9
    override val c = 12
    protected var n = Nested()
    var a = n.e
}

class Unrelated(o: Outer) {
    // o.a, o.b are not visible
    // o.c and o.d are visible (same module)
    // Outer.Nested is not visible, and Nested::e is not visible either
}
