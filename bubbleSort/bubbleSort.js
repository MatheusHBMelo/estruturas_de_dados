function bubbleSort(array) {
    for (let ultimo = array.length - 1; ultimo > 0; ultimo--) {
        for (let i = 0; i < ultimo; i++) {
            if (array[i] > array[i + 1]) {
                let aux = array[i]
                array[i] = array[i + 1]
                array[i + 1] = aux
            }
        }
    }
    return array
}

const array = [10, 5, 3, 6, 2, 4, 9, 8, 7, 1]

console.log(array)
console.log(bubbleSort(array))