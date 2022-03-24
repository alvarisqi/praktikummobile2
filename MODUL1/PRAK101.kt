fun main() {

    print("Waktu Sekarang : ");
    var waktu = readLine();
    print("Nama Anda : ");
    var nama = readLine();
    print("Umur Anda : ");
    var umur = readLine();
    var suhu = (35..37).random();
    println("Suhu Tubuh Anda : $suhu\n");

    println("Selamat $waktu, $nama");
    println("Umur anda $umur Tahun");
    println("Suhu Tubuh anda $suhu derajat Celsius");
}
