fun main() {
    val media = Media(FileDownloader("filedownload"), FilePlayer("fileplaying"))
    media.download()
    media.play()

}
class Media(val download : Downloader, val player : Player) : Downloader, Player{
    override fun download() {
        download.download()
    }

    override fun play() {
        player.play()
    }
}

class FileDownloader(val name: String) : Downloader{
    override fun download() {
        println("download $name")
    }
}
class FilePlayer(val name : String) :  Player{
    override fun play() {
        println("Player $name")
    }
}

// Move to Delegation2.kt to see how delegation works