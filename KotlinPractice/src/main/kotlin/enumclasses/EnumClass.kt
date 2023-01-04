
fun main() {
    val month = Months.JULY
    println(month)                                    // Same as println(month.name) name is predefined in enum.
    println(month.number)
    month.printMonth()



    //Each enum objects has two properties : ordinal and name
    println(month.ordinal)
    println(month.name)

    // Each enum object has two methods : values() and valueOf()
    println("===============================================================================")
    val values : Array<Months> = Months.values()
    values.forEach { println(it) }

    println(Months.valueOf("February"))// Throws IllegalArgumentException if value is not present in enum constants

}

enum class Months(val number : Int){
    JANUARY(1),                                        // Jan, Feb ... are objects of enum classes.
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);                                 // Semicolon after declaration of last object

    private val a : String = "Month is"
    fun printMonth(){
        println("$a : $this")
    }
}
