//FATEC LUIGI PAPAIZ
//THIAGO MESSIAS SANTOS
//DIADEMA, SP.
//18.08

fun main(){
    val valor: Double = readLine().toString().toDouble();
    val taxa: Double = readLine().toString().toDouble();
    val tempo: Int = readLine().toString().toInt();
    
    println("Prestação: ${ valor + ( valor * ( taxa / 100 ) * tempo ) }")
}