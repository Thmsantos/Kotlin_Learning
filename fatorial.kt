//FATEC LUIGI PAPAIZ
//THIAGO MESSIAS SANTOS
//DIADEMA, SP.
//27.08

fun main() {
    val num: Int = readLine().toString().toInt();
    var fatorial: Int = 1;
    
    for( x in 1..num ){
        fatorial = fatorial * x;
    }
    
    println(fatorial)
}
