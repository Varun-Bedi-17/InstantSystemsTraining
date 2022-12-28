fun main(){
    val obj = object : Human("Varun"){
        override fun fullname(): String {
            println(super.fullname())
            return "Fullname $name"
        }
    }
    println(obj.fullname())

    val obj2 = object : CheckObject{
        override fun checkfun() {
            println("Function in interface")
        }
    }
    obj2.checkfun()
}

open class Human(val name: String){
    open fun fullname() = "Person Fullname $name"
}

interface CheckObject{
    fun checkfun()
}