class Person3 {
    var name: String = "Rajat"
    var age: Int = 26
}

fun main() {

    /** Scope Function: 'run'
     Refer to context object by using 'this'
     The return value is the 'lambda result'
     No Extension function*/

    // 'run' is combination of 'with' and 'let'
    // If you want to operate on a Nullable object and avoid NullPointerException then use 'run'

    val person: Person3? = Person3()

    val bio = person?.run {
        println(name)
        println(age)
        age + 5
        "He is a freak who loves to teach in his own way"   // will be returned and stored in 'bio' variable
    }

    println(bio)
}