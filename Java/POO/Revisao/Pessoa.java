package POO.Revisao;
import java.util.Scanner;

public class Pessoa {
    private String nome = new String();
    private int idade, dia, mes, ano;
    private Universidade uni;
    private Departamento dep;

    public Pessoa(String nome, Universidade universidade, Departamento departamento) {
        this.nome = nome;
        this.idade = 0;
        this.uni = universidade;
        this.dep = departamento;
    }

    public void ajustaDataDeNascimento(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public Universidade getUni() {
        return uni;
    }public void setUni(Universidade uni) {
        this.uni = uni;
    }

    public void calcularIdade() {
        // Scanner leitor = new Scanner(System.in);
        int diaA = 17, mesA = 12, anoA = 2023;

        // System.out.println("Entre com o dia de hoje: ");
        // diaA = leitor.nextInt();
        // System.out.println("Entre com o mes atual: ");
        // mesA = leitor.nextInt();
        // System.out.println("Entre com o ano atual: ");
        // anoA = leitor.nextInt();

        this.idade = anoA - this.ano;

        if(mesA < this.mes || mesA == this.mes && diaA < this.dia) {
            this.idade--;
        }
    }

    public void informarIdade() {
        System.out.println("Idade: " + this.idade);
    }

    public void informarNome() {
        System.out.println("\nNome: " + this.nome);
    }

    public void informarUniversidade() {
        System.out.println("Universidade: " + this.uni.getNome() + " - " + this.dep.getNome() );
    }

}