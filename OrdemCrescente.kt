//FATEC LUIGI PAPAIZ
//THIAGO MESSIAS SANTOS
//DIADEMA, SP.
//23.08

fun main() {
    val a: Int = readLine().toString().toInt();
    val b: Int = readLine().toString().toInt();
    val c: Int = readLine().toString().toInt();
    val lista: List<Int> = listOf( a, b, c )
    val arrayOrdenado: IntArray = lista.toIntArray().sortedArray()
    println(arrayOrdenado.joinToString(", "))
}
