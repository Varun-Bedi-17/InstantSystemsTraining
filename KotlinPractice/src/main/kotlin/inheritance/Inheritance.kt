package inheritance

/**
 * If the derived class contains a primary constructor,
 * then we need to initialize the base class constructor using the parameters of the derived class.
 */
open class Employee(name : String , empId : Int){
    init{
        print("Employee name is : $name         ")
        print("Employee id : $empId         ")
    }
}
class WebDeveloper(name : String , empId : Int, designation : String) : Employee(name, empId){
    constructor(name : String , empId : Int, designation : String, salary: Long) : this(name, empId,designation){
        println("Employee salary : $salary")
    // this is used to provide reference of WebDeveloper class.
    }
    init{
        println("Empolyee type : $designation           ")
    }
}
class AppDeveloper(name : String , empId : Int, designation : String) : Employee(name, empId){
    init{
        println("Empolyee type : $designation")
    }
}


fun main(){
    WebDeveloper("Navneet", 20344, "Web Developer")
    WebDeveloper("Afzal", 4078, "Web Developer", 40000)
    AppDeveloper("Krishan", 3099, "App Developer")
}