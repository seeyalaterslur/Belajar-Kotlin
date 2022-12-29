fun main() {

//    break
    var i = 1

    while (true){
        println("$i")
        i++
        if (i > 20){
            break
        }
    }

    println("-------------------------------------------")

//    continue
    for (x in 1..20){
        if (x % 2 == 0){
            continue
        }
        println(x)
    }
}