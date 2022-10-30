fun main() {

    println(exibeValorConvertido())

}


fun converteEmDolares(vReal: Double, cotacao: Double): Double = vReal / cotacao


fun exibeValorConvertido(){

    print("Informe o seu valor em reais que deseja converter: ")
    val real = readln().toDouble()

    print("Valor da cotação atual: ")
    val cotacaoDol = readln().toDouble()

    println("Valor convertido: \$${converteEmDolares(real,cotacaoDol)}")
}