package Estruturas_de_Dados.bubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {10, 5, 3, 6, 2, 4, 9, 8, 7, 1};
        System.out.println("Array original: " + Arrays.toString(array));
        System.out.println("Array ordenado: " + Arrays.toString(bubbleSort(array)));
    }

    public static int[] bubbleSort(int[] array){
        for (int ultimo = array.length - 1; ultimo > 0; ultimo--) {
            for (int i = 0; i < ultimo; i++) {
                if (array[i] > array[i + 1]) {
                    int aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                }
            }
        }
        return array;
    }
}