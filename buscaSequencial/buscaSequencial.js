function busca_sequencial(array, valor) {
    for (let i = 0; i <= array.length - 1; i++) {
        if (array[i] == valor){
            return i;
        }
    }
    return -1
}

const array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
console.log(busca_sequencial(array, 8))