fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(buscaBinaria(array, 8))
}

fun buscaBinaria(array: IntArray, valor: Int): Int {
    var inicio: Int = 0
    var fim: Int = array.size - 1

    while (inicio <= fim) {
        var meio: Int = (inicio + fim) / 2

        if (array[meio] > valor) {
            fim = meio - 1
        } else if (array[meio] < valor) {
            inicio = meio + 1
        } else {
            return meio
        }
    }
    return -1
}