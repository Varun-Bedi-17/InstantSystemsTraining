fun main() {
    val outer = OuterClass()
//    println(outer.i)
    outer.printOuter()


    // Nested Class
    val nested = OuterClass.Nested()                       // Create object of nested class
    //We can directly access members of nested class
    //    println(nested.printNested())
    OuterClass.Nested().printNested()


    //Inner class
    val inn = OuterClass().Inner()
    //    println(inn.i)                 // we can't use parent class property and
                                        //  member with objects of inner class
}
class OuterClass{
    val i  = 0
    fun printOuter() = println("Outer class")

    class Nested{
        fun printNested() = println("Nested Class")            // Can't access i and printOuter
    }

    inner class Inner{                                       // Can access property and member of parent class.
        init{
            println("Inner Class ")
            println("Call from inner : $i")
        }
    }
}