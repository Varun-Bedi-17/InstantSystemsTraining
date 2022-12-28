package conditionAndLoops
fun main() {
    val describe = describe("str")
    println(describe)

    // for
    val itemsFor = listOf("apple", "banana")
    for(item in itemsFor) println(item)
    for (index in itemsFor.indices){
        println(itemsFor[index])
    }

    for (i in 1..10 step 3)println(i)
    for (i in 1 until 10 step 3) println(i)
    for (i in 5 downTo 1) println(i)


    //while
    var item = 0
    var itemsWhile = arrayOf("Hello", "Varun")
    while (item < itemsWhile.size){
        println(itemsWhile[item])
        item+=1
    }

    // when
    val y = 1
    when(y){
        1 -> println("1")
        is Int -> println("Int also")             // Not print it
    }
}


// when
fun describe(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }