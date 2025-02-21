package Recursao.Estudo.Estudo_Recursao;

public class InverterVetor {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int i;

        System.out.println("Vetor padrão:");
        for(i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\n\n");

        inverterVetor(vetor, 0, 8);

        System.out.println("Vetor após inversão:");
        for(i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\n\n");
    }

    // Método recursivo para inverter os elementos do vetor
    private static void inverterVetor(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            // Troca os elementos nos índices inicio e fim
            int auxiliar = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = auxiliar;
    
            // Chama recursivamente para o próximo par de índices
            inverterVetor(vetor, inicio + 1, fim - 1);
        }
    }
}
