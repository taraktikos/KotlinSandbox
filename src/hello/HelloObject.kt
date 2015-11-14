package hello

class Hello(val name: String) {
    fun say() {
        println("Hello, $name")
    }
}

fun main(args: Array<String>) {
    Hello("Name").say()
}