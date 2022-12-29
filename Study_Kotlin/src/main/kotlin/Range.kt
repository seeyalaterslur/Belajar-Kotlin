fun main() {
//    cara membuat tipe data range dengan menggunakan titk dua kali (..)
//    kalo mau ngitung kebalik pake downto

    val range = 1..100 step 2
//    val range = 100 downTo 1
    println(range.count())
    println(range.contains(50))
    println(range.contains(16))
    println(range.first)
    println(range.last)
    println(range.step)
}