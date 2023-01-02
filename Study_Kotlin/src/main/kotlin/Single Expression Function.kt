//untuk membuat single expresion function kita butuh tanda (=) setelah deklarasi nama fun dan tipe data pengembalian fun

fun kali(a: Int): Int = a * 2

fun hi(nama: String): Unit = println("Hi $nama")

fun main() {
    val result = kali(5)
    println(result)

    hi("boy")
}