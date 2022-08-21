package br.com.carlini.poo.heranca

import br.com.carlini.poo.classes.encapsulamento.Calculadora
import java.math.BigDecimal

class Application {


    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val calculadora = Calculadora()
            calculadora.somar(BigDecimal(2))


            val calculadoraCientifica = CalculadoraCientifica()
            calculadoraCientifica.somar(BigDecimal(2))
            calculadoraCientifica.potencia(2)
        }
    }
}