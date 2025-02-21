package POO.P2;

import java.util.Scanner;

public class Cliente extends Usuario {
    private int idCliente;

    public Cliente(int idCliente, String nome, String cpf, String email, String telefone) {
        super(nome, cpf, email, telefone);
        this.idCliente = idCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void realizarCadastro() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Cadastro");
        System.out.print("Insira seu nome completo: ");
        this.nome = leitor.nextLine();
        System.out.print("Insira seu CPF: ");
        this.cpf = leitor.nextLine();
        System.out.print("Insira seu e-mail: ");
        this.email = leitor.nextLine();
        System.out.print("Insira seu número telefônico: ");
        this.telefone = leitor.nextLine();
        System.out.println("\n\nProcessando cadastro...");
        System.out.println("\nCadastro efetuado");

    }

}
