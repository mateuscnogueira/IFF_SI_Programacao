package POO.Empresa;

public class Assistente extends Funcionario{
    protected String matricula = new String();

    public Assistente(String matricula, String nome, String cargo) {
        super(nome, cargo);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String exibirDados() {
        return "\n"+super.exibirDados() + " \nMatricula: " + this.matricula;
    }
}
