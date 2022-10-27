fun main() {

    val ranges = 1..5
    for (i in ranges){
        println("value is $i!")
    }

//    add extension step
    val ranges1 = 1.rangeTo(10) step 3
    for (i in ranges1){
        println("Value is $i!")
    }

//    use withIndex()
    val ranges2 = 1.rangeTo(10) step 3
    for ((index, value) in ranges2.withIndex()) {
        println("value $value with index $index")
    }

//    use forEach
    val ranges3 = 1.rangeTo(10) step 3
    ranges3.forEach { value ->
        println("value is $value!")
    }

//    forEachIndexed
    val ranges4 = 1.rangeTo(10) step 3
    ranges4.forEachIndexed { index, value ->
        println("value $value with index $index")
    }

//    Only index
    val ranges5 = 1.rangeTo(10) step 3
    ranges5.forEachIndexed { index, _ ->
        println("index $index")
    }
}