package MODUL1

class PRAK104(bidang: String, tanah: Int, penghasilan: Int) {
    val bidang: String = "Petani";
    val tanah: Int = 1500;
    val penghasilan: Int = (4..15).random();
}
fun main() {
    println("Pekerjaan seorang Random");
    val bidang = "Petani";
    val tanah = 1500;
    val penghasilan = (4..15).random();
    val pekerjaan = PRAK104(bidang, tanah, penghasilan);

    println("Pak Random adalah seorang ${pekerjaan.bidang}");
    println("Luas lahan pak Random adalah ${pekerjaan.tanah} Hektar");
    println("Penghasilan pak Random sekitar ${pekerjaan.penghasilan} juta per minggu");

}
