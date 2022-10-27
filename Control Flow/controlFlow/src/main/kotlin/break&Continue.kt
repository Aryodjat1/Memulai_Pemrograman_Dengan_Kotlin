fun main() {
//    use continue
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfInt) {
        if (i == null) continue
        print(i)
    }

//    use break
    println("")

    for (i in listOfInt) {
        if (i == null) break
        print(i)
    }

//    break and continue label
    loop@ for (i in 1..10) {
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if ( j > 5) break@loop
        }
    }
}