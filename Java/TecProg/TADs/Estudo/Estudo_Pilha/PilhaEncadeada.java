package TADs.Estudo.Estudo_Pilha;

public class PilhaEncadeada<T> implements InterfacePilha<T> {

    Elemento<T> inicial = null;
    int totalDeElementos = 0;

    @Override
    public void empilhar(T dado) {
        Elemento novo = new Elemento<T>(dado);
        novo.definirProximo(this.inicial);
        this.inicial = novo;
        totalDeElementos++;
    }

    @Override
    public void desempilhar() {
        if(this.inicial != null) {
            this.inicial = this.inicial.obterProximo();
            totalDeElementos--;
        } else {
            System.out.println("\nA pilha já está vazia");
        }
    }

    @Override
    public T obterTopo() {
        return this.inicial.obterDado();
    }

    @Override
    public boolean verificarVazio() {
        if(this.inicial == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String elementos = new String();
        Elemento atual = this.inicial;

        while(atual != null) {
            elementos = elementos + atual.obterDado() + "\n";
            atual = atual.obterProximo();
        }
        return "Pilha Encadeada: \n[\n" + elementos + "]";
    }
    
}
