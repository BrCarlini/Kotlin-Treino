package br.com.carlini

fun main() {
    // Sinal de Atribuição (=)
    val inteiro = 1
    val helloWorld = "Hello World Operadores"

    /* Operadores com Strings
        + -> Concatenar
     */

    println("Hello" + "World")  // Vai resultar em Hello World normalmente
    println("Outra forma de concatenação é ${"Usando essa notação"}")

    /* Operadores Numéricos
        + -> Somar
        - -> Subtrair
        * -> Multiplicar
        / -> Dividir
        % -> Dividir e pegar o resto da divisão
     */

    println("########## Operadores Numéricos ##########")
    println("33 + 47    = ${33 + 47}")          // Deve resultar 33 + 47 = 80
    println("33 - 47    = ${33 - 47}")         // Deve resultar 33 - 47 = -14
    println("7 * 8      = ${7 * 8}")          // Deve resultar 33 - 47 = -14
    println("10 / 3     = ${10 / 3}")        // Deve resultar 10 / 3 = 3
    println("10.0 / 3.0 = ${10.0 / 3.0}")   // Deve resultar 10.0 / 3.0 = 3.3333333
    println("10 % 3     = ${10 % 3}")      // Deve resultar em 1, pois o resto de 10 / 3 é 1

    /* Operadores de Comparação
        == Igualdade
        > Maior que
        < Menor que
        >= Maior igual que
        <= Menor igual que
     */
}