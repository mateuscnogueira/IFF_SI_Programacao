package TADs.Estudo.Estudo_Lista;

public class TesteLista {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //limpar o terminal antes de rodar o cod

        InterfaceLista listaEncadeada = new ListaEncadeada<Integer>();

        System.out.println("\n\n\n--------Adicionar--------");

        System.out.println("\nAdicionando no início:");
        listaEncadeada.adicionarInicio(10);
        listaEncadeada.adicionarInicio(20);
        listaEncadeada.adicionarInicio(30);
        System.out.println(listaEncadeada);


        System.out.println("\n\nAdicionando no final:");
        listaEncadeada.adicionarFim(5);
        listaEncadeada.adicionarFim(1);
        System.out.println(listaEncadeada);


        System.out.println("\n\nAdicionando na posição desejada:");
        listaEncadeada.adicionarMeio(0, 40);
        listaEncadeada.adicionarMeio(1, 35);
        listaEncadeada.adicionarMeio(4, 15);
        System.out.println(listaEncadeada);

        System.out.println("\n\n\n--------Exclusões--------");

        System.out.println("\nExcluindo da posição desejada:");
        listaEncadeada.excluirMeio(0);
        listaEncadeada.excluirMeio(4);
        System.out.println(listaEncadeada);

        System.out.println("\n\nExcluindo do início e do fim:");
        listaEncadeada.excluirInicio();
        listaEncadeada.excluirFim();
        System.out.println(listaEncadeada);

        System.out.println("\n\n\n--------Total de elementos e busca do elemento na posição desejada--------");
        System.out.println("\nO total de elementos da lista no momento é: " + listaEncadeada.obterTotalDeElementos());
        listaEncadeada.obterDado(1);

        System.out.println("\n\n\n--------Incluindo em Ordem Crescente--------");
        incluirElemento_Em_Ordem_Decrescente((ListaEncadeada) listaEncadeada, 13);
        System.out.println(listaEncadeada);


        System.out.println("\n\n\n--------Excluindo Elemento com Determinado Dado--------");
        excluirElemento_Com_Determinado_Dado((ListaEncadeada) listaEncadeada, 20);
        System.out.println(listaEncadeada);


    }

    public static void incluirElemento_Em_Ordem_Decrescente(ListaEncadeada lista, int dadoInserido) {
        Elemento novo = new Elemento(dadoInserido);
        Elemento atual = lista.inicial;

        if(lista.inicial == null || (Integer) lista.inicial.obterDado() < dadoInserido) {
            novo.definirProximo(lista.inicial);
            lista.inicial = novo;
        } else {
            while((atual.obterProximo() != null) && ((Integer) atual.obterProximo().obterDado() > dadoInserido)) {
                atual = atual.obterProximo();
            }
            novo.definirProximo(atual.obterProximo());
            atual.definirProximo(novo);
        }
    }

    public static void excluirElemento_Com_Determinado_Dado(ListaEncadeada lista, int dadoProcurado) {
        Elemento atual = lista.inicial;
        Elemento anterior = null;

        if(lista.inicial == null) {
            System.out.println("A lista está vazia");
        }

        if(lista.inicial.obterDado().equals(dadoProcurado)) {
            lista.inicial = lista.inicial.obterProximo();
        }

        while((atual != null) && (!atual.obterDado().equals(dadoProcurado))) {
            anterior = atual;
            atual = atual.obterProximo();
        }

        if((atual != null) && (atual.obterDado().equals(dadoProcurado))) {
            if(anterior == null) {
                lista.inicial = atual.obterProximo();
            } else {
                anterior.definirProximo(atual.obterProximo());
            }
        } else {
            System.out.println("\nDado " + dadoProcurado + " não encontrado");
        }
    }
}
