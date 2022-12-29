//kalau function ingin mengembalikan data tersebut kita harus menuliskan tipe data yang ingin dikembalikan
fun sum(a: Int, b: Int):Int {
    val total = a+b
    return total
}

fun main() {
//    bisa langsung print
    println(sum(20, 5))

//    bisa ditampung kedalam variable baru
    val result = sum(10 , 5)
    println(result)
}