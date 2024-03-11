package buscaSequencial;

public class BuscaSequencial {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(buscaSequencial(array, 8));
    }

    public static int buscaSequencial(int[] array, int valor){
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] == valor){
                return i;
            }
        }
        return -1;
    }
}
