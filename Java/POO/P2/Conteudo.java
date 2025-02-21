package POO.P2;

abstract class Conteudo {
    protected String titulo;
    protected int duracao;
    protected int anoLancamento;
    private Filme filme;
    private Serie serie;

    public Conteudo(String titulo, int duracao, int anoLancamento) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Filme getFilme() {
        return filme;
    }
    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Serie getSerie() {
        return serie;
    }
    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public abstract void reproduzirConteudo();
}
