fun main() {
//    Array adalah tipe data yang berisikan kumpulan data dengan tipe data yang sama
//    untuk mengakses array dengan menggunakan index

//   pembuatan data array
    val members: Array<String> = arrayOf("boy","slayer","seeyalater")

    val boy: String = members[0]
    val slayer: String = members.get(1)
    val seeyalater = members.get(2)

    members.set(0, "boyo")
    val boyo = members[0]

    println(members[2])

    println("----------------------------")

//    array nullable
    val names: Array<String?> = arrayOfNulls(5)
    names[0] = null
    names[1] = "vet"
    names[2] = null
    names[3] = "ham"
    names[4] = null

    println(names[0])
    println(names[3])
}