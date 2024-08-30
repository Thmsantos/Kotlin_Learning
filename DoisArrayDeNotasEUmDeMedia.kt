// FATEC LUIGI PAPAIZ
// THIAGO MESSIAS SANTOS
// DIADEMA, SP.
// 30.08

//54. Fazer um procedimento para receber as notas da primeira e da segunda prova de cinco alunos.
//Armazenar as notas da primeira e da segunda prova em vetores distintos. Calcular e escrever a média de cada aluno.

fun main() {
    val primeiraProva: Array<Double> = Array(5) { 0.0 }
    val segundaProva: Array<Double> = Array(5) { 0.0 }
    val Media: Array<Double> = Array(5) { 0.0 }
    
    for( i in primeiraProva.indices ){
        print("Nota 1º prova: ")
        primeiraProva[i] = readLine().toString().toDouble();
        
        print("Nota 2º prova: ")
        segundaProva[i] = readLine().toString().toDouble();
        
        Media[i] = (  primeiraProva[i] + segundaProva[i] ) / 2
    }
    
    println(primeiraProva.joinToString(" - "))
    println(segundaProva.joinToString(" - "))
    println(Media.joinToString(" - "))
}