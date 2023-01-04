fun main() {
    var p = Point(5)
    println(++p)
    println(++p)
    println(--p)

}

data class Point(var x:Int){

    // to increment by 2 using '++' operator
    operator fun inc() : Point{             // return type of increment and decrement function must be of
                                            // supertype or class type in which it is declared.
        var obj = Point(this.x)
        obj.x = obj.x + 2
        return obj
    }

    // Decrement by 3
    operator fun dec() : Point{
        var obj = Point(this.x)
        obj.x = obj.x - 3
        return obj
    }

    override fun toString(): String {              // override method of function.
        return "x = $x"
    }
}


//operator fun Point.inc() : Point {body}

