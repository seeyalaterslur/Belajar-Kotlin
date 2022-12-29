fun main() {
    val finalexam = 75
    val attendant = 80

    val passFinalExam = finalexam >= 75
    val passAttendant = attendant >= 80

    val pass = passFinalExam && passAttendant

    println(pass)
}