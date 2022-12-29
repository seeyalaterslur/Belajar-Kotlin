fun fullName(
    firstName: String,
    nickName: String,
    lastName : String,
    age      : Int,
){
    println("Your Bio is: $firstName ($nickName) $lastName $age ")
}
//func named param adalah supaya kita bisa memanggil nama param tidak urut
//jadi sangat memudahkan jika kita memiliki banyak macam nama param
//Wajib menggunakan cara dibawah ini untuk menggunakan named func
fun main() {
    fullName(
        firstName = "Aryudha",
        lastName = "Willy",
        age = 21,
        nickName = "Seeyalater"
    )
}