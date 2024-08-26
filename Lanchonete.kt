//FATEC LUIGI PAPAIZ
//THIAGO MESSIAS SANTOS
//DIADEMA, SP.
//23.08

/*
| Código | Item              | Preço |
|--------|-------------------|-------|
| 100    | Cachorro quente   | 1,20  |
| 101    | Bauru simples     | 1,30  |
| 102    | Bauru com ovo     | 1,50  |
| 103    | Hambúrguer        | 1,20  |
| 104    | Cheeseburguer     | 1,30  |
| 105    | Refrigerante      | 1,00  |
*/

fun main() {
    val arrayCode = intArrayOf(100, 101, 102, 103, 104, 105)
    val arrayItems = arrayOf("Cachorro Quente", "Bauru Simples", "Bauru com Ovo", "Hambúrguer", "Cheeseburguer", "Refrigerante")
    val arrayPreco = doubleArrayOf(1.20, 1.30, 1.50, 1.20, 1.30, 1.00)
    
    var total = 0.0
    var continuar = true

    while (continuar) {
        println("Digite o número do seu pedido: ")
        println("100 - Cachorro Quente, 101 - Bauru Simples, 102 - Bauru com Ovo, 103 - Hambúrguer, 104 - Cheeseburguer, 105 - Refrigerante")
        val pedido = readLine()?.toIntOrNull()

        if (pedido != null) {
            for (i in arrayCode.indices) {
                if (arrayCode[i] == pedido) {
                    total += arrayPreco[i]
                    break
                }
            }
        }

        println("Deseja fazer mais algum pedido? (1) - SIM, (0) - NÃO")
        val decisao = readLine()?.toIntOrNull() ?: 0

        if (decisao != 1) {
            continuar = false
        }
    }

    println("Total: $total")
}