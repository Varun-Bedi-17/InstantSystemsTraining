// The by-clause in the supertype list for Derived indicates that b will be stored internally
// in objects of Derived and the compiler will generate all the methods of Base that forward to b.

fun main() {
    val media2 = Media2(FileDownloader2("file  download"), FilePlayer2("file  playing"))
    media2.download()
    media2.play()

    //  ========================================================
    val b = BaseImpl(10)
    DerivedDelegate(b).print()

}
class Media2(val down : Downloader, val p : Player) : Downloader by down, Player by p{
}

class FileDownloader2(val name: String) : Downloader{
    override fun download() {
        println("download $name")
    }
}
class FilePlayer2(val name : String) :  Player{
    override fun play() {
        println("Player $name")
    }
}

// =====================================================================================
interface DelegationCheck {
    fun print()
}

class BaseImpl(val x: Int) : DelegationCheck {
    override fun print() { print(x) }
}

class DerivedDelegate(b: DelegationCheck) : DelegationCheck by b
