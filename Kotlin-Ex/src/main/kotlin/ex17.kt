fun main() {

    print("Informe a temperatura em °C: ")
    val celsius = readln().toInt()

    println("Celsius informado: ${celsius}°")
    println("Retornado Fahrenheit: ${celsiusParaFahrenheit(celsius)}°")

}

fun celsiusParaFahrenheit(c: Int): Int = ((9 * c) / 5) + 32