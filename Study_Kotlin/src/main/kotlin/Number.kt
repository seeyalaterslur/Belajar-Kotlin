fun main() {
    //Byte max value 127
    var age: Byte = 30
    println(age)
    //Short max value 32767
    var distance: Short = 2000
    println(distance)
    //Int max value  2billion
    var height: Int = 170
    println(height)
    //Long max value 2billon++
    var balance: Long = 100000000L
    println(balance)

    println("----------------------------------")

//    Floating Point
    // Float 32bit
    var value: Float = 98.98F
    println(value)
    // Double 64bit
    var radius: Double = 2342342343.665534
    println(radius)

    println("----------------------------------")

//    Literal
    //decimal
    var decimalLiteral: Int = 100
    println(decimalLiteral)
    //hexadecimal (didepan harus ditambahkan 0x)
    var hexadecimalLiteral: Int = 0xFF
    println(hexadecimalLiteral)
    // binary (didepan harus ditambahkan 0b)
    var binaryLiteral: Int = 0b0001
    println(binaryLiteral)

    println("----------------------------------")

//    Underscore
    var price: Int = 1_000_000_000
    println(price)

    println("----------------------------------")

//    Conversion
    var angka : Int = 10000000
    //Conversion
    //byte
    var byte: Byte = angka.toByte()
    println(byte)
    //short
    var short: Short = angka.toShort()
    println(short)
    //Int
    var int: Int = angka.toInt()
    println(int)
    //float
    var float: Float = angka.toFloat()
    println(float)
    //double
    var double: Double = angka.toDouble()
    println(double)
    
}