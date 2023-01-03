fun main(){

    val listProjection  = mutableListOf(1, "ghg", arrayOf(2,5))
    val listProjection2  = mutableListOf(1,32,4)
    starProjection(listProjection)
    starProjection(listProjection2)

//     starProjection2(listProjection)      // we need to explicitly provide reference of list as MutableList<Any>
}


// ==========================================================================

fun starProjection(list : MutableList<*>){
    list.forEach{println(it)}
}

fun starProjection2(list2: MutableList<Any>){}    // It will throw error when we pass mutable list in it.