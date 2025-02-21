package POO.Ex1;

public class funcionario {
    String nome = new String();
    String departamento = new String();
    String dataEntrada = new String();
    String rg = new String();
    double salario;
    boolean estaNaEmpresa = true;
    double salarioAntigo;

    void bonifica(double aumento) {
        this.salarioAntigo = this.salario;
        this.salario = this.salario + aumento;
    }
    void demite() {
        this.estaNaEmpresa = false;
    }

    void mostra() {
        System.out.println(this.nome);
        System.out.println("O salário antes da bonificação era: " + this.salarioAntigo);
        System.out.println("Salário anual: " + this.salario);
        System.out.println("Está na empresa? " + this.estaNaEmpresa);
    }
}