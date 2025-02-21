package TADs.Lista.EstudoLista;

public class Lista implements Interface{

    Elemento inicial = null;
    int totalDeElementos = 0;

    @Override
    public void adicionarInicio(int dado) {
        Elemento novo = new Elemento(dado);

        novo.definirProximo(this.inicial);
        this.inicial = novo;
        totalDeElementos++;
    }

    @Override
    public void adicionarFinal(int dado) {
        Elemento novo = new Elemento(dado);
        Elemento atual = this.inicial;

        if(atual != null) {
            while(atual.obterProximo() != null) {
                atual = atual.obterProximo();
            }
            atual.definirProximo(novo);
        } else {
            this.inicial = novo;
        }
        totalDeElementos++;
    }

    @Override
    public void adicionarMeio(int dado, int posicaoDesejada) {
        Elemento novo = new Elemento(dado);
        Elemento atual = this.inicial;
        Elemento anterior = null;
        int posicaoAtual = 0;

        if(atual != null) {
            while(atual.obterProximo() != null && posicaoAtual != posicaoDesejada) {
                anterior = atual;
                atual = atual.obterProximo();
                posicaoAtual++;
            }

            if(posicaoAtual == posicaoDesejada) {
                if(anterior == null) {
                    novo.definirProximo(this.inicial);
                    inicial = novo;
                } else {
                    anterior.definirProximo(novo);
                    novo.definirProximo(atual);
                }
            }
            totalDeElementos++;
        }
    }

    @Override
    public void removerInicio() {

        if(this.inicial != null) {
            this.inicial = this.inicial.obterProximo();
            totalDeElementos--;
        } 
    
    }

    @Override
    public void removerFinal() {
        Elemento atual = this.inicial;
        Elemento anterior = null;

        if(this.inicial != null) {
            while(atual.obterProximo() != null) {
                anterior = atual;
                atual = atual.obterProximo();
            }
            if(anterior != null) {
                anterior.definirProximo(null);
            } else {
                this.inicial = null;
            }
            totalDeElementos--;
        }
    }

    @Override
    public void removerMeio(int posicaoExclusao) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removerMeio'");
    }

    @Override
    public int obterDado(int dadoBuscado) {
        Elemento atual = this.inicial;

        if(this.inicial != null) {
            while(atual.obterProximo() != null && atual.obterDado() != dadoBuscado) {
                atual = atual.obterProximo();
            }

            if(atual.obterDado() == dadoBuscado) {
                return atual.obterDado();
            }
        }
        return 0;   
    }
    
}
