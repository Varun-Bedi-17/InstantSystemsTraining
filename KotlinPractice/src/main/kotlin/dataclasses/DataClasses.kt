package dataclasses
fun main() {
    val person1 = PersonDataClass("Harshit", 1, 7865)
    val person2 = PersonDataClass("Raj", 1, 7865)
    val person3 = PersonDataClass("Mohit", 3, 9812)


    // Basic methods
    println(person1)                    // Same as println(person1.toString())
    println(person2)
    println(person1.hashCode())
    println(person1 == person2)             // Same as println(person1.equals(person2). False for normal class.
    println( person1 == person3)

    // Special methods of data class
    val person4 = person3.copy()
    println(person4)
    val person5 = person3.copy(age = 4, number = 1234)
    println(person5)

    val (name,age,no) = person4
    println("$name, $age, $no")

    println(person1.component3())
    println(person1.component2())
    person5.sayHello()

}

data class PersonDataClass(val name: String, val age: Int, val number: Int){
    val lastName: String = ""            // this lastname cannot be used in basic methods like equals, hashcode etc.

    fun sayHello(){
        println("Hello")
    }
}