//FATEC LUIGI PAPAIZ
//THIAGO MESSIAS SANTOS
//DIADEMA, SP.
//23.08

fun main(){
    val n1: Double = readLine().toString().toDouble();
    val n2: Double = readLine().toString().toDouble();
    val n3: Double = readLine().toString().toDouble();
    val n4: Double = readLine().toString().toDouble();
    val media: Double = (n1 + n2 + n3 + n4) / 4.0
        
    if(7.0 <= media){
        println("Aprovado, Media: $media")
    } else{
        println("Reprovado, Media: $media")
    }
}
