// FATEC LUIGI PAPAIZ
// THIAGO MESSIAS SANTOS
// DIADEMA, SP.
// 30.08

fun main() {
    val arrayNum = Array<Int>( 10, { i -> i + 1 } )
    println(arrayNum.joinToString(", "))
}