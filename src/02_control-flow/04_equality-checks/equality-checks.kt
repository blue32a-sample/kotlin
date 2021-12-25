fun main() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)
    println(authors === writers)

    val authors2 = setOf("Shakespeare", "Hemingway", "Twain")

    println(authors == authors2)
    println(authors === authors2)

    val authors3 = authors

    println(authors == authors3)
    println(authors === authors3)
}
