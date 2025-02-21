package ProjetoOO.SistemaTelemedicina;

import java.util.Scanner;

public class Administrador extends Usuario {
    Scanner leitor = new Scanner(System.in);

    private String dado;
    private Administrador proximo;

    private String funcao = new String();

    //private int id_adm;
    //private int contadorId = 1;

    private static Administrador inicial = null;
    private static int totalDeElementos = 0;

    public Administrador(String nome, String cpf, String telefone, String endereco, String email, String senha) {
        super(nome, cpf, telefone, endereco, email, senha);
        //this.id_adm = contadorId++;
        this.funcao = "funcao";
        this.proximo = null;
    }

    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String obterDado() {
        return dado;
    }
    public void definirDado(String dado) {
        this.dado = dado;
    }

    public Administrador obterProximo() {
        return proximo;
    }
    public void definirProximo(Usuario proximo) {
        this.proximo = (Administrador) proximo;
    }

    public void gerenciarAdministrador() {
        int opcao = -1;
        
        do {
            System.out.println("Gerenciar Administrador\n");
    
            System.out.println("Opções: ");
            System.out.println("1 - Cadastrar Administrador");
            System.out.println("2 - Atualizar Dados");
            System.out.println("3 - Remover Administrador");
            System.out.println("0 - Finalizar Gerenciamento\n");

            System.out.print("Digite a opção desejada: ");
            opcao = leitor.nextInt();

            leitor.nextLine(); //limpar o buffer
    
            switch (opcao) {
                case 1:
                    cadastrarAdministrador();
                    break;
                
                case 2:
                    editarAdministrador();
                    break;
    
                case 3:
                    excluirAdministrador();
                    break;

                case 0:
                    System.out.println("\n\nSalvando dados...\n");
                    System.out.println("Dados salvos!\n\n");
                    break;
    
                default:
                    System.out.println("Opção Inválida\n\n");
                    gerenciarAdministrador();
                    break;
            }
        } while(opcao != 0);
    }

    @Override
    public void realizarLogin() {

    }

    public void cadastrarAdministrador() {        
        System.out.println("\n\nCadastro de Administrador\n");
        
        System.out.print("Insira o nome de usuário: ");
        this.nome = leitor.nextLine();
        System.out.print("Insira o cpf: ");
        this.cpf = leitor.nextLine();
        System.out.print("Insira o telefone: ");
        this.telefone = leitor.nextLine();
        System.out.print("Insira o endereço: ");
        this.endereco = leitor.nextLine();
        System.out.print("Insira o email: ");
        this.email = leitor.nextLine();
        System.out.print("Insira a senha: ");
        this.senha = leitor.nextLine();
        System.out.print("Insira a função: ");
        this.funcao = leitor.nextLine();

        Administrador novo = new Administrador(this.nome, this.cpf, this.telefone, this.endereco, this.email, this.senha);
        novo.setFuncao(this.funcao);

        Administrador atual = this.inicial;
        
        if(atual != null) {
            while(atual.obterProximo() != null) {
                atual = atual.obterProximo();
            }
            atual.definirProximo(novo);
        }
        else {
            this.inicial = novo;
        }
        totalDeElementos++;

        System.out.println("\nCadastro realizado com êxito!\n\n");
    }

