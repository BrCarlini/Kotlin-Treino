fun main(){
    print("Informe um número: ")
    val valor = readln().toInt()

    println("Numero informado ${valor}")
    println(numSucessor(valor))
    println(numAntecessor(valor))
}

fun numSucessor(n: Int):String = "Sucessor: ${n + 1}"


fun numAntecessor(n: Int): String = "Antecessor: ${n - 1}"