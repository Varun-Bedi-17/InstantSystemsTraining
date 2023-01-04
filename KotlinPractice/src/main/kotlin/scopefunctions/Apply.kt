class Person2 {
    var name: String = ""
    var age: Int = 0
}

fun main() {

    /** Scope Function: 'apply'
    Refer to context object by using 'this'
    The return value is the 'context object'
     Extension function*/

    val person = Person2().apply {
        name = "Vijay"
        age = 26
    }

    with(person) {
        println(name)       // prints   Sriyank Siddhartha
        println(age)        // prints   26
    }

    // Perform some other operations on 'person' object
    person.also {
        it.name = "Varun"
        println("New name: ${it.name}")     // prints   New name: Shreks from Smartherd
    }
}