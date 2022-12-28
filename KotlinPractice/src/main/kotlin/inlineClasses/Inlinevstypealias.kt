typealias str = String

// Inline class
@JvmInline
value class Inlinestr(val s: String)

fun main(){
    val aliasString : str = "string variable declared using type alias"
    val InlineString = Inlinestr("string variable declared using inline class")
    val string : String = "default string"


    fun acceptString(s: String) {}
    fun acceptNameTypeAlias(n: str) {}
    fun acceptNameInlineClass(p: Inlinestr) {}

    acceptString(string)
    acceptString(aliasString)
    // acceptString(InlineString)                     // Error as inline class create completely new type.


    acceptNameInlineClass(InlineString)
    // acceptNameInlineClass(string)                 // Error
    // acceptNameInlineClass(aliasString)            // Error

    acceptNameTypeAlias(string)
    acceptNameTypeAlias(aliasString)
    //acceptNameTypeAlias(InlineString)              // Error
}