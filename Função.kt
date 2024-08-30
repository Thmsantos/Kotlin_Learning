// FATEC LUIGI PAPAIZ
// THIAGO MESSIAS SANTOS
// DIADEMA, SP.
// 27.08

fun main() {
    var condicao: Boolean = true

    while (condicao) {
        print("Selecione a função: 1 - Fatorial || 2 - Quadrado de um número || 3 - Volume de uma lata || 4 – Sair do Programa : ")

        var opcao: Int = readLine().toString().toInt();

        when (opcao) {
            1 -> {
                print("Número: ")
                val n: Int = readLine()?.toIntOrNull() ?: 0
                println("Fatorial de $n: ${fatorial(n)}")
            }
            2 -> {
                print("Número: ")
                val n: Int = readLine()?.toIntOrNull() ?: 0
                println("Quadrado de $n: ${quadrado(n)}")
            }
            3 -> {
                print("Raio: ")
                val raio: Double = readLine()?.toDoubleOrNull() ?: 0.0
                print("Altura: ")
                val altura: Double = readLine()?.toDoubleOrNull() ?: 0.0
                println("Volume: ${volumeLata(raio, altura)}")
            }
            4 -> {
                condicao = false
            }
            else -> {
                println("Digite uma opção válida!")
            }
        }
    }

    println("Programa finalizado.")
}

fun fatorial(n: Int): Int {
    var fat: Int = 1
    for (x in 1..n) {
        fat *= x
    }
    return fat
}

fun quadrado(n: Int): Int {
    return n * n
}

fun volumeLata(raio: Double, altura: Double): Double {
    return 3.14159 * (raio * raio) * altura
}
