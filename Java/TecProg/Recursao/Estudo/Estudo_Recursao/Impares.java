package Recursao.Estudo.Estudo_Recursao;

public class Impares {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8};
        int i, totalImpares, somaImpares;

        System.out.println("Vetor padrão:");
        for(i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\n\n");

        totalImpares = contarImpares(vetor, 0);
        System.out.println(totalImpares);

        somaImpares = somarImpares(vetor, 0);
        System.out.println(somaImpares);
    }

    public static int contarImpares(int vetor[], int indice) {
        int conta = 0;

        if(indice != vetor.length) {
            if(vetor[indice] %2 != 0) {
                conta++;
            }
            return conta + contarImpares(vetor, indice + 1);
        }
        return 0;
    }

    public static int somarImpares(int vetor[], int indice) {
        int soma = 0;

        if(indice != vetor.length) {
            if(vetor[indice] %2 != 0) {
                soma = soma + vetor[indice];
            }
            return soma + somarImpares(vetor, indice + 1);
        }
        return 0;
    }
}
