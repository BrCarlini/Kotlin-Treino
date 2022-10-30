fun main() {
    print("KM captado: ")
    val km = readln().toDouble()

    calculoMulta(km)

}

fun calculoMulta(km: Double){

    if(km > 80){
        val multa = (km - 80) * 7
        println("Você levou multa, sua velocidade foi de $km Km/h.\nValor da multa é de R$$multa")
    }else{
        println("Não levou multa.")
    }

}