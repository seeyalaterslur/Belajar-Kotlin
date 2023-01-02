//varags itu artinya datanya bisa menerima lebih dari satu input, atau seperti Array
//bedanya dengan Array varags bisa langsung mengirim data jika lebih dari satu data cukup menggunakan(,)
//vararg harus dipapling ujung kanan penempatanya


fun hitungTotal(vararg values: Int):Int{
    var total = 0

    for (value in values){
        total += value
    }
    return total
}


fun main() {
    val result = hitungTotal(10,10,10,10)
    println(result)
}