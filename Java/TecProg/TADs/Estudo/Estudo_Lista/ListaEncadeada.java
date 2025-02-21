package TADs.Estudo.Estudo_Lista;

public class ListaEncadeada <T> implements InterfaceLista <T> {

    Elemento <T> inicial = null;
    int totalDeElementos = 0;

    @Override
    public void adicionarInicio(T dado) {
        Elemento novo = new Elemento<T>(dado);
        novo.definirProximo(this.inicial);
        this.inicial = novo;
        this.totalDeElementos++;

        System.out.println("\nO elemento " + dado + " foi adicionado.");
    }

    @Override
    public void adicionarFim(T dado) {
        Elemento novo = new Elemento<T>(dado);
        Elemento atual = this.inicial;
        
        if(this.inicial != null) {
            while(atual.obterProximo() != null) {
                atual = atual.obterProximo();
            }
            atual.definirProximo(novo);
        } else {
            this.inicial = novo;
        }
        this.totalDeElementos++;

        System.out.println("\nO elemento " + dado + " foi adicionado.");
    }

    @Override
    public void adicionarMeio(int posicaoInclusao, T dado) {
        Elemento novo = new Elemento<T>(dado);
        Elemento atual = this.inicial;
        Elemento anterior = null;
        int posicaoAtual = 0;

        while((atual != null) && (posicaoAtual != posicaoInclusao)) {
            anterior = atual;
            atual = atual.obterProximo();
            posicaoAtual++;
        }

        if(posicaoAtual == posicaoInclusao) {
            if(anterior == null) {
                novo.definirProximo(this.inicial);
                this.inicial = novo;
                /* isso quer dizer que não havia nenhum elemento na lista, por isso o novo elemento se tornou o primeiro da lista. */
            } else {
                anterior.definirProximo(novo);
                novo.definirProximo(atual);
                /* isso quer dizer ue agora o anterior aponta para o Novo elemento, e o Novo aponta para o atual.
                Sendo assim, o novo elemento foi adicionado no meio da lista, na posição desejada. */
            }
            this.totalDeElementos++;

            System.out.println("\nO elemento " + dado + " foi adicionado na posição " + posicaoInclusao + " da lista.");
        }
    }

    @Override
    public boolean excluirInicio() {
        if(this.inicial != null) {
            this.inicial = this.inicial.obterProximo();
            this.totalDeElementos--;
        }
        return true;
    }

    @Override
    public boolean excluirFim() {
        Elemento atual = this.inicial;
        Elemento anterior = null;

        if(this.inicial != null) {
            while(atual.obterProximo() != null) {
                anterior = atual;
                atual = atual.obterProximo();
            }

            if(anterior != null) {
                anterior.definirProximo(null); 
                /* agora o anterior está apontando para null, pois deixou de apontar para o atual que erá o ultimo elemento da lista. */
            } else {
                this.inicial = null;
                /* só havia um elemento na lista, por isso agora o inicial é null. */
            }

            this.totalDeElementos--;
            return true;
       }
       return false;
    }

    @Override
    public boolean excluirMeio(int posicaoExclusao) {
        Elemento atual = this.inicial;
        Elemento anterior = null;
        int posicaoAtual = 0;

        if(this.inicial != null) {
            while((atual.obterProximo() != null) && posicaoAtual != posicaoExclusao) {
                anterior = atual;
                atual = atual.obterProximo();
                posicaoAtual++;
            }

            if(posicaoAtual == posicaoExclusao) {
                if(anterior == null) {
                    this.inicial = atual.obterProximo();
                    /* se o anterior for null é pq o atual = this.inicial,
                    ou seja, o this.inicial deixa de apontar pro atual e passa a apontar para atual.obterProximo, que no caso é null.
                    Isso quer dizer que foi retirado o único elemento que havia na lista. */
                } else {
                    anterior.definirProximo(atual.obterProximo());
                    /* o anterior irá deixar de apontar para atual e passará a apontar para atual.obterProximo,
                    ou seja, irá apontar para o elemento depois do atual, fazendo com que o elemento atual seja retirado da lista.
                    CORTOU NO MEIO */
                }
                this.totalDeElementos--;
                return true;
            }
        }
        return false;
    }

    @Override
    public void obterDado(int posicaoBuscada) {
       int posicaoAtual = 0;
       Elemento atual = this.inicial;

        while((atual != null) && (posicaoAtual != posicaoBuscada)) {
            atual = atual.obterProximo();
            posicaoAtual++;
        }

        if(posicaoAtual == posicaoBuscada) {
            System.out.println("\nO dado da posição " + posicaoBuscada + " é: " + atual.obterDado());
        } else {
            System.out.println("\nA posição " + posicaoBuscada + " não foi encontrad na lista.");
        }
    }

    @Override
    public int obterTotalDeElementos() {
        return this.totalDeElementos;
    }
    
    @Override
    public String toString() {
        String elementos = new String();
        Elemento atual = this.inicial;

        while(atual != null) {
            elementos = elementos + atual.obterDado() + " ";
            atual = atual.obterProximo();
        }
        return "\nLista Encadeada [ " + elementos + "]";
    }
}
