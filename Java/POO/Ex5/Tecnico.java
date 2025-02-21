package POO.Ex5;

public class Tecnico extends Assistente {
    private double salario;

    public Tecnico(double salario, String matricula, String nome, String cargo) {
        super(matricula, nome, cargo);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double bonusSalarial() {
        return this.salario * 1.1;
    }

    public String exibirDados() {
        return super.exibirDados() + "\nSalario: " + this.salario;
    }
}
