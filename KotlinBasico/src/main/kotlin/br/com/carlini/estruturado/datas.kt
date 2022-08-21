package br.com.carlini

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Date

fun main() {
    val date = Date()
    val localDate = LocalDate.now()
    val localDateTime = LocalDateTime.now()


    println(localDate.dayOfMonth)

    val somaDia = localDate.dayOfMonth + 1
    println(somaDia)
}