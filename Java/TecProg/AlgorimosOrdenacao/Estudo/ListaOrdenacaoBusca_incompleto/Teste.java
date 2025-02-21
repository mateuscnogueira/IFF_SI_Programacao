package AlgorimosOrdenacao.Estudo.ListaOrdenacaoBusca_incompleto;

public class Teste {
    public static void main(String[] args) {
        int encontrou = -1;
        
        Lista lista = new Lista();

        lista.adicionarNoInicio(77);
        lista.adicionarNoInicio(59);
        lista.adicionarNoInicio(42);
        lista.adicionarNoFinal(89);
        lista.adicionarNoFinal(94);
        System.out.println(lista);

        lista.removerDoFinal();
        System.out.println(lista);

        if(encontrou != lista.buscarDado(77)) {
            System.out.println("\nO dado foi encontrado. Dado: " + lista.buscarDado(77));
        } else {
            System.out.println("\nO dado não foi encontrado na lista");
        }

        ordenacaoPorInsercao(lista);
        System.out.println(lista);
        
        System.out.println(buscaBinaria(20, lista));

        if(encontrou != buscaBinaria(20, lista)) {
            System.out.println("\nO dado foi encontrado. Dado: " + buscaBinaria(20, lista));
        } else {
            System.out.println("\nO dado não foi encontrado na lista");
        }
    }

    public static void ordenacaoPorInsercao(Lista lista) {
        int tamanho = lista.totalDeElementos;
        int novaPosicao, numeroPTroca;

        for(int posicaoAvaliada = 1; posicaoAvaliada < tamanho; posicaoAvaliada++) {
            numeroPTroca = lista.buscarDado(posicaoAvaliada);
            novaPosicao = obterNovaPosicao(lista, posicaoAvaliada, numeroPTroca);
            novaPosicao = numeroPTroca;
        }
    }

    private static int obterNovaPosicao(Lista lista, int potencialNovaPosicao, int numeroParaSerTrocado) {
        potencialNovaPosicao = lista.buscarDado(potencialNovaPosicao);


		while ((potencialNovaPosicao > 0) && ((potencialNovaPosicao - 1) > numeroParaSerTrocado)) {
			potencialNovaPosicao = potencialNovaPosicao - 1;
			potencialNovaPosicao--;
		}
		return potencialNovaPosicao;
	}

    
    public static int buscaBinaria(int chaveDeBusca, Lista lista) {
        int inicio  = 0;
        int fim = lista.totalDeElementos - 1;
        int meio;
        
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            int valorMeio = obterElementoPorIndice(lista, meio);
            
            if (chaveDeBusca == valorMeio) {
                return meio;
            }
            if (chaveDeBusca < valorMeio) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1;
    }

    public static int obterElementoPorIndice(Lista lista, int indice) {
        Elemento atual = lista.inicial;
        int contador = 0;
    
        while (atual != null) {
            if (contador == indice) {
                return atual.obterDado();
            }
            atual = atual.obterProximo();
            contador++;
        }
        return -1;
    }
}
