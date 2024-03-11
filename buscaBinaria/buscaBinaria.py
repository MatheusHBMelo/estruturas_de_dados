def busca_binaria(array, valor):
    inicio = 0
    fim = len(array) - 1

    while fim >= inicio:
        meio = (fim + inicio) // 2

        if (array[meio] > valor):
            fim = meio - 1
        else: 
            if (array[meio] < valor):
                inicio = meio + 1
            else:
                return meio
    return -1

array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
print(busca_binaria(array, 8))                