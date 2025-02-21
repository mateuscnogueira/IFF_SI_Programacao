package POO.Ex5;

public class Gerente {
    private String nome = new String();

    public Gerente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String exibirDados() {
        return "\nNome: " + this.nome;
    }
}
