fun main() {
    val w = Width(10)
    val h = Height(5)
    val square = Square(w, h)
    square.show()


}
@JvmInline
value class Width(val width : Int)
@JvmInline
value class Height(val height :Int)

//class Rectangle(val width : Int, val height: Int)
// Here we can change these parameters unintentionally by passing Rectangle(width, height) if the parameters
// doesn't have any special or class type reference.

class Square(val width : Width, val height: Height){
    fun show(){
        println("Width = $width, Height = $height")
    }
}