fun main() {

    var extObject1  = Extension()
    extObject1.show()
    extObject1.skills = "Java"
    extObject1.show()

    var extensionObject2 = Extension()
    extensionObject2.skills = "Python"
    extensionObject2.show()

    var extObject3 = Extension()
    extObject3 = extObject1.plus3(extensionObject2)       // Extension function
    extObject3.show()

    var extObject4 = Extension()
    extObject4 = extObject3 plus2 extObject1          // Call infix
    extObject4.show()

    //Operator Overloading
    extObject4 = extObject3 + extObject4
    extObject4.show()


    // Extension function with same method in child and parent class
    printClassName(Varun())


}
fun Extension.plus3(a : Extension): Extension{
    var newA = Extension()
    newA.skills = this.skills + "  " + a.skills
    return newA
}

// Infix
infix fun Extension.plus2(a : Extension): Extension{
    var newA = Extension()
    newA.skills = this.skills + "  " + a.skills
    return newA
}


operator infix fun Extension.plus(a : Extension): Extension{
    var newA = Extension()
    newA.skills = this.skills + "  " + a.skills
    return newA
}


// Normal polymorphism

//open class Shape{
//    open fun getName() = "Shape"
//}
//class Rectangle: Shape(){
//    override fun getName() = "Rectangle"
//}
//fun printClassName(s: Shape) {
//    println(s.getName())
//}
// output -> Rectangle


// We can create same method in child and parent class using extension function.

open class People
class Varun: People()

fun People.getName() = "People"
fun Varun.getName() = "Varun"


fun printClassName(s: People) {
    println(s.getName())
}
// output -> Shape



