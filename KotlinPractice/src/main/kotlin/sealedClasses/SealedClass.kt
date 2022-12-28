fun main(args: Array<String>) {
    val circle = Shape.Circle(4.0)
    val squ = Shape.Square(4)
    val rect =Rectangle(5, 8)
    val notas = Shape.NotAshape
    val nota = Shape.NotAshape



    check(circle)
    check(rect)
    check(squ)
    check(notas)
    check(nota)
}
fun check(shape : Shape){
    when(shape){
        is Shape.Circle -> println("The area of circle is ${3.14 * shape.radius * shape.radius}")
        is Shape.Square -> println("The area of square is ${shape.side *shape.side}")
        is Rectangle -> println("The area of rectngle is ${shape.height * shape.length}")
        Shape.NotAshape -> println("Not any shape")        // No need of is
        else -> {println("Nothing")}
    }
}

sealed class Shape{
    class Circle(val radius: Double) : Shape()        // Can't put this subclasses outside of this file or in any other package.
    data class Square(val side: Int) : Shape()

    object NotAshape : Shape()

//    sealed class Line: Shape()                // We can create another sealed class and interface
//    sealed interface Abc

}

object name{
    fun hello() = "hello"
}

class Rectangle(val height: Int, val length :Int) : Shape()     // Can create another class outside of sealed class
