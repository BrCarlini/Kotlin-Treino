fun main() {

    print("Informe a quantidade em metros: ")
    val metros = readln().toDouble()

    println("Metros para centimentros: ${metrosEmCentimetros(metros)}")
    println("Metros para milimetros: ${metrosEmMilimetros(metros)}")

}


fun metrosEmCentimetros(m: Double): Double = m * 100

fun metrosEmMilimetros(m: Double): Double = m * 1000