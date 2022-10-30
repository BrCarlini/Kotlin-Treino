fun main() {

    print("Largura: ")
    val largura = readln().toDouble()

    print("Altura: ")
    val altura = readln().toDouble()

    println("Sua area é de ${metroQuadrado(largura, altura)}m²")

    println("Para pintar essa parede, você precisará de ${metroQuadrado(largura, altura) / 2}l de tinta")

}

fun metroQuadrado(larg: Double, alt: Double): Double = larg * alt
