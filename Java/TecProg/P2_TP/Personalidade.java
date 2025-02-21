package P2_TP;

public class Personalidade {
    private String nome = new String();
    private String descricao = new String();
    private String genero = new String();
    private String pais = new String();
    private String profissao = new String();
    private String causaDaMorte = new String();
    private int anoDeNascimento, anoDaMorte, idadeDaMorte; 

    public Personalidade(String nome, int anoDeNascimento, String descricao, String genero, String pais, String profissao, String causaDaMorte, int anoDaMorte, int idadeDaMorte) {
        this.nome = nome;
        this.anoDeNascimento = anoDeNascimento;
        this.descricao = descricao;
        this.genero = genero;
        this.pais = pais;
        this.profissao = profissao;
        this.causaDaMorte = causaDaMorte;
        this.anoDaMorte = anoDaMorte;
        this.idadeDaMorte = idadeDaMorte;
    }

    public String obterNome() {
        return nome;
    }
    public void definirNome(String nome) {
        this.nome = nome;
    }

    public int obterAnoDeNascimento() {
        return anoDeNascimento;
    }
    public void definirAnoDeNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getCausaDaMorte() {
        return causaDaMorte;
    }
    public void setCausaDaMorte(String causaDaMorte) {
        this.causaDaMorte = causaDaMorte;
    }

    public int getAnoDaMorte() {
        return anoDaMorte;
    }
    public void setAnoDaMorte(int anoDaMorte) {
        this.anoDaMorte = anoDaMorte;
    }

    public int getIdadeDaMorte() {
        return idadeDaMorte;
    }
    public void setIdadeDaMorte(int idadeDaMorte) {
        this.idadeDaMorte = idadeDaMorte;
    }
}


