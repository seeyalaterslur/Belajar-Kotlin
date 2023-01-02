//extension function adalah kemampuan menambahkan fun pada tipe data yang sudah ada
//untuk membuat extension fun cukup dengan menambahkan tipe data pada nama funnya lalu diikuti tanda (.)titik
//untuk mengakses datanya di extension funtion bisa menggunakan kata kunci (this)

fun String.hello():String = "hello $this"

fun String.printName(): Unit = println("Hello $this")

fun main() {
    val name = "boy"
    println(name.hello())

    name.printName()
    
    "Aryudha".printName()
}