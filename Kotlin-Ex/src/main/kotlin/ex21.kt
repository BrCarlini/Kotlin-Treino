fun main() {
    print("Informe um número: ")
    val n = readln().toInt()

    verificaParouImpar(n)

}

fun verificaParouImpar(n: Int){

    if(n % 2 == 0){
        println("É par.")
    }else{
        println("É ímpar.")
    }
}