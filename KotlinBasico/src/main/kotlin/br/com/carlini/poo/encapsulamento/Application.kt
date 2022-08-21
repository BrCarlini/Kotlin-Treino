package br.com.carlini.poo.encapsulamento

import br.com.carlini.poo.classes.encapsulamento.Calculadora
import java.math.BigDecimal

class Application {

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val calculadora = Calculadora()
            calculadora.somar(BigDecimal.ONE)
            calculadora.dividir(BigDecimal("50"))
        }
    }
}