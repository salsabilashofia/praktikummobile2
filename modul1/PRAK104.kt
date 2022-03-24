class hewan (val _nama: String, val _jenismakanan: String = "Omnivora", val _kembangbiak: String = "Ovipar", var _jumlahkaki: Int = 2) {
    val nama = _nama
    val jenismakanan = _jenismakanan
    val kembangbiak = _kembangbiak
    var jumlahkaki = _jumlahkaki


    fun tampil() {
        println("Nama : " + nama)
        println("Jenis Makanan : " + jenismakanan)
        println("Cara Berkembang Biak : " +kembangbiak)
        println("Jumlah Kaki : " + jumlahkaki)
    }

}

fun main(args: Array<String>) {
    val ayam = hewan("Ayam")
    ayam.tampil()
}