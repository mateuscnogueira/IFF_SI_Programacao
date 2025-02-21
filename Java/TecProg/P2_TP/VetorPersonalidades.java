package P2_TP;

public class VetorPersonalidades implements ColecaoDePersonalidades {

    private int totalDePersonalidades;
    private Personalidade vetorDePersonalidades[];

    public VetorPersonalidades(int tamanhoDoVetor) {
        this.vetorDePersonalidades = new Personalidade[tamanhoDoVetor];
        this.totalDePersonalidades = 0;
    }

    @Override
    public void adicionarPersonalidade(Personalidade nomeDaPersonalidade) {
        if(totalDePersonalidades < vetorDePersonalidades.length) {
            vetorDePersonalidades[totalDePersonalidades] = nomeDaPersonalidade;
            totalDePersonalidades++;
        } else {
            System.out.println("Não foi possivel adicionar a personalidade, pois o vetor alcançou o tamanho maximo");
        }
    }

    @Override
    public void excluirPersonalidade(String nomeDaPersonalidade) {
        boolean encontrou = false;

        for(int i = 0; i < totalDePersonalidades; i++) {
            if(vetorDePersonalidades[i].obterNome().equals(nomeDaPersonalidade) && !encontrou) {
                encontrou = true;
            }
            if(i < totalDePersonalidades - 1 && encontrou) {
                vetorDePersonalidades[i] = vetorDePersonalidades[i + 1];
                //desloca todas as personalidades após a removida para a esquerda.
            }
        }
        if(encontrou) {
            vetorDePersonalidades[totalDePersonalidades - 1] = null;
            //remove a última posição que estava duplicada.
            totalDePersonalidades--;
        }
    }

    @Override
    public Personalidade obterPersonalidade(int posicaoDaPersonalidade) {
        if(posicaoDaPersonalidade >= 0 && posicaoDaPersonalidade < totalDePersonalidades) {
            return vetorDePersonalidades[posicaoDaPersonalidade];
        }
        return null;
    }

    @Override
    public int totalDePersonalidades() {
        return totalDePersonalidades;
    }

    @Override
    public void trocarPosicaoEntrePersonalidades(int posicaoDaPersonalidade1, int posicaoDaPersonalidade2) {
        if(posicaoDaPersonalidade1 >= 0 && posicaoDaPersonalidade2 >= 0 && posicaoDaPersonalidade1 < totalDePersonalidades && posicaoDaPersonalidade2 < totalDePersonalidades) {
            Personalidade aux = vetorDePersonalidades[posicaoDaPersonalidade1];
            vetorDePersonalidades[posicaoDaPersonalidade1] = vetorDePersonalidades[posicaoDaPersonalidade2];
            vetorDePersonalidades[posicaoDaPersonalidade2] = aux;
        }
    }

    @Override
    public void alterarPersonalidade(int posicaoDaPersonalidade, Personalidade novaPersonalidade) {
        if(posicaoDaPersonalidade >= 0 && posicaoDaPersonalidade < totalDePersonalidades) {
            vetorDePersonalidades[posicaoDaPersonalidade] = novaPersonalidade;
        }
    }

    @Override
    public void ordenarPersonalidade(Ordenador ordenador) {
        ordenador.ordenar(this);
    } 
    
}
