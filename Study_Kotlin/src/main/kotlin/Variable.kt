const val APPLICATION = "BELAJAR KOTLIN"
const val VERSION     = "0.0.1"

fun main() {
//    Variable punya 2 jenis mutable dan immutable
//    Mutable bisa merubah data sedangkan immutable tidak bisa merubah data
//    Mutable menggunakan (var) dan immutable mungganakan (val)
//    Deklarasi variable val/var namaVariable: TipeData = data
//    Direkekomendasikan menggunakan Immutable dibandingkan mutable
//    Tipe data tidak wajib dimasukkan
//    Membuat variable di kotlin wajib diisi jika tidak ingin diisi sementara bisa diganti dengan "null"
//    Cara membuat nullable menggunakan "?" setelah tipe data


    //Mutable
    var nickname: String = "Boy"
    var name =  "Aryudha"

    //mengubah data
    name =  "Boyo"
    println(name)

    //immutable
    val hobbie: String = "main game"
    val kesukaan = "belajar"

    //error jika mengubah data
//    kesukaan = "sunmori"
    println(kesukaan)

    println("---------------------------")

//    nullable
    var merk : String? = null
    merk = "Yamaha"

//    cara ngeprint variable null
//    SALAH
    println(merk)
//    BENAR
    println(merk?.length)

    println("---------------------------")

//    Variable Constant (Wajib val (immutable))
//    Variable Constant adalah immutable data yang bisa diakses secara global(bisa diakses mana aja)
//    Untuk menandai variable constant biasanya mengggunakan UPPER_CASE (tidak wajib) atau bisa menggunakan camel case
//    Penempatan variable constant berada datas main

//    Cara mengakses variable constant $(nama data)
    println("$APPLICATION : $VERSION")


}