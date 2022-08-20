fun main() {
    // 7 - Desenvolva um algoritmo que determine se uma pessoa é maior de idade ou não

    println("Informe a idade: ")
    val idade = readln().toInt()

    println(identificadorIdade(idade))
}

fun identificadorIdade(idade: Int): String{

    if(idade >= 18){
        return "Maior de Idade"
    }else{
        return "Menor de Idade"
    }
}