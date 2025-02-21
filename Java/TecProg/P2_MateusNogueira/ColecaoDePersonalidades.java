package P2_MateusNogueira;

public interface ColecaoDePersonalidades {
    
    public void adicionarPersonalidade(Personalidade personalidade);

    public void excluirPersonalidade(String nomeDaPersonalidade);

    public Personalidade obterPersonalidade(int posicaoDaPersonalidade);

    public int totalDePersonalidades();

    public void trocarPosicaoEntrePersonalidades(int posicaoDaPersonalidade1, int posicaoDaPersonalidade2);

    public void alterarPersonalidade(int posicaoDaPersonalidade, Personalidade novaPersonalidade);

    //public void obterPersonalidade(Ordenador);
}
