fun main() {

    print("Informe a 1° Nota: ")
    val n1 = readln().toDouble()

    print("Informe a 2° Nota: ")
    val n2 = readln().toDouble()

    println("1° nota: $n1")
    println("2° nota: $n2")
    println("Média: ${mediaNotasAluno(n1, n2)}")

}

fun mediaNotasAluno(p1: Double, p2: Double):Double{
    return (p1 + p2) / 2
}