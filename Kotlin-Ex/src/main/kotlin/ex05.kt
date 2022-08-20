fun main() {
    //5 - Desenvolva um algoritmo que calcule a média entre cinco valores

    print("Informe um numero: ")
    val n1 = readln().toInt()

    print("Informe um numero: ")
    val n2 = readln().toInt()

    print("Informe um numero: ")
    val n3 = readln().toInt()

    print("Informe um numero: ")
    val n4 = readln().toInt()

    print("Informe um numero: ")
    val n5 = readln().toInt()

    println("Média entre os valores informados: ${geradorDeMedia(n1, n2, n3, n4, n5)}")


}

fun geradorDeMedia(num1: Int, num2: Int, num3: Int, num4: Int, num5: Int): Int{

    val media = (num1 + num2 + num3 + num4 + num5) / 5



    return media
}