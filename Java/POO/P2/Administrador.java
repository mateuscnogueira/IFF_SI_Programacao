package POO.P2;

import java.util.Scanner;

public class Administrador extends Usuario{
    private int idAdm;
    private double salario;
    private Conteudo conteudo;
    
    public Administrador(int idAdm, double salario, String nome, String cpf, String email, String telefone) {
        super(nome, cpf, email, telefone);
        this.idAdm = idAdm;
        this.salario = salario;
    }

    public int getIdAdm() {
        return idAdm;
    }
    public void setIdAdm(int idAdm) {
        this.idAdm = idAdm;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Conteudo getConteudo() {
        return conteudo;
    }
    public void setConteudo(Conteudo conteudo) {
        this.conteudo = conteudo;
    }

    public void realizarCadastroConteudo(Conteudo conteudo) {
        Scanner leitor = new Scanner(System.in);
        int num;

        System.out.println("Cadastro de Contúdo\n");
        System.out.println("1 - Filme");
        System.out.println("2 - Série");
        System.out.print("Insira o número do conteúdo que deseja cadastrar: ");
        num = leitor.nextInt();

        System.out.print("Insira o título do conteúdo: ");
        getConteudo().titulo = leitor.nextLine();
        leitor.nextLine(); //limpar buffer
        System.out.print("Insira a duração do título: ");
        getConteudo().duracao = leitor.nextInt();
        System.out.print("Insira o ano de lançamento do conteúdo: ");
        getConteudo().anoLancamento = leitor.nextInt();

        if(num == 1) {
            System.out.print("Insira o nome do Diretor do filme: ");
            getConteudo().getFilme().diretor = leitor.nextLine();
        } else {
            System.out.print("Insira o número de temporadas que a série tem: ");
            getConteudo().getSerie().numTemporadas = leitor.nextInt();
        }
    }
}
