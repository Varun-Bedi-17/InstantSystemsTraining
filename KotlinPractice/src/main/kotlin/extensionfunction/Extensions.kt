

open class BaseDelegation { }

class DerivedDelegation : BaseDelegation() { }

open class BaseCaller {
    open fun BaseDelegation.printFunctionInfo() {
        println("Base extension function in BaseCaller")
    }

    open fun DerivedDelegation.printFunctionInfo() {
        println("Derived extension function in BaseCaller")
    }

    fun call(b: BaseDelegation) {
        b.printFunctionInfo()   // call the extension function
    }
    fun call(d:DerivedDelegation){
        d.printFunctionInfo()
    }
}

class DerivedCaller: BaseCaller() {
    override fun BaseDelegation.printFunctionInfo() {
        println("Base extension function in DerivedCaller")
    }

    override fun DerivedDelegation.printFunctionInfo() {
        println("Derived extension function in DerivedCaller")
    }
}

fun main() {
//    BaseCaller().call(BaseDelegation())   // "Base extension function in BaseCaller"
    DerivedCaller().call(DerivedDelegation())  // "Base extension function in DerivedCaller"
//    DerivedCaller().call(BaseDelegation())  // "Base extension function in DerivedCaller"
}