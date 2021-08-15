fun main() {
    val str: String = "is not null"
    println(describeString(str))

    val nullable: String? = null
    println(describeString(nullable))
}

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    }

    return "Empty or null string"
}
