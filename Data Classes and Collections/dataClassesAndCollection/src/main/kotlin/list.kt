// FORMULA
//     val numberList : List<Int> = listOf(1, 2, 3, 4, 5)


fun main() {
    val numberList = listOf(1, 2, 3, 4, 5)
    val charList = listOf('a', 'b', 'c')
    val anyList = listOf('a', "Kotlin", 3, true)

    // with class
    val anyList1 = listOf('a', "Kotlin", 3, true, User("djats", 8))

//    mutable list
    val anyList2 = mutableListOf('a', "Kotlin", 3, true, User("djats", 8))
}