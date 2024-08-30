// FATEC LUIGI PAPAIZ
// THIAGO MESSIAS SANTOS
// DIADEMA, SP.
// 30.08

fun main() {
    val A = Array<Int>( 10, { i -> i + 1 } )
    val B = Array(10) { 0 }
    
    for( i in B.indices ){
        B[i] = A[i] * 2
    }
    
    println(A.joinToString("-"))
    println(B.joinToString("-"))
}