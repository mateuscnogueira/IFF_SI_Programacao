package ProjetoOO.STeleMed.Medicos;

import java.util.Scanner;

import ProjetoOO.STeleMed.*;

public class ListaMedicos implements ColecaoDeUsuarios {

    Scanner leitor = new Scanner(System.in);

    private Elemento inicial;
    private int totalDeMedicos;

    public ListaMedicos() {
        this.inicial = null;
        this.totalDeMedicos = 0;
    }

    @Override
    public void gerenciarUsuario() {
        int opcao = -1;
        
        do {
            System.out.println("Gerenciar Médicos\n");
    
            System.out.println("Opções: ");
            System.out.println("1 - Cadastrar Médicos");
            System.out.println("2 - Atualizar Dados");
            System.out.println("3 - Remover Médicos");
            System.out.println("0 - Finalizar Gerenciamento\n");

            System.out.print("Digite a opção desejada: ");
            opcao = leitor.nextInt();

            leitor.nextLine(); //limpar o buffer
    
            switch (opcao) {
                case 1:
                    cadastrarUsuario();
                    break;
                
                case 2:
                    editarUsuario();
                    break;
    
                case 3:
                    excluirUsuario();
                    break;

                case 0:
                    System.out.println("\n\nSalvando dados...\n");
                    System.out.println("Dados salvos!\n\n");
                    break;
    
                default:
                    System.out.println("Opção Inválida\n\n");
                    break;
            }
        } while(opcao != 0);
    }

    @Override
    public void cadastrarUsuario() {
        System.out.println("\n\nCadastro de Médico\n");
        
        System.out.print("Insira o nome de usuário: ");
        String nome = leitor.nextLine();
        System.out.print("Insira o cpf: ");
        String cpf = leitor.nextLine();
        System.out.print("Insira o telefone: ");
        String telefone = leitor.nextLine();
        System.out.print("Insira o endereço: ");
        String endereco = leitor.nextLine();
        System.out.print("Insira o email: ");
        String email = leitor.nextLine();
        System.out.print("Insira a senha: ");
        String senha = leitor.nextLine();
        System.out.print("Insira o CRM: ");
        String crm = leitor.nextLine();
        System.out.print("Insira a escpecialidade: ");
        String especialidade = leitor.nextLine();

        Medico medico = new Medico(nome, cpf, telefone, endereco, email, senha, crm, especialidade);

        Elemento novo = new Elemento(medico);

        if(this.inicial == null) {
            this.inicial = novo;
        } else {
            Elemento atual = this.inicial;
            while(atual.obterProximo() != null) {
                atual = atual.obterProximo();
            }
            atual.definirProximo(novo);
        }
        this.totalDeMedicos++;

        System.out.println("\nCadastro realizado com êxito!\n\n");
    }

    @Override
    public void editarUsuario() {
        System.out.println("\n\nEditar Médico\n");

        System.out.print("Insira o Username (email) que deseja editar: ");
        String emailBuscado = leitor.nextLine();

        Elemento atual = this.inicial;
        while(atual != null && !atual.obterMedico().getEmail().equals(emailBuscado)) {
            atual = atual.obterProximo();
        }

        if(atual != null) {
            int opcao = -1;
            String troca = new String();
            Medico med = atual.obterMedico();

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
                        med.setNome(troca);
                        System.out.println("\nModificação realizada com êxito!");
                        System.out.println("\nDeseja modificar mais algum campo?\n");
                        break;

                    case 2:
                        System.out.print("Telefone: ");
                        troca = leitor.nextLine();
                        med.setTelefone(troca);
                        System.out.println("\nModificação realizada com êxito!\n");
                        System.out.println("\nDeseja modificar mais algum campo?\n");
                        break;

                    case 3:
                        System.out.print("Endereço: ");
                        troca = leitor.nextLine();
                        med.setEndereco(troca);
                        System.out.println("\nModificação realizada com êxito!\n");
                        System.out.println("\nDeseja modificar mais algum campo?\n");
                        break;

                    case 4:
                        System.out.print("Email: ");
                        troca = leitor.nextLine();
                        med.setEmail(troca);
                        System.out.println("\nModificação realizada com êxito!\n");
                        System.out.println("\nDeseja modificar mais algum campo?\n");
                        break;

                    case 5:
                        System.out.print("Senha: ");
                        troca = leitor.nextLine();
                        med.setSenha(troca);
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
    }

    @Override
    public void excluirUsuario() {
        System.out.println("\n\nExcluir Médico\n");
    
        System.out.print("\nInsira o Username (email) que deseja excluir: ");
        String emailBuscado = leitor.nextLine();
    
        Elemento atual = this.inicial;
        Elemento anterior = null;
    
        if (this.inicial != null) {
            while (atual != null && !atual.obterMedico().getEmail().equals(emailBuscado)) {
                anterior = atual;
                atual = atual.obterProximo();
            }
    
            if (atual != null && atual.obterMedico().getEmail().equals(emailBuscado)) {
                System.out.print("Tem certeza que deseja excluir o Médico: " + atual.obterMedico().getEmail() + " ? (sim/não): ");
                String confirmacao = leitor.nextLine().toLowerCase();  // converte toda a string para minúscula.
                
                if (confirmacao.equals("sim")) {
                    if (anterior == null) {
                        this.inicial = atual.obterProximo();
                    } else {
                        anterior.definirProximo(atual.obterProximo());
                    }
                    System.out.println("\nMédico excluído com sucesso!\n\n");
                } else {
                    System.out.println("\nOperação cancelada.\n\n");
                }
            } else {
                System.out.println("\nEmail não encontrado!\n\n");
            }
        } else {
            System.out.println("\nNão existe nenhum Médico cadastrado no sistema\n\n");
        }
    }

    @Override
    public String visualizarCadastros() {
        String elementos = new String();
        Elemento atual = this.inicial;

        while(atual != null) {
            Medico medico = atual.obterMedico();

            elementos += "IdUser: " + medico.getId_user() + "\n"
            + "IdMedico: " + medico.getIdMedico() + "\n"
            + "Nome: " + medico.getNome() + "\n"
            + "CPF: " + medico.getCpf() + "\n"
            + "Telefone: " + medico.getTelefone() + "\n"
            + "Endereço: " + medico.getEndereco() + "\n"
            + "Email: " + medico.getEmail() + "\n"
            + "CRM: " + medico.getCrm() + "\n"
            + "Especialidade: " + medico.getEspecialidade() + "\n"
            + "---------------------------\n";

			atual = atual.obterProximo();
        }

        return "Médicos Cadastrados: \n\n"+ elementos + "\n";
    }

    public int totalDeMedicos() {
        return totalDeMedicos;
    }
    
}
