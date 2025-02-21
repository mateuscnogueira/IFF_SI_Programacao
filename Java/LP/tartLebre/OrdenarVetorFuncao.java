import java.util.Random;

public class OrdenarVetorFuncao {
	public static void main(String[] args) {
		int vetorNumerosAleatorios[] = new int[20];
		
		preencherVetor(vetorNumerosAleatorios);
		System.out.println("\n**** Números Gerados ****");
		imprimirVetor(vetorNumerosAleatorios);
		
		ordenarVetor(vetorNumerosAleatorios);
		
		System.out.println("\n**** Números Ordenados ****");
		imprimirVetor(vetorNumerosAleatorios);
	}
	
	static void preencherVetor(int vetorNumerosAleatorios[]) {
		int indiceVetor;
		Random entradaAleatoria = new Random();
		for (indiceVetor = 0; indiceVetor < 20; indiceVetor++) {
			vetorNumerosAleatorios[indiceVetor] = entradaAleatoria.nextInt(100);
		}
	}
	
	static void ordenarVetor(int vetorInteiros[]) {
		int indiceDeslocamento, indiceBusca, auxiliar;
		for (indiceDeslocamento = 0; indiceDeslocamento < 19; indiceDeslocamento++) {
			for (indiceBusca = indiceDeslocamento + 1; indiceBusca < 20; indiceBusca++) {
				if (vetorInteiros[indiceDeslocamento] > vetorInteiros[indiceBusca]) {
					auxiliar = vetorInteiros[indiceDeslocamento];
					vetorInteiros[indiceDeslocamento] = vetorInteiros[indiceBusca];
					vetorInteiros[indiceBusca] = auxiliar;
				}
			}
		}
	}
	
	static void imprimirVetor(int vetorInteiros[]) {
		int indiceVetor;
		for (indiceVetor = 0; indiceVetor < 20; indiceVetor++) {
			System.out.print(vetorInteiros[indiceVetor] + " ");
		}
	}
}
