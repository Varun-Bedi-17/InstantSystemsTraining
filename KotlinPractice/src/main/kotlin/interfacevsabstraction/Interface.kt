package interfacevsabstraction

fun main(){
    val s2 = Student2()
    s2.todo()
    s2.eat()
}

interface Person2 {

    // Properties in Interface
    var name:String        // Properties in interface are abstract by default
    //    var name2: String = "ajiko"       //  cannot be initialized
    //    abstract var name3: String        // no need of abstract keyword
    //    abstract var name4 : String = "vnsi"       // Error Property with initializer cannot be abstracted

    // Methods in interfaces
    fun eat()                                 // No need of abstract by default it is abstract
    //        abstract fun eat2(){}           // Error function with body cannot be abstracted

    fun todo() {                             // Normal function must have body and public and open by default.
        println("todo first")
    }
}

interface NewInterface {
    var name: String

    fun eat()

    fun todo() {
        println("todo second")
    }                             // Normal function must have body and public and open by default.
}



class Student2 : Person2, NewInterface{
    override var name : String = "Yadav"

    override fun eat() {
        println("override student eat")
    }

    override fun todo() {                          // it is not mandatory to override todo.
        super<NewInterface>.todo()                 // but if we have two parents and both conatians same
        super<Person2>.todo()                      // method with same name, then it is mandatory to override
                                                    // open normal function.
        println("override student todo")
    }
    init{
        println(name)
    }
}
