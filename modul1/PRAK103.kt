import java.util.Scanner
fun main(args: Array<String>) {
    print("Input bilangan : ")
    val x = Scanner(System.`in`)
    var kelipatan2: Int = x.nextInt()

    for (i in 1..8)
        if (i % 2 == 0 || i % 3 == 0) {
            var kelipatan = 0
            kelipatan = kelipatan2 * i
            print("$kelipatan ")
        }
}
