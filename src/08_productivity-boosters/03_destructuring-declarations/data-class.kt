data class User(val username: String, val email: String)

fun getUser() = User("Mary", "mary@somewhere.com")

fun main() {
    val user = getUser()
    val (username, email) = user
    println("$username, $email")
    println(username == user.component1())

    val (_, emailAddress) = getUser()
    println(emailAddress)
}
