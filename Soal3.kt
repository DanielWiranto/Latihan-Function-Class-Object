package Tugas1

class Barang(nama: String, harga: Int, jumlah: Int, diskon: Int){
    var nama = nama;
    var harga = harga;
    var jumlah = jumlah;
    var diskon = diskon;

    fun tampil(){
        println("Nama Barang: $nama");
        println("Harga Barang: $harga");
        println("Jumlah Barang: $jumlah");
        println("Diskon Barang: $diskon");
    }

    fun hitungTotal(): Int {
        return harga * jumlah * diskon;
    }
}

fun main(args: Array<String>) {
    val barang_A = Barang("Buku",3000,5,10);
    barang_A.tampil();
    println(barang_A.hitungTotal());
}
