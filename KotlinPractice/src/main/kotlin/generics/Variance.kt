/**
 * By extension, generic types are invariant in Kotlin. This can be managed by the out and in
 *  keywords. Invariance is the property by which a standard generic function/class already defined for
 * a particular data type, cannot accept or return another datatype. Any is the supertype of all other datatypes.
 */


// Variance is of two types-
// Declaration-site variance(using in and out)
// Use-site variance: Type projection


fun main(){

    /**
     * Invariance
     */
    // By default, Kotlin generics are invariant, meaning that Box<A> is not a subtype of Box<B>,
    // even if A is a subtype of B.
    val intBox: CheckInvariance<Int> = CheckInvariance(1)
    // val anyBox: CheckInvariance<Any> = intBox  // Error: Type mismatch

    // ======================================================================================

    /**
     * Covariance
     */
    val c : CheckVariance<Int> = CheckVariance(80, )
    println(c.getValue())

    // out keyword -> The out keyword in generic type means we can assign this reference to any of its supertype.
    //    val d : CheckVariance<Number> = c     It will throw error if we don't make t as out.
    val d: CheckVariance<Number> = c
    println(d.getValue())

    // val e:CheckVariance<Number>   = CheckVariance<Int>(90)        // Covariance

    // ======================================================================================

    /**
     * Contra Covariance
     */
    // in keyword -> The in keyword in generic type means we can assign reference to its subtypes.
    // The in keyword can be used only on the parameter type that is consumed.
    val check = CheckVarianceIn<Number>("GFGH")
    println(check.getValueIn())
    val check2: CheckVarianceIn<Int> = check      // Without in, it will throw error.

    //    val check3 : CheckVarianceIn<Int> = CheckVarianceIn<Number>("lkj")    // Contra covariance
}

class CheckInvariance<T>(val t: T){
    fun getValue() = t                    // Can't use T in parameter of function like getValue( t2 :T).
}

class CheckVariance<out T>(val t: T){
    fun getValue() = t                    // Can't use T in parameter of function like getValue( t2 :T).
 }

class CheckVarianceIn<in T>(val t: String){   // Can't use T in reference of class parameter and function return
    fun getValueIn() : String = t               // t can be used here getValue(t1 : T)

}