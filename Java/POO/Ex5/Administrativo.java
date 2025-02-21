package POO.Ex5;

public class Administrativo extends Assistente {
    private double salario;
    private String turno = new String();
    
    public Administrativo(double salario, String turno, String matricula, String  nome, String cargo) {
        super(matricula, nome, cargo);
        this.salario = salario;
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double adicionalNoturno() {
        if (this.turno.equals("Noite")) {
            return this.salario * 1.5;
        }
        return this.salario;
    }

    public String exibirDados() {
        return super.exibirDados() + "\nTurno: " + this.turno + "\nSalario: " + this.adicionalNoturno();
    }
}
