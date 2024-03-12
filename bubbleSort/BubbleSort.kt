fun main() {
    val array = intArrayOf(10, 5, 3, 6, 2, 4, 9, 8, 7, 1)
    println(array.joinToString())
    println(bubbleSort(array).joinToString())
}

fun bubbleSort(array: IntArray): IntArray {
    val n = array.size
    for (ultimo in n - 1 downTo 0) {
        for (i in 0 until ultimo) {
            if (array[i] > array[i + 1]) {
                var aux = array[i]
                array[i] = array[i + 1]
                array[i + 1] = aux
            }
        }
    }
    return array
}