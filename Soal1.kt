
fun main(args: Array<String>){
    val x1a : Int = 2;
    val x2a : Int = 8;
    val y1a : Int = 3;
    val y2a : Int = 7;
    val x1b : Int = 5;
    val x2b : Int = -8;
    val y1b : Int = 3;
    val y2b : Int = -4;
    val Jarak_A = (x2a - x1a) * (x2a - x1a) + (y2a - y1a) * (y2a - y1a);
    val Jarak_B = (x2b - x1b) * (x2b - x1b) + (y2b - y1b) * (y2b - y1b)

    println("Hitung lah Jarak dari 2 buah titik t1(x1, y1) dan t2(x2, y2)");
    println("dengan nilai titik pertama yaitu t1( $x1a , $y1a ) dan t2( $x2a , $y2a )")
    println("Jarak dari 2 buah titik diatas adalah: $Jarak_A");
    println("");
    println("Hitung lah Jarak dari 2 buah titik t1(x1, y1) dan t2(x2, y2)");
    println("dengan nilai titik kedua yaitu t1( $x1b , $y1b ) dan t2( $x2b , $y2b )")
    println("Jarak dari 2 buah titik diatas adalah: $Jarak_B");

}

