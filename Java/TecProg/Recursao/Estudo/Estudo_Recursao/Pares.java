package Recursao.Estudo.Estudo_Recursao;

public class Pares {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8};
        int i, totalPares, somaPares;

        System.out.println("Vetor padrão:");
        for(i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\n\n");

        totalPares = contarPares(vetor, 0);
        System.out.println("Total de números pares: " + totalPares);

        somaPares = somarPares(vetor, 0);
        System.out.println("A soma dos números pares do vetor é: " + somaPares);
    }

    public static int contarPares(int vetor[], int indice) {
        int contar = 0;

        if(indice != vetor.length) {
            if(vetor[indice] %2 == 0) {
                contar++;
            }
            return contar + contarPares(vetor, indice + 1);
        }
        return 0; //significa que o vetor está vazio.
    }

    public static int somarPares(int vetor[], int indice) {
        int somar = 0;

        if(indice != vetor.length) {
            if(vetor[indice] %2 == 0) {
                somar = somar + vetor[indice];
            }
            return somar + somarPares(vetor, indice + 1);
        }
        return 0;
    }
}
