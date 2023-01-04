class Extension {
    var skills : String? = null

    fun show() = println(skills)
}

// extension function in classes

class Host(val hostname: String) {
    fun printHostname() { print(hostname) }
}

class Connection(val host: Host, val port: Int) {
    fun printPort() { print(port) }

    fun Host.printConnectionString() {
        printHostname()   // calls Host.printHostname()
        print(":")
        printPort()   // calls Connection.printPort()
    }

    fun connect() {
        host.printConnectionString()   // calls the extension function
    }
}

fun main() {
    Connection(Host("kotlin"), 443).connect()
//    Host("kotl.in").printConnectionString()  // error, the extension function is unavailable outside Connection
}