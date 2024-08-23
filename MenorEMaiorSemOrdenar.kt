//FATEC LUIGI PAPAIZ
//THIAGO MESSIAS SANTOS
//DIADEMA, SP.
//23.08

fun main() {
    var menor: Int? = null; 
    var maior: Int? = null; 
    
    for( i in 1..5 ){
        var numero: Int = readLine().toString().toInt();
        
        if( numero != null ){
        
            if( menor == null || menor > numero ){
                menor = numero
            }
            
            if( maior == null || maior < numero ){
                maior = numero
            }
        } else {
            println("numero invalido")
        }
    }
    
    println( "menor: $menor, maior: $maior" )
}
