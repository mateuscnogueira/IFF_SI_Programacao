package ProjetoOO.STeleMed.Administradores;

import java.util.Scanner;

import ProjetoOO.STeleMed.*;
import ProjetoOO.STeleMed.Medicos.*;

public class Administrador extends Usuario {

    Scanner leitor = new Scanner(System.in);

    private static int contadorIdAdm = 1;
    private int idAdm;
    private String funcao = new String();

    private ListaAdministradores listaAdministradores;
    private ListaMedicos listaMedicos;

    public Administrador(String nome, String cpf, String telefone, String endereco, String email, String senha, String funcao) {
        super(nome, cpf, telefone, endereco, email, senha);
        this.idAdm = contadorIdAdm++;
        this.funcao = funcao;
        this.listaAdministradores = new ListaAdministradores();
        this.listaMedicos = new ListaMedicos();

        this.listaAdministradores.cadastrarPrimeiroAdm(this);
    }

    public ListaAdministradores getListaAdministradores() {
        return this.listaAdministradores;
    }
    
    public int getIdAdm() {
        return idAdm;
    }
    public void setIdAdm(int idAdm) {
        this.idAdm = idAdm;
    }

    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    @Override
    public void realizarLogin() {

    }

    @Override
    public void visualizarMenu() {
        
        int opcao = -1;

        do {
            System.out.println("\nGerenciamento do Sistema\n");
            System.out.println("1 - Gerenciar Administradores");
            System.out.println("2 - Gerenciar Médicos");
            System.out.println("3 - Listar Administradores");
            System.out.println("4 - Listar Médicos");
            System.out.println("0 - Sair\n");
            System.out.print("Escolha uma opção: ");
            
            opcao = leitor.nextInt();
            leitor.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    this.listaAdministradores.gerenciarUsuario();
                    break;

                case 2:
                    this.listaMedicos.gerenciarUsuario();
                    break;

                case 3:
                    System.out.println(this.listaAdministradores.visualizarCadastros());
                    break;
    
                case 4:
                    System.out.println(this.listaMedicos.visualizarCadastros());
                    break;

                case 0:
                    System.out.println("\nSaindo do gerenciamento...\n");
                    break;

                default:
                    System.out.println("\nOpção inválida! Tente novamente.\n");
                    break;
            }
        } while (opcao != 0);
    }
}