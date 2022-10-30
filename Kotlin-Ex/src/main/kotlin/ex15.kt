fun main() {

    print("Informe o preço: ")
    val preco = readln().toDouble()

    print("Informe a % de desconto: ")
    val desc = readln().toDouble()

    println("Valor do desconto $${desconto(preco, desc)}")
    println("Preço final com o desconto: $${preco - desconto(preco, desc)}")

}

fun desconto(preco: Double, desc: Double): Double  = (desc/100) * preco