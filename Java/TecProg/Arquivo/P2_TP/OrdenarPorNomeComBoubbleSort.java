package Arquivo.P2_TP;

public class OrdenarPorNomeComBoubbleSort implements Ordenador {

    @Override
    public void ordenar(ColecaoDePersonalidades colecao) {
        boolean existiuTroca;
        int tamanho = colecao.totalDePersonalidades();

        do {
            existiuTroca = false;
            for (int j = 0; j < tamanho - 1; j++) {
                if (colecao.obterPersonalidade(j).obterNome().compareTo(colecao.obterPersonalidade(j + 1).obterNome()) > 0) {
                    colecao.trocarPosicaoEntrePersonalidades(j, j + 1);
                    existiuTroca = true;
                }
                //verificando se o nome1 é >,< ou = ao nome2.
                //compareTo() retorna valor positivo se o primeiro for maior que o segundo, ai é realizado a troca.
            }
        } while (existiuTroca);
    }
}
