//FATEC LUIGI PAPAIZ
//THIAGO MESSIAS SANTOS
//DIADEMA, SP.
//18.08

fun main(){
   var a: Int = 3;
   var b: Int = 5;
   var c: Int
   
   println("A: ${a} -- B: ${b}");
   
   c = a;
   a = b;
   b = c;
   
   println("A: ${a} -- B: ${b}");
}