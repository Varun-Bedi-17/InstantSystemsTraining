package interfacevsabstraction

fun main(args: Array<String>) {
    val s = Student()
}

abstract class Person {

    // Properties in abstract class
    //        var name:String        // Error must be initialized or abstracted
    var name2: String = "harsh"
    abstract var name3: String
    //    abstract var name4 : String = "yash"       // Error Property with initializer cannot be abstracted

    // Methods in abstract class
    abstract fun eat()
    //    abstract fun eat2(){}               // Error function with body cannot be abstracted
    fun todo() {}                              // Normal function must have body and public and final by default.
    open fun todo2() {}
}

class Student : Person(){
//    override var name2 : String = "virat"    // cannot be overriden
    override var name3 : String = "ajay"

    override fun eat() {
        println("override eat")
    }
    init{
        println(name2)
    }
}

