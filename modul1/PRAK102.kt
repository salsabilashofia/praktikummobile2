fun main () {
    print("Nilai x : ")
    val x = Integer.valueOf(readLine())
    hitung(x)
}

fun hitung(x: Int){
    var hasil = (2 * (x * x)) + (5 * x) - 8
    println(hasil)
}