fun main() {
    //6 - Desenvolva um algoritmo que calcule o desconto na venda de um produto

    print("Informe o valor do produto: ")
    val vProd = readln().toFloat()

    print("Informe a porcentagem de desconto: ")
    val vDesc = readln().toFloat()

    println("Valor do Produto: R$$vProd")
    println("Desconto: $vDesc%")
    println("Valor com o desconto aplicado: R$${desconto(vProd, vDesc)}")
}

fun desconto(vProd: Float, porcDesc: Float): Float{
    val desc = (porcDesc/100) * vProd

    return vProd - desc
}