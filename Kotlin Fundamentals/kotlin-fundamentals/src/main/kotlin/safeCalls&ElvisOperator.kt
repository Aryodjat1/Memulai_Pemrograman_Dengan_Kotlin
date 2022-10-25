// Safe calls operator (?.)
/*
 Yang pertama akan kita pelajari adalah Safe Calls.
 Seperti namanya, safe call akan menjamin kode yang kita tulis aman dari NullPointerException.
 Dalam menggunakan safe call, kita akan mengganti tanda titik (.) dengan tanda (?.)
 saat mengakses atau mengelola nilai dari objek nullable. Seperti ini:
*/
fun safeCallsOperator (){
    val text: String? = null
    text?.length
}

// Elvis Operator (?:)
// Elvis operator memungkinkan kita untuk menetapkan default value atau nilai dasar jika objek bernilai null.
fun elvisOperator () {
    val text: String? = null
    val textLength = text?.length ?: 7
}

// Non Null Asertion ()
fun nonNullAssertion() {
    val text: String? = null
    val textLength = text!!.length
}