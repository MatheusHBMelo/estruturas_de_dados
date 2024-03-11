package buscaBinaria;

public class BuscaBinaria {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(buscaBinaria(array, 8));
    }

    public static int buscaBinaria(int[] array, int valor){
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <=  fim) {
            int meio = (inicio + fim) / 2;

            if (array[meio] > valor){
                fim = meio - 1;
            } else if (array[meio] < valor){
                inicio = meio + 1;
            } else {
                return meio;
            }
        }
        return -1;
    }
}
