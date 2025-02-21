package POO.Empresa;

public class Funcionario {
    protected String nome = new String();
    protected String cargo = new String();

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String exibirDados() {
        return "\nNome: " + this.nome + "\nCargo: " + this.cargo;
    }

}
