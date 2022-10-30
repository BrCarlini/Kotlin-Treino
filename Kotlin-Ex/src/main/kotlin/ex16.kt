fun main() {

    print("Informe o salário: ")
    val salario = readln().toDouble()


    print("Informe a % de aumento: ")
    val porc = readln().toDouble()

    val salarioTotal = salario + aumentoSalarial(salario, porc)

    println("Aumento de $${aumentoSalarial(salario, porc)}")

    println("Salario final: $$salarioTotal")
}

fun aumentoSalarial(sal: Double, porcAumento: Double): Double = (porcAumento/100) * sal