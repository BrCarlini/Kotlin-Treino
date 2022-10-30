fun main() {

    print("Informe um número para ver a tabuada dele: ")
    val num = readln().toInt()

    tabuada(num)

}

fun tabuada(n: Int){
    println("========== Tabuada ==========")
    for (i in 1..n){
        println("$n x $i = ${n*i}")
    }
}