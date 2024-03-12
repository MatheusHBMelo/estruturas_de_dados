def bubbleSort(array):
    n = len(array)

    for ultimo in range(n - 1, 0, -1):
        for i in range(0, ultimo, +1):
            if array[i] > array[i + 1]:
                aux = array[i]
                array[i] = array[i + 1]
                array[i + 1] = aux
    return array

array = [10, 5, 3, 6, 2, 4, 9, 8, 7, 1]

print(array)
print(bubbleSort(array))