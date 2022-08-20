fun main() {
    // 1 - Desenvolva um algoritmo que retorne o valor ao quadrado de um número.

    print("Informe um número para descobrir o quadrado dele:  ")
    val num = readln().toInt()

    println("O quadrado de $num é ${quadrado(num)}")
}

fun quadrado(num: Int): Int {

    return num * num;
}