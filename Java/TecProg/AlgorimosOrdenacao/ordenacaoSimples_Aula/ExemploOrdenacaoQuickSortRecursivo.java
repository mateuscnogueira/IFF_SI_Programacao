package AlgorimosOrdenacao.ordenacaoSimples_Aula;

import java.util.Random;
import java.util.Scanner;

public class ExemploOrdenacaoQuickSortRecursivo {

    public static void main(String[] args) {
        
        final int tamanhoVetor;
        Random geradorNumeroAleatorio = new Random();
        Scanner entradaDoTeclado = new Scanner(System.in);
        System.out.println("Entre com o tamanho do vetor:");
        tamanhoVetor = entradaDoTeclado.nextInt();
        
        int vetorNumeros[] = new int[tamanhoVetor];
        
        geradorNumeroAleatorio.setSeed(11);
        for (int indice = 0; indice < tamanhoVetor; indice++) {
            vetorNumeros[indice] = geradorNumeroAleatorio.nextInt(100);
        }
        
        for (int indice = 0; indice < tamanhoVetor; indice++) {
            System.out.print(vetorNumeros[indice] + " ");
        }
        
        System.out.println("\n");
        quickSort(vetorNumeros, 0, tamanhoVetor - 1);
        
        for (int indice = 0; indice < tamanhoVetor; indice++) {
            System.out.print(vetorNumeros[indice] + " ");
        }
    }
    
    private static void quickSort(int[] vetorNumeros, int inicio, int fim) {
        int posicaoPivo;
        
        if (inicio < fim) {
            posicaoPivo = particionarVetor(vetorNumeros, inicio, fim);
            quickSort(vetorNumeros, inicio, posicaoPivo - 1);
            quickSort(vetorNumeros, posicaoPivo + 1, fim);
        }   
    }

    private static int particionarVetor(int[] vetorNumeros, int inicio, int fim) {
        int esquerda, direita, pivo;
        esquerda = inicio;
        direita = fim;
        pivo = vetorNumeros[inicio];
        while (esquerda < direita) {
            while (vetorNumeros[esquerda] <= pivo && esquerda < fim) {
                esquerda++;
            }
            while (vetorNumeros[direita] > pivo && direita > inicio) {
                direita--;
            }
            if (esquerda < direita) {
                trocarValores(vetorNumeros, esquerda, direita);
            }
        }
        vetorNumeros[inicio] = vetorNumeros[direita];
        vetorNumeros[direita] = pivo;
        return direita;
    }
    
    private static void trocarValores(int[] vetorNumeros, int posicaoDaEsquerda, int posicaoDaDireita) {
        int armazenamentoAuxiliar;
        armazenamentoAuxiliar = vetorNumeros[posicaoDaEsquerda];
        vetorNumeros[posicaoDaEsquerda] = vetorNumeros[posicaoDaDireita];
        vetorNumeros[posicaoDaDireita] = armazenamentoAuxiliar;
    }
}    
