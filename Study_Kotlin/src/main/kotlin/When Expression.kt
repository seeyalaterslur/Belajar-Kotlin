fun main() {
//    When expression lebih simple dari if
//    Cuman bisa dipake untuk case sederhana
    val nilai = "A"
    when (nilai) {
        "A" -> println("BAGUS")
        "B" -> println("MAYAN")
        "C" -> println("CEMAS KAU DEK")
        "D" -> println("BLOK")
        else -> println("TOLOL")
    }

    println("---------------------")

//    multiple option
    when (nilai){
        "A","B" -> println("Lulus")
        else -> println("Coba lagi dek")
    }

    println("---------------------")

//    multiple IN
    val finalExamp = "E"
    val passValue = arrayOf("A","B","C")
    when (finalExamp){
        in passValue -> println("Lulus")
        !in passValue -> println("TOLOL")
    }

    println("---------------------")

//    multiple IS (untuk mengecek tipe data)
    val name = "boy"
    when (name){
        is String -> println("TRUE")
        !is String -> println("FALSE")
    }

    println("---------------------")

//    WHEN pengganti IF ELSE
    val attendant = 75
    when {
        attendant >= 80 -> println("RAJIN")
        attendant <= 80 -> println("BLOK")
    }
}