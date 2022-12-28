import kotlin.reflect.KProperty

// We can also have delegate properties.
// Suppose we have to apply some conditions on various properties so we need to provide set() function
// to each propertry.
// To get rid of this , we can use delgate in property to apply same conditions on various properties.

fun main(){
    var firstname : String? by Delegate()
    var lastname : String? by Delegate()
    firstname = "Mohit"
    lastname = "Yadav"
    println(firstname)
    println(lastname)
}

class Delegate{
    var formatted : String? = null

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String?) {// thisRef is reference of object
                                            // KProperty<*> contains metadata
                                            // value is type of String which is initialized to delegated property
        if (value != null && value.length > 5){
            formatted = value.trim().uppercase()
        }
    }
    operator fun getValue(thisRef: Any?, property: KProperty<*>) : String?{
        return formatted
    }
}