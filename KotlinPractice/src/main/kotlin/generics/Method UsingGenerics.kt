// Generics in method
fun main() {
    fun <T> printValue(list: List<T>): List<T> {
        for (ele in list) {
            println(ele)
        }
        //        list.forEach{println(it)}
        return list
    }

    val nums = listOf(2, 5, 6, 8)

    println(printValue(nums))

}