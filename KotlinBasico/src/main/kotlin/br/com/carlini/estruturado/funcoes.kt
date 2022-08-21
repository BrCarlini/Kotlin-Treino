package br.com.carlini

import java.math.BigDecimal

fun main() {
    val precoDosProdutos = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"), BigDecimal("21.99"),
        BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("3.99")
    )

    // for
    val precoProduto = somarPrecoProdutos(precoDosProdutos)
    println("Preço Total: $precoProduto")

}

fun somarPrecoProdutos(produtos: Array<BigDecimal>): BigDecimal {
    var precoTotal = BigDecimal.ZERO
    for (preco in produtos) {
        precoTotal += preco
    }
    return precoTotal
}