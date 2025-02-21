package POO.P2;

public class Filme extends Conteudo {
    private int idFilme;
    protected String diretor;

    public Filme(int idFilme, String diretor, String titulo, int duracao, int anoLancamento) {
        super(titulo, duracao, anoLancamento);
        this.idFilme = idFilme;
        this.diretor = diretor;
    }

    public int getIdFilme() {
        return idFilme;
    }
    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public void reproduzirConteudo() {
        // Implementação da reprodução de filme
    }
}
