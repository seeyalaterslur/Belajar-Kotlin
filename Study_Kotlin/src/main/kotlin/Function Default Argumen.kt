//untuk menambahkan default arg bisa dengan cara menambahkan (= "") didalam parameternya
fun hello(firstName: String, lastName: String = " "){
    println("Hello $firstName $lastName")
}
//tidak wajib diisi jika param sudah menjadi default param
fun main() {
    hello("Boy")
    hello("Aryudha", "Willy")
}