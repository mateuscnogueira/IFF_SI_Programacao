package EstruturaDeDados;

public class Ordenacao_MergeSort {
    public static void main(String[] args) {
        int[] vetor = { 38, 27, 43, 3, 9, 82, 10 };

        System.out.println("Vetor original:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        mergeSort(vetor, 0, vetor.length - 1);

        System.out.println("\nVetor ordenado com MergeSort:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static void mergeSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;

            // Divide em duas partes
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);

            // Combina as partes
            merge(vetor, inicio, meio, fim);
        }
    }

    private static void merge(int[] vetor, int inicio, int meio, int fim) {
        int[] temp = new int[fim - inicio + 1];

        int i = inicio;      // ponteiro da primeira metade
        int j = meio + 1;    // ponteiro da segunda metade
        int k = 0;           // ponteiro do vetor temporário

        while (i <= meio && j <= fim) {
            if (vetor[i] <= vetor[j]) {
                temp[k++] = vetor[i++];
            } else {
                temp[k++] = vetor[j++];
            }
        }

        // Copia os elementos restantes, se houver
        while (i <= meio) {
            temp[k++] = vetor[i++];
        }

        while (j <= fim) {
            temp[k++] = vetor[j++];
        }

        // Copia os elementos de volta para o vetor original
        for (k = 0; k < temp.length; k++) {
            vetor[inicio + k] = temp[k];
        }
    }
}
