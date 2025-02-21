package POO.aula3.quest2;

public class empregado {
    private String nome, sobrenome;
    private double salario, novoSalario;

    public String getNome() {
        return this.nome;
    }
    public void setNome(String n) {
        this.nome = n;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }
    public void setSobrenome(String sm) {
        this.sobrenome = sm;
    }

    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double s) {
        this.salario = s;
    }

    public double getNovoSalario() {
        return (salario*1.1)*12;
    }
//    public void setNovoSalario(double ns) {
//        this.novoSalario = ns;
//    }

    public empregado(String n, String sm, double s) {
        this.nome = n;
        this.sobrenome = sm;
        this.salario = s;
    }
}
