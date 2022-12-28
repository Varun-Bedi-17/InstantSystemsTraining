import kotlin.properties.Delegates

fun main(){

    // lazy
    lazyvalue
    lazyvalue
    val lazyobj : Lazy by lazy{
        Lazy()
    }
    lazyobj
    lazyobj
    lazyobj


    // Observable Delegate
    println("===================== Observable Delegates =========================")
    var ObservableD : Int by Delegates.observable(50){
        property,old,new ->                                 // property contains metadata.
        println("Old Value $old")
        println("New Value $new")
    }
    ObservableD = 60
    ObservableD = 70


    // Vetoable = Used to provide some condition in obseravble deegate.
    println("===================== Vetoable =========================")
    var vetoable : Int by Delegates.vetoable(30){
            property, old, new ->
        println("Old Value $old")
        println ("New Value $new")
        new >= 30
    }
    vetoable = 70
    println(vetoable)
    vetoable = 20
    println(vetoable)                     // doesn't change as it is less than 30


}

val lazyvalue : String by lazy{
    println("computed once")
    "Hello Aliens"
}

class Lazy(){
    val c = 100
    init {
        println("I m in class")
    }
}