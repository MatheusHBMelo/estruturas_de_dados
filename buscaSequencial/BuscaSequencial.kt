fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(buscaSequencial(array, 8))
}

fun buscaSequencial(array: IntArray, valor: Int): Int {
    for (i in array.indices){
        if (array[i] == valor){
            return i
        }
    }
    return -1
}