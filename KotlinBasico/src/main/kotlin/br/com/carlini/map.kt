package br.com.carlini

import kotlin.random.Random
import kotlin.system.measureNanoTime

fun main() {
    val map1 = mapOf<Int, String>(
        1 to "Muito ruim",
        2 to "Ruim",
        3 to "Regular",
        4 to "Bom",
        5 to "Muito bom"
    )

    val mutable1 = mutableMapOf(
        1 to "Muito ruim",
        2 to "Ruim",
        3 to "Regular",
        4 to "Bom"
    )

    mutable1[5] = "Muito Bom"

    println(map1[1]) // Muito ruim
    println(mutable1[5]) // Muito bom
    // =================================================================================


    val listaCodigos = Array(100000){ Random.nextInt(1, 6)}
    val listMap = listOf(
        Pair(1, "Muito Ruim"),
        Pair(2, "Ruim"),
        Pair(3, "Regular"),
        Pair(4, "Bom"),
        Pair(5, "Muito Bom"),
    )
    val time1 = measureNanoTime {
        for(codigo in listaCodigos) {
            val categoria = listMap.find { it.first == codigo }!!
            println(categoria.second)
        }
    }

    println(time1)

}