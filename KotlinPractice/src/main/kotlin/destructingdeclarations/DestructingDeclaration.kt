fun main() {
    val destruction = DestructionDeclare(8, 7)
    println(destruction.component1())
    // println(destruction.component2())      // Throws error

    val destruction_data = DataClassDestruction(6, 5)
    println(destruction_data.component1())
    println(destruction_data.component2())      // No error
}

// to use component either we have a data class or simple class with function componentN() with operator keyword.
class DestructionDeclare(val a: Int, val b: Int){
}
operator fun DestructionDeclare.component1() = this.a


// Data Class
data class DataClassDestruction(val c: Int, val d: Int)