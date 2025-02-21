package Recursao.AtividadeRecursao;

public class MaiorElementoVetor {
    public static void main(String[] args) {
        int[] vetor = {3, 5, 7, 2, 8, 1};
        int resultado = maiorElemento(vetor, vetor.length);
        System.out.println("O maior elemento do vetor é: " + resultado);
    }

    //função recursiva para encontrar o maior elemento do vetor
    static int maiorElemento(int[] vetor, int tamanho) {
        if (tamanho == 1) { //qndo resta apenas um elemento, retorna apenas o primeiro
            return vetor[0];
        }
        
        //chamada recursiva para o subvetor
        int maior = maiorElemento(vetor, tamanho - 1);
        
        //compara o último elemento com o maior encontrado até agr
        if (vetor[tamanho - 1] > maior) {
            return vetor[tamanho - 1];
        } else {
            return maior;
        }
    }
}

