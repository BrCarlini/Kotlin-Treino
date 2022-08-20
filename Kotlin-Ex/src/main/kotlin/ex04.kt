fun main() {
    // 4 - Desenvolva um algoritmo que calcule o total de dias em 7 meses, considerando que cada mês tenha 30 dias

    println(totalDias(7,30))
}

fun totalDias(qtdMeses: Int, qtdDias: Int): Int{
    return qtdDias * qtdMeses
}