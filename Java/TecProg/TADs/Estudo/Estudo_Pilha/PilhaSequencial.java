package TADs.Estudo.Estudo_Pilha;

public class PilhaSequencial<T> implements InterfacePilha<T> {

    private final int tamanhoMaximo = 20;
    private int vetor[] = new int[tamanhoMaximo];
    int totalDeElementos = 0;

    @Override
    public void empilhar(T dado) {
        if(totalDeElementos < tamanhoMaximo) {
            vetor[totalDeElementos] = (int) dado;  // Insere no topo da pilha
            totalDeElementos++;
            System.out.println("\nDado adicionado: " + dado);
        } else {
            System.out.println("\nA pilha já está cheia, tamanho máximo = 20");
        }
    }

    @Override
    public void desempilhar() {
        if(totalDeElementos > 0) {
            totalDeElementos--;
            System.out.println("\nDado removido: " + vetor[totalDeElementos]);
            vetor[totalDeElementos] = 0;
        }
    }

    @Override
    public T obterTopo() {
        return (T) (Integer) vetor[totalDeElementos - 1];
    }

    @Override
    public boolean verificarVazio() {
        if(totalDeElementos == 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String elementos = new String();

        for(int i = totalDeElementos - 1; i >= 0; i--) {
            elementos = elementos + vetor[i] + "\n";
        }
        return "\nPilha Sequencial: \n[\n" + elementos + "]";
    }
    
}
