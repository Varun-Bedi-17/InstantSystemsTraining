package reflection

/**
 * Basically, reflection creates references at runtime.
 */
class ReflectionDemo {
}
val globalPropertyReference= 5
var variableProperty = 3
fun main()
{
    // Class Reference
    val abc = ReflectionDemo::class
    println("This is a class reference $abc")

    // Object Reference
    val reflectionDemo = ReflectionDemo()
    println("This is a bounded class reference ${reflectionDemo::class}")
    println("This is a bounded class reference ${reflectionDemo}")


    // ===================================================================================
    // Function reference
    fun isEven(x : Int) = x%2 == 0
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    //    println(numbers.filter(isEven))                        //  Error
    println("===========================Function Reflection============================")
    println(numbers.filter ( ::isEven ))

    // ====================================================================================
    //    Property Reference - allow properties to considered as object, we can get their values using get and set.
    println("=================================Property Reflection=================================")
    val propReference = 1
    println(propReference)                 // We can't use reflection for this property
    println(::globalPropertyReference)
    println(::globalPropertyReference.get())
    println(::variableProperty.set(7))
    println(variableProperty)


}