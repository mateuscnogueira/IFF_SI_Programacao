//Mateus Nogueira - Enviei o arquivo zip com os códigos, para uma melhor visualização.

package ProjetoOO.SOLID;

public class S {
    /*
    Princípio da Responsabilidade Única
        "Nunca deve haver mais de uma razão para alterar uma classe. Em outras palavras, toda classe deve ter somente uma responsabilidade".

        Isso significa que cada classe deve ter uma responsabilidade ou função única. Isso faz com que o código seja mais fácil de manter.
        Sendo assim, em vez da classe Funcionario possuir os métodos de calcular salario e gerar relatorio, eles foram realocados para classes distintas. Logo, a classe Funcionario será responsável somente pela criação do funcionário.
        Assim, cada classe vai ter sua própria função/responsabilidade.
    */
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Mateus", "Adm", 20000);

        CalculadorSalario calculadorSalario = new CalculadorSalario();
        calculadorSalario.calcularSalario(func);

        GeradorRelatorio geradorRelatorio = new GeradorRelatorio();
        geradorRelatorio.gerarRelatorio(func);
    }
    
    public static class Funcionario {
        private String nome = new String();
        private String titulo = new String();
        private double salario;

        public Funcionario(String nome, String titulo, double salario) {
            this.nome = nome;
            this.titulo = titulo;
            this.salario = salario;
        }

        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getTitulo() {
            return titulo;
        }
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public double getSalario() {
            return salario;
        }
        public void setSalario(double salario) {
            this.salario = salario;
        }
    }

    public static class CalculadorSalario {
        public double calcularSalario(Funcionario funcionario) {
            //função para calcular o salário do funcionário
            //exemplo
            funcionario.salario = funcionario.salario * 2;
            return funcionario.getSalario();
        }
    }

    public static class GeradorRelatorio {
        public void gerarRelatorio(Funcionario funcionario) {
            //função para gerar um relatório do funcionário
            //exemplo
            System.out.println("Nome: " + funcionario.getNome() + "\nTítulo: " + funcionario.getTitulo() + "\nSalário: " + funcionario.getSalario());
        }
    }
}
