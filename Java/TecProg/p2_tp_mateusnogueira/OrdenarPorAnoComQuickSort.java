package p2_tp_mateusnogueira;

public class OrdenarPorAnoComQuickSort implements Ordenador {

    @Override
    public void ordenar(ColecaoDePersonalidades colecao) {
        quickSort(colecao, 0, colecao.totalDePersonalidades() - 1);
    }

    private void quickSort(ColecaoDePersonalidades colecao, int inicio, int fim) {
        if (inicio < fim) {
            int indicePivo = particionar(colecao, inicio, fim); //divide o vetor no meio para achar o pivo

            quickSort(colecao, inicio, indicePivo - 1);
            quickSort(colecao, indicePivo + 1, fim);
            //quickSort duas vezes para tratar as duas metades (inicio e fim)
        }
    }

    //os elementos menores ou iguais ao pivô ficam a esquerda e os maiores fiquem a direita.
    private int particionar(ColecaoDePersonalidades colecao, int inicio, int fim) {
        Personalidade pivo = colecao.obterPersonalidade(fim);
        int i = (inicio - 1);

        for (int j = inicio; j < fim; j++) {
            if (colecao.obterPersonalidade(j).obterAnoDeNascimento() < pivo.obterAnoDeNascimento()) {
                i++;
                colecao.trocarPosicaoEntrePersonalidades(i, j);
            }
        }

        colecao.trocarPosicaoEntrePersonalidades(i + 1, fim);
        return i + 1;
    }
}
