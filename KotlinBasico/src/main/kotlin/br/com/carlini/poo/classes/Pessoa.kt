package br.com.carlini.poo.classes

import java.time.LocalDate

class Pessoa(
    val cpf: String,
    val nome: String,
){



    fun falar(msg: String){
        println("$nome falou: $msg")
    }

}