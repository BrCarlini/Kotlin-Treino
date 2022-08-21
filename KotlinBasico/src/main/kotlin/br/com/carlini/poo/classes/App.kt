package br.com.carlini.poo.classes

class App {

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val bruno = Pessoa("12345678902", "Bruno")
            bruno.falar("Olá, mundo")
        }


    }
}