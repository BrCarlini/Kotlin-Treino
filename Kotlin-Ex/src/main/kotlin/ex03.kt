fun main() {
    // 3 - Desenvolva um algoritmo que retorne o antecessor e o sucessor de um número

    print("Informe um número para descobrir seu antecessor e sucesso: ")
    val valor = readln().toInt()

    println("Número informado: $valor")
    println("Antecessor: ${antecessor(valor)}")
    println("Sucesso: ${sucesso(valor)}")


}

fun antecessor(num: Int): Int{
    return num - 1
}

fun sucesso(num: Int): Int{
    return num + 1
}