    public void editarAdministrador() {
        Administrador atual = this.inicial;
        String emailBuscado = new String();

        System.out.println("\n\nEditar Administrador\n");

        System.out.print("Insira o Username (email) que deseja editar: ");
        emailBuscado = leitor.nextLine();
        
        while(atual != null && !atual.getEmail().equals(emailBuscado)) {
            atual = atual.obterProximo();
        }

        if(atual != null) {
            int opcao = -1;
            String troca = new String();
            
            System.out.println("\nQual campo deseja modificar?\n");
            do {
            System.out.println("1 - Nome");
            System.out.println("2 - Telefone");
            System.out.println("3 - Endereço");
            System.out.println("4 - Email");
            System.out.println("5 - Senha");
            System.out.println("0 - Salvar Alterações\n");

            System.out.print("Insira a opção desejada: ");
            opcao = leitor.nextInt();

            leitor.nextLine(); //limpar o buffer

                switch (opcao) {
                    case 1:
                        System.out.print("Nome: ");
                        troca = leitor.nextLine();
                        atual.setNome(troca);
                        System.out.println("\nModificação realizada com êxito!");
                        System.out.println("\nDeseja modificar mais algum campo?\n");
                        break;

                    case 2:
                        System.out.print("Telefone: ");
                        troca = leitor.nextLine();
                        atual.setTelefone(troca);
                        System.out.println("\nModificação realizada com êxito!\n");
                        System.out.println("\nDeseja modificar mais algum campo?\n");
                        break;

                    case 3:
                        System.out.print("Endereço: ");
                        troca = leitor.nextLine();
                        atual.setEndereco(troca);
                        System.out.println("\nModificação realizada com êxito!\n");
                        System.out.println("\nDeseja modificar mais algum campo?\n");
                        break;

                    case 4:
                        System.out.print("Email: ");
                        troca = leitor.nextLine();
                        atual.setEmail(troca);
                        System.out.println("\nModificação realizada com êxito!\n");
                        System.out.println("\nDeseja modificar mais algum campo?\n");
                        break;

                    case 5:
                        System.out.print("Senha: ");
                        troca = leitor.nextLine();
                        atual.setSenha(troca);
                        System.out.println("\nModificação realizada com êxito!\n");
                        System.out.println("\nDeseja modificar mais algum campo?\n");
                        break;

                    case 0:
                        System.out.println("\nDados Salvos!\n\n");
                        break;
                
                    default:
                        System.out.println("\nOpção Inválida! Tente novamente.\n");
                        System.out.println("\nQual campo deseja modificar?\n");
                        break;
                }
            } while (opcao != 0);
        }
        else {
            System.out.println("\nEmail não encontrado, tente novamente!\n\n");
            editarAdministrador();
        }
    }

    public void excluirAdministrador() {
        Administrador atual = this.inicial;
        Administrador anterior = null;
        String emailBuscado = new String();
    
        System.out.print("\nInsira o Username (email) que deseja excluir: ");
        emailBuscado = leitor.nextLine();
    
        while (atual != null && !atual.getEmail().equals(emailBuscado)) {
            anterior = atual;
            atual = atual.obterProximo();
        }
    
        if (atual != null) {
            System.out.print("Tem certeza que deseja excluir o administrador: " + atual.getEmail() + " ? (sim/não): ");
            String confirmacao = leitor.nextLine().toLowerCase(); //converte toda a string para minuscula.
    
            if (confirmacao.equals("sim")) {
                if (anterior == null) {
                    this.inicial = atual.obterProximo();
                } else {
                    anterior.definirProximo(atual.obterProximo());
                }
                System.out.println("\nAdministrador excluído com sucesso!\n\n");
            } else {
                System.out.println("\nOperação cancelada.\n\n");
            }
        } else {
            System.out.println("\nEmail não encontrado. Tente novamente!\n\n");
            excluirAdministrador();
        }
    }
    

    @Override
	public String visualizarCadastros() { //toString
		String elementos = new String();
		Administrador atual = this.inicial;
		while (atual != null) {
			elementos += "Id: " + atual.getId_user() + "\n"
            + "Nome: " + atual.getNome() + "\n"
            + "CPF: " + atual.getCpf() + "\n"
            + "Telefone: " + atual.getTelefone() + "\n"
            + "Endereço: " + atual.getEndereco() + "\n"
            + "Email: " + atual.getEmail() + "\n"
            + "Função: " + atual.getFuncao() + "\n"
            + "---------------------------\n";
			atual = atual.obterProximo();
		}
		return "Administradores Cadastrados: \n\n"+ elementos + "\n";
	}
}
