package inheritance

/**
 * To access superclass using inner class of dervied class, we use @super keyword
 */

open class Rectangles {
    open fun draw() { println("Drawing a rectangle") }
    val borderColor: String get() = "black"
}


class FilledRectangle: Rectangles() {
    override fun draw() {
        val filler = Filler()
        filler.drawAndFill()
    }

    inner class Filler {
        fun fill() { println("Filling") }
        fun drawAndFill() {
            super@FilledRectangle.draw() // Calls Rectangle's implementation of draw()
            fill()
            println("Drawn a filled rectangle with color ${super@FilledRectangle.borderColor}") // Uses Rectangle's implementation of borderColor's get()
        }
    }
}


fun main() {
    val fr = FilledRectangle()
    fr.draw()
}