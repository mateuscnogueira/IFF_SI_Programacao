package Recursao.Estudo.Estudo_Recursao;

public class SomaElementosVetor {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        int i, soma;

        System.out.println("Vetor padrão:");
        for(i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\n\n");

        soma = somarElementosVetor(vetor, 0);
        System.out.println("A soma dos elementos do vetor é: " + soma);

    }

    public static int somarElementosVetor(int vetor[], int indice) {
        if(indice != vetor.length) {
            return vetor[indice] + somarElementosVetor(vetor, indice + 1);
        }
        return 0;
    }
}