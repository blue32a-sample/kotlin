fun main() {
    var neverNull: String = "This can't be null"
    neverNull = null // error: null can not be a value of a non-null type String

    var nullable: String? = "You can keep a null here"
    nullable = null

    var inferredNonNull = "The compiler assumes non-null"
    inferredNonNull = null // error: null can not be a value of a non-null type String

    strLength(neverNull)
    strLength(nullable) // error: type mismatch: inferred type is Nothing? but String was expected
}

fun strLength(notNull: String): Int {
    return notNull.length
}
