fun calucurate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun main() {
    val sumResult = calucurate(4, 5, ::sum)
    val mulResult = calucurate(4, 5) { a, b -> a * b }
    println("sumResult $sumResult, mulResult $mulResult")
}
