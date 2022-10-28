// Collection yang dapat menyimpan data dengan format key-value.

fun main() {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )
//    Get Value 1
    println(capital["Jakarta"])
//    Get Value 2
    println(capital.getValue("Jakarta"))

//    Mutable Map
    val mutableCapital = capital.toMutableMap()

    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")
}