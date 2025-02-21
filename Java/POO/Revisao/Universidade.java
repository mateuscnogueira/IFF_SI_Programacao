package POO.Revisao;

public class Universidade {
    private String nome = new String();
    private Departamento dep;

    public Universidade(String nome, Departamento departamento) {
        this.nome = nome;
        this.dep = departamento;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void informarNome() {
        System.out.println(this.nome);
    }
}
