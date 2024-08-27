//FATEC LUIGI PAPAIZ
//THIAGO MESSIAS SANTOS
//DIADEMA, SP.
//27.08

fun main() {
    for( x in 0..100 step 10 ){
        var fahrenheit: Double = ( ( 9.00 * x.toDouble() ) + 160.00 ) / 5.00 ;
        println("celsius: $x - fahrenheit: $fahrenheit")
    }
}
