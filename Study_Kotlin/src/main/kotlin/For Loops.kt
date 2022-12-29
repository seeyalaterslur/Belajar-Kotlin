fun main() {
    val driver = arrayOf("HAM","VET","MAX","RIC","RUS")
    var total = 0
    for (a in driver){
        println(a)

    }


    println("------------------------------")

    val ukuranArray = driver.size -1
    for (i in 0..ukuranArray ){
        println("Index $i = ${driver.get(i)}")
    }

}