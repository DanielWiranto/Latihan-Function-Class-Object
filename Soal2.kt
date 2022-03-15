package Tugas1

fun main(args: Array<String>){

    val pangkat = {n1 : Double, n2 : Double -> Math.pow(n1,n2)}
    println("Hasil dari 4 pangkat 3 adalah = ${pangkat(4.0, 3.0)} ")
}