package TADs.TADpilha;

public class PilhaVetor implements InterfacePilha {

    private int[] pilha;
    private int topo;
    private final int TAMANHO_MAXIMO = 20;

    public PilhaVetor() {
        pilha = new int[TAMANHO_MAXIMO];
        topo = -1;
    }

    @Override
    public void empilhar(int dado) {
        if (topo < TAMANHO_MAXIMO - 1) {
            topo++;
            pilha[topo] = dado;
            System.out.println("Empilhado: " + dado);
        } else {
            System.out.println("Erro: A pilha está cheia.");
        }
    }

    @Override
    public void desempilhar() {
        if (topo >= 0) {
            System.out.println("Desempilhado: " + pilha[topo]);
            topo--;
        } else {
            System.out.println("Erro: A pilha está vazia.");
        }
    }

    @Override
    public int obterTopo() {
        if (topo >= 0) {
            return pilha[topo];
        } else {
            System.out.println("Erro: A pilha está vazia.");
            return -1;
        }
    }

    @Override
    public boolean verificarVazia() {
        if (topo == -1) {
            System.out.println("A pilha está vazia.");
            return true;
        } else {
            System.out.println("A pilha não está vazia.");
            return false;
        }
    }

    @Override
    public String toString() {
        String elementos = "";
        for (int i = topo; i >= 0; i--) {
            elementos = elementos + pilha[i] + "\n";
        }
        return "PilhaSequencial [ " + elementos + "]";
    }

    @Override
    public int compararPilhas(PilhaEncadeada outraPilha) {
        return 0;
    }
}
