package `Ex-POO`.ex1

import java.time.LocalDate

fun main() {
    /*

    val dia = LocalDate.now().dayOfMonth
    val mes = LocalDate.now().monthValue
    val ano = LocalDate.now().year


    println("Dia: $dia")
    println("Mes: $mes")
    println("Ano: $ano")

    */


    val pessoa1 = Pessoa(
        "Bruno",
        1997,
        1.75
    )

    pessoa1.exibirDados()

    val idadeAtual = pessoa1.calcularIdade(2022)

    println("Idade: $idadeAtual anos")
}