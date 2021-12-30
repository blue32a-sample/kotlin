data class Person(val name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun writeCreateionLog(p: Person) {
    println("A new person ${p.name} was created.")
}

fun main() {
    val jake = Person("Jake", 30, "Android developer")
        .also {
            writeCreateionLog(it)
        }
}
