fun main() {

    // var
    var a:Int = 5
    var b : Int
    b= 10
    b +=1
    var c = 3
    println("$a , $b , $c")


    //val
    val d = 9
    //    d += 1  Not possible
    println("$d")


    // ?
    var e:String = "abc"
    //    e = null  -> Not possible
    var f:String? = "abc"
    f = null
    println("$e , $f")


    // function
    fun sum(g:Int,h:Int){
        println("${g+h}")
        // return is not allowed untill return type of function is specified.
        // fun sum(a:Int,b:Int): Unit {} - return unit when function does not return a useful value.
        //        fun sum(a:Int,b:Int): Int {}
        //        fun sum(a:Int,b:Int): string {}
        //        fun sum(a:Int,b:Int): Any {}
    }
    sum(2, 5)


    // Class  -> Final by default
    open class abc{}                 // open class such that it can be inherit.
    class Shape(var i: Int) : abc(){
        var j = i*2
    }
    val value = Shape(3)
    println("${value.j}")


    /*
    Multi-line comments
     */


    // String
    var k = 10
    var s1 = "l is $k"
    k = 12
    val s2 = "${s1.replace("is", "was")}, but now is $k"
    println("$s2")


}