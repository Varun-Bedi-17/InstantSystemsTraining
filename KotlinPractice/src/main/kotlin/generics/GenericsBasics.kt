fun main() {
    val c : Generics<String> = Generics("harish")
    println(c.getValue())
    c.setValue("Raj")
    println(c.getValue())

    val i = Generics<Int>(54)
    println(i.getValue())
    i.setValue(34)
    println(i.getValue())

}

class Generics<T>(var name : T){
    fun setValue(name2: T){
        name = name2
    }
    fun getValue() : T{
        return name
    }
}