package TADs.TADpilha;

public class PilhaEncadeada implements InterfacePilha {

    Elemento inicial = null;
    int totalDeElementos = 0;

    @Override
    public void empilhar(int dado) {
       Elemento novo = new Elemento(dado);
       novo.definirProximo(this.inicial);
       this.inicial = novo;
       this.totalDeElementos++;
    }

    @Override
    public void desempilhar() {
        if(this.inicial != null) {
            this.inicial = this.inicial.obterProximo();
            this.totalDeElementos--;
        }
    }

    @Override
    public int obterTopo() {

        Elemento topo = this.inicial;

        return topo.obterDado();
    }

    @Override
    public boolean verificarVazia() {
        if(this.inicial == null) {
            System.out.println("A pilha está vazia");
            return true;
        } else {
            System.out.println("A pilha não está vazia");
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
        return "PilhaEncadeada [ " + elementos + "]";
    }

    @Override
    public int compararPilhas(PilhaEncadeada outraPilha) {
        Elemento atual1 = this.inicial;
        Elemento atual2 = outraPilha.inicial;

        while(atual1 != null && atual2 != null) {
            if(atual1.obterDado() != atual2.obterDado()) {
                return 0;
            }
            atual1 = atual1.obterProximo();
            atual2 = atual2.obterProximo();
        }

        if(atual1 != null || atual2 != null) {
            return 0;
        }

        return 1;
    }
}