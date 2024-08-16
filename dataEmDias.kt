fun main(){
    val dias: Int = readLine().toString().toInt();
    val mes: Int = readLine().toString().toInt();
    val ano: Int = readLine().toString().toInt();
    println("dias: ${(ano * 365) + (mes * 30) + (30 - dias)}")
}
