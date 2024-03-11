def busca_sequencial(array, valor):
    for i in range(len(array)):
        if array[i] == valor:
            return i
    return -1

array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
print(busca_sequencial(array, 8))    