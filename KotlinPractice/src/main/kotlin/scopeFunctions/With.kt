class Persons {
    var name: String = "Sriyank"
    var age: Int = 26
}

fun main() {

    /** Scope Function: 'with'
    Refer to context object by using 'this'
    The return value is the 'lambda result
    No Extension function'*/

    val person = Persons()

    val bio: String = with(person) {
        println(name)
        println(this.age)
        age + 5
        "He is a freak who loves to teach in his own way" // will be returned and stored in 'bio' variable
    }

    println(bio)

    //  Return is lambda return or you can say last value.
    val ageAfterFiveYears : Int = with(person){
        age+5
    }
    println("Age after five years is $ageAfterFiveYears")
}