// FORMULA
/*
    fun functionName(param1: Type1, param2: Type2, ...): ReturnType {
        return result
    }
*/

un main() {
    val user = setUser("Alfian", 19)
    println(user)

    printUser("Alfian")
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}

/*
output :
Your name is Alfian, and you 19 years old
Your name is Alfian
*/