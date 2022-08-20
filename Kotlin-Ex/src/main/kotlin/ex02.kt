fun main() {
    //2 - Desenvolva um algoritmo que retorne o dobro de um número:

    print("Informe um número para descobrir seu dobro: ")
    val valor = readln().toInt()

    println("Valor informado: $valor\nValor em dobro: ${dobro(valor)}")
}

fun dobro(num: Int):Int{
    return num * 2
}