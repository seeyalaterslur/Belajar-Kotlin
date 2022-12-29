fun main() {
//    String ("")untuk 1 baris, (""")untuk lebih dari 1 baris
    var firstname: String = "Aryudha"
    var lastname: String = "Willy"
    var nim : Int = 672020232
    println(firstname)
    println(lastname)
    println(nim)

    println("-------------------------------------")

//    Lebih dari 1 baris
    var address : String = """
        Street: Jl. Serayu Selatan
        Province: Central Java
        Country: Indonesia
    """
    println(address)

    println("-------------------------------------")

//    TrimMargin digunakan untuk merapihkan disaat menggunakan (""") default pemisah (|) dan bisa diganti
    var hobbie : String = """
        |Main game
        |Belajar
        |Sunmori
    """.trimMargin()
    println(hobbie)

    println("-------------------------------------")

//    Menggabungkan String dengan operator (+) (tidak direkomendasikan kotlin)
//    var fullname : String = firstname + " " + lastname
//    println(fullname)

//    String Template (direkomendasikan menggunakan ini)
    var fullname : String = "$firstname $lastname"
    println(fullname)

//   untuk operasi lebih dari satu memakai ${}
    var desc: String = """
        |nama: $fullname
        |total karakter = ${fullname.length}
    """.trimMargin()
    println(desc)
}