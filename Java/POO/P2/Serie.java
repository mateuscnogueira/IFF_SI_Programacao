package POO.P2;

class Serie extends Conteudo {
    private int idSerie;
    protected int numTemporadas;

    public Serie(int idSerie, int numTemporadas, String titulo, int duracao, int anoLancamento) {
        super(titulo, duracao, anoLancamento);
        this.idSerie = idSerie;
        this.numTemporadas = numTemporadas;
    }

    public int getIdSerie() {
        return idSerie;
    }
    public void setIdSerie(int idSerie) {
        this.idSerie = idSerie;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }
    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    @Override
    public void reproduzirConteudo() {
        // Implementação da reprodução de série
    }
}
