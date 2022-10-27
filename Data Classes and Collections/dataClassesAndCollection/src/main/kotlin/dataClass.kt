class User(val name : String, val age : Int){

    override fun toString(): String {
        return super.toString()
    }
}
data class DataUser(val name : String, val age : Int){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}

fun main() {
    val user = User("nrohmen", 17)
    val dataUser = DataUser("nrohmen", 17)

    println(user)
    println(dataUser)

//    fungsi equals()
    val dataUser1 = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)

    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))

//    Copy a data
    val dataUser4 = DataUser("nrohmen", 17)
    val dataUser5 = DataUser("nrohmen", 17)
    val dataUser6 = DataUser("dimas", 24)
    val dataUser7 = dataUser4.copy()

    val dataUser8 = dataUser4.copy(age = 18)

    println(dataUser4)


}