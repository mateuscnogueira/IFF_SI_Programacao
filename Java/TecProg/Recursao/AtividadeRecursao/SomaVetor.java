package Recursao.AtividadeRecursao;

public class SomaVetor {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        int resultado = somaVetor(vetor, vetor.length);
        System.out.println("A soma dos elementos do vetor é: " + resultado);
    }

    //função recursiva para somar os elementos do vetor
    static int somaVetor(int[] vetor, int tamanho) {
        if (tamanho <= 0) {
            return 0;
        }
        return vetor[tamanho - 1] + somaVetor(vetor, tamanho - 1);
    }
}