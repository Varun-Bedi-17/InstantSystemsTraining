package inheritance

/**
 * If the derived class does not contain a primary constructor, we need to call the base class secondary constructor
 * from the secondary constructor of derived class using the super keyword.
 */

open class BaseConstructor{
    constructor(id : Int, value : Int){
        print("Id is $id        ")
        print("Value is $value      ")
    }
}

class SecondaryConstructor : BaseConstructor{
    constructor(id : Int, value : Int, number : Int) : super(id, value){
        println("Number : $number")
    }
}

fun main(){
    SecondaryConstructor(78, 590, 22)
}