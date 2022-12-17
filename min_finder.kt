import kotlin.Int.Companion.MIN_VALUE

fun main() {
    var max = MIN_VALUE
    do {
        val num = readln().toInt()
        if (num > max) {
            max = num
        }
    } while (num != 0)
    print(max)
}
