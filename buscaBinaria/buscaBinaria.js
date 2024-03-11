function busca_binaria(array, valor){
    let inicio = 0
    let fim = array.length - 1

    while (inicio <= fim) {
        let meio = Math.floor((inicio + fim) / 2)

        if (array[meio] > valor) {
            fim = meio - 1
        } else if (array[meio] < valor){
            inicio = meio + 1
        } else {
            return meio
        }
    }
    return -1
}

const array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
console.log(busca_binaria(array, 8))