//fun main() {
//    var student = Student()
//    println(student.name)
//    student.name = "raj"
//    println(student.name)
//}
//
//class Student(){
//    var name = "Raman"
//}

//-------------------------------------------------------------------------------------------------------

// Use of val and var in class constructor
// ---------------------------------------


// Cannot take student.name as name is not declared
//fun main() {
//    var student = Student("Kashayp")
////    println(student.name)
//
//}
//
//class Student(name : String){
//    init{
//        println(name)
//    }
//}

// ----------------------------------------------------------------------------------------------------


//fun main() {
//    var student = Student("girish")
//    student.name = "vaibhav"                 // Now it can be initialised
//    println(student.name)
//}
//
//class Student(var name : String){
//    init{
//        println(name)
//    }
//}


// ----------------------------------------------------------------------------------------------------
fun main() {
    var student = Student("Harish",16)
    println(student.id)
    println(student.x)
}

class Student(var name : String){
    var id = -1
    val x : Int = 5
    init{
        println("$name $id")
    }
    constructor( n : String, id : Int, x : Int = 7): this(n){
//        this.id = id            // we get student.id as -1
        this.id = id
        println(id)
        println(x)

    }
}




