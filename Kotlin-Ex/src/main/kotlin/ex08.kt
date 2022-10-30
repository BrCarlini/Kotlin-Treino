fun main() {
    // 2 - Desenvolva um algoritmo que identifique se um determinado número inteiro é par ou ímpar

    print("Informe um número: ")
    val n = readln().toInt()

    println(imparOuPar(n))

}


fun imparOuPar(num: Int):String{

    if(num % 2 == 0){
        return "É PAR"
    }else{
        return "É ÍMPAR"
    }

}