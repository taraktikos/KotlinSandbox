package hello

fun main(args: Array<String>) {
    var string: String? = "String";
    println(string?.length)
    string = null
    println(string?.length)
    println(max(10, 15))
}

fun max(a: Int, b: Int) = if (a > b) a else b