fun main() {

    somaValores()

}

fun somaValores(){

    var acumulador = 0
    var cont = 0


    while(true){
        print("Insira um valor a ser somado: ")
        val valor = readln().toInt()
        cont++
        acumulador += valor

        print("Deseja continuar ? [s/n] ")
        val opcao = readln().lowercase()

        if (opcao == "s"){
            break
        }
    }
    println("A soma dos $cont valores foi de $acumulador")
}