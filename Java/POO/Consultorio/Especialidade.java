package POO.Consultorio;

public class Especialidade {
    private String nome = new String();

    public Especialidade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
