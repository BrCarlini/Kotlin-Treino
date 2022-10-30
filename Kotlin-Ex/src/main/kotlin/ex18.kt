

fun main() {
    coletarAlunos()

    println("Aluno sorteado: ${sortearAluno()}")
}
val alunos = mutableListOf<String>()

fun coletarAlunos(){


    for (i in 0..3){
        print("Informe o nome do ${i+1}° Aluno: ")
        val aluno = readln()

        alunos.add(aluno)
    }
    println(alunos)
}

fun sortearAluno(): String{
    val sortear = (0 until alunos.size).random()
    return alunos[sortear]
}