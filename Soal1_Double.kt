package Tugas1

fun main(args: Array<String>){
    val x1a : Double = 2.0;
    val x2a : Double = 8.0;
    val y1a : Double = 3.0;
    val y2a : Double = 7.0;
    val x1b : Double = 5.0;
    val x2b : Double = -8.0;
    val y1b : Double = 3.0;
    val y2b : Double = -4.0;
    val Jarak_A = Math.pow((x2a - x1a),2.0) + Math.pow((y2a - y1a),2.0);
    val Jarak_B = Math.pow((x2b - x1b),2.0) + Math.pow((y2b - y1b),2.0);

    println("Hitung lah Jarak dari 2 buah titik t1(x1, y1) dan t2(x2, y2)");
    println("dengan nilai titik pertama yaitu t1( $x1a , $y1a ) dan t2( $x2a , $y2a )")
    println("Jarak dari 2 buah titik diatas adalah: $Jarak_A");
    println("");
    println("Hitung lah Jarak dari 2 buah titik t1(x1, y1) dan t2(x2, y2)");
    println("dengan nilai titik kedua yaitu t1( $x1b , $y1b ) dan t2( $x2b , $y2b )")
    println("Jarak dari 2 buah titik diatas adalah: $Jarak_B");

}

