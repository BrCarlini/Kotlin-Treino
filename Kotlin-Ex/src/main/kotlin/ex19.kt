fun main() {
    println("======= JOGO DA ADIVINHAÇÃO =======")
    print("Informe um número: ")
    val numUser = readln().toInt()

    adivinhaNumero(numUser)
}

fun adivinhaNumero(n: Int){

    val aleat = (0..5).random()

    if(n == aleat){
        println("Você acertou!!")
    }else{
        println("Errou!! Tente mais tarde.")
    }

    println("Número pensado pela máquina: $aleat")

}