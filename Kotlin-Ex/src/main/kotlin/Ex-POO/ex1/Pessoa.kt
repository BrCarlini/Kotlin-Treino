package `Ex-POO`.ex1

import java.util.*


class Pessoa(
    val nome: String,
    val anoNasc: Int,
    val altura: Double
) {

    fun exibirDados(){
        println("Nome: $nome")
        println("Ano de Nascimento: $anoNasc")
        println("Altura: $altura")
    }

    fun calcularIdade(anoAtual: Int): Int{
        print("Você já fez aniversário esse ano ? (s/n) >> ")
        val resp = readln().lowercase()

        val idade = anoAtual - anoNasc

        if(resp == "s"){
            return idade
        }else{
            return idade - 1
        }
    }





}