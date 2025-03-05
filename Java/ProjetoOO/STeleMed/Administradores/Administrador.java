package ProjetoOO.STeleMed.Administradores;

import java.util.Scanner;

import ProjetoOO.STeleMed.*;
import ProjetoOO.STeleMed.Financeiro.*;
import ProjetoOO.STeleMed.Medicos.*;
import ProjetoOO.STeleMed.Pacientes.*;

public class Administrador extends Usuario {

    Scanner leitor = new Scanner(System.in);

    private static int contadorIdAdm = 1;
    private int idAdm;
    private String funcao = new String();

    private ListaAdministradores listaAdministradores;
    private ListaMedicos listaMedicos;
    private ListaPacientes listaPacientes;
    private ListaPlanos listaPlanos;
    private ListaPagamentos listaPagamentos;

    public Administrador(String nome, String cpf, String telefone, String endereco, String email, String senha, String funcao) {
        super(nome, cpf, telefone, endereco, email, senha);
        this.idAdm = contadorIdAdm++;
        this.funcao = funcao;
        this.listaAdministradores = new ListaAdministradores();
        this.listaMedicos = new ListaMedicos();
        this.listaPlanos = new ListaPlanos();
        this.listaPagamentos = new ListaPagamentos();

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
        boolean acessoLiberado = false;

        while(acessoLiberado != true) {
            System.out.println("\nLogin - Administrador\n");
            System.out.print("\nUsuário: ");
            String emailDigitado = leitor.nextLine();
            System.out.print("\nSenha: ");
            String senhaDigitada = leitor.nextLine();
    
            Elemento atual = this.listaAdministradores.getInicial();
    
            while(atual != null && acessoLiberado != true) {
                Administrador adm = atual.obterAdministrador();
    
                if(adm.getEmail().equals(emailDigitado) && adm.getSenha().equals(senhaDigitada)) {
                    System.out.println("\nLogin bem-sucedido! Acessando menu...\n");
                    acessoLiberado = true;
                } else {
                    atual = atual.obterProximo();
                }
            }
            if (acessoLiberado == false) {
                System.out.println("\nUsuário ou senha incorretos! Tente novamente.\n");     
            } else {
                visualizarMenu();
            }
        }
    }

    @Override
    public void visualizarMenu() {
        
        int opcao = -1;

        do {
            System.out.println("\nGerenciamento do Sistema\n");
            System.out.println("1 - Gerenciar Administradores");
            System.out.println("2 - Gerenciar Médicos");
            System.out.println("3 - Gerenciar Planos de Saúde");
            System.out.println("4 - Gerenciar Pagamentos");
            System.out.println("5 - Listar Administradores");
            System.out.println("6 - Listar Médicos");
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
                    this.listaPlanos.gerenciarPlano();
                    break;

                case 4:
                    this.listaPagamentos.gerenciarPagamento();
                    break;

                case 5:
                    System.out.println(this.listaAdministradores.visualizarCadastros() + "\n");
                    break;
    
                case 6:
                    System.out.println(this.listaMedicos.visualizarCadastros() + "\n");
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