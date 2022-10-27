//  Range direpresentasikan dengan operator .. atau dengan fungsi rangeTo() dan downTo().

fun main() {
    val rangeInt = 1..10
    print(rangeInt.step)

//  Step 2
    val rangeInt1 = 1..10 step 2
    rangeInt1.forEach {
        print("$it")
    }
    println(rangeInt1.step)

//    Using rangeTop()
    val tenToOne = 10.downTo(1)
    tenToOne.forEach {
        println("$it")
    }
    if (7 in tenToOne) {
        println("Value 7 available")
    }
}