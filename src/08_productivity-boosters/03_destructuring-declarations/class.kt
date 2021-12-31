class Pair<K, V>(val first: K, val second: V) {
    operator fun component1(): K {
        return first
    }

    operator fun component2(): V {
        return second
    }
}

class Pair2<K, V>(val first: K, val second: V) {
    operator fun component2(): K {
        return first
    }

    operator fun component1(): V {
        return second
    }
}

fun main() {
    val (num, name) = Pair(1, "one")
    println("num = $num, name = $name")

    val (name2, num2) = Pair2(2, "two")
    println("num = $num2, name = $name2")
}
