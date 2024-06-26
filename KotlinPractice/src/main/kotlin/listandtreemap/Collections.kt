import java.util.TreeMap

fun main() {

    // listOf
//    val nums : List<Int>
//    nums = listOf(1,2,3,4)
//    println(nums)

//    val nums : List<Any> = listOf(1,2,3,4,"hello")
//    println(nums)

    val nums = listOf<Any>("abc", 2, true)
    println(nums)


    //mutableListOf
//    val array = mutableListOf<Any>(1,2,3)
//    array.add("string")
//    println(array)

//    val array : MutableList<Any>
//    array = mutableListOf("abhb","jk")
//    array.add(1)
//    println(array)

//    val array : MutableList<Int> = mutableListOf(1,2,3,4)
//    println(array)

    val array = mutableListOf("ckck", "duih", 2)
    println(array)


    //TreeMap
//    val alphabets = TreeMap<Int, String>()
//    alphabets[1] = "A"
//    alphabets[2] = "B"
//    println(alphabets)

//    val alphabets2 : TreeMap<Any, Any>
//    alphabets2 = TreeMap()
//    alphabets2[1] = 2
//    alphabets2[2]= 3
//    print(alphabets2)

    // Treemap conatins sorted key-value pairs. We can provide comparator to change sorted behaviour.
    val alphabets : TreeMap<Any, Any> = TreeMap()
    alphabets[2] = "B"
    alphabets[1] = "A"

    // Sort automatically
    println(alphabets)

    for((word,alphabet) in alphabets)
    {
        println("$word for $alphabet")
    }

    println(alphabets.keys)
    println(alphabets.values)
    println(alphabets.getOrDefault(2, "E"))
    println(alphabets.containsKey(4))
    println(alphabets.containsValue("B"))

    println(alphabets.putIfAbsent(3,"C"))
    println(alphabets)

    println(alphabets.putAll(mapOf(7 to "G", 5 to "E", 4 to "D", 6 to "G")))
    println(alphabets)

    println(alphabets.remove(6))
    println(alphabets)

}