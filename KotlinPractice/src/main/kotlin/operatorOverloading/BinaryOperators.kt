fun main(){
    val c= BinaryOperators(10)
    println(c + 2)
    println(c - 2)
    println( c * 2)
}

class BinaryOperators(var x: Int) {

    operator fun plus(y: Int): Int {                    // Plus two times
        x = x + y + y
        return x
    }

    operator fun minus(y: Int): Int {
        x = x - (2 * y)
        return x
    }

    operator fun times(y: Int): Int {
        x = x * y * y
        return x
    }

}

    // Similarly
//    Expression                              Translated to
//
//    a + b                                   a.plus(b)
//
//    a - b                                   a.minus(b)
//
//    a * b                                   a.times(b)
//
//    a / b                                   a.div(b)
//
//    a % b                                   a.rem(b)
//
//    a..b                                    a.rangeTo(b)
