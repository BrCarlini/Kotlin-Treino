package br.com.carlini

fun main() {
    // if(se)
    val tipoDeRota = "CARRO" // A_PE, CARRO, ONIBUS E TREM

    if(tipoDeRota == "A_PE"){
        println("Traçando rota a pé")
    } else if(tipoDeRota == "CARRO"){
        println("Traçando rota de Carro")
    } else if(tipoDeRota == "ONIBUS"){
        println("Traçando rota de Onibus")
    } else if(tipoDeRota == "TREM"){
        println("Traçando a rota de TREM")
    } else{
        println("Outra rota")
    }


    // when(quando)
    when(tipoDeRota){
        "A_PE" -> println("Traçando rota a pé")
        "CARRO" -> println("Traçando rota de Carro")
        "ONIBUS" -> println("Traçando rota de Onibus")
        "TREM" -> println("Traçando a rota de TREM")
        else -> println("Rota não implementada")
    }
}