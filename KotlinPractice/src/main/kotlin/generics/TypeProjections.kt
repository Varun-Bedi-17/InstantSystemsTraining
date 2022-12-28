fun main(){

    val listProjection  = mutableListOf(1, "ghg", arrayOf(2,5))
    val listProjection2  = mutableListOf(1,32,4)
    StarProjection(listProjection)
    StarProjection(listProjection2)

    // StarProjection2(list)      // we need to explicitly provide reference of list as MutableList<Any>
}


// ==========================================================================

fun StarProjection(list : MutableList<*>){
    list.forEach{println(it)}
}

fun StarProjection2(list2: MutableList<Any>){}    // It will throw error when we pass mutable list in it.