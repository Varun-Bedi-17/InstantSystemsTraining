fun main(){
    Checking.obje.f()
    println(Checking.ab)
    Checking.g()                     // directly call to properties and members of parent type.
}

class Checking{

    object obje{
        fun f(){
            println("f from object")
        }
    }

    companion object compObj {                           // only one companion object for one class.
        @JvmStatic                                       // to call it from java file using same syntax.
        val ab =78
        fun g(){
            println("g from companion object")
        }
    }
}