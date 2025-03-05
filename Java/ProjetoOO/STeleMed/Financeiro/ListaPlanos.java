package ProjetoOO.STeleMed.Financeiro;

import java.util.Scanner;

public class ListaPlanos {
    
    Scanner leitor = new Scanner(System.in);

    private PlanoDeSaude inicial;
    private int totalDePlanos;

    public ListaPlanos() {
        this.inicial = null;
        this.totalDePlanos = 0;
    }

    public PlanoDeSaude getInicial() {
        return inicial;
    }

    public int getTotalDePlanos() {
        return totalDePlanos;
    }

    public void gerenciarPlano() {
        int opcao = -1;
        
        do {
            System.out.println("\n\nGerenciar Planos de Saúde\n");
    
            System.out.println("Opções: ");
            System.out.println("1 - Cadastrar Plano");
            System.out.println("2 - Atualizar Dados");
            System.out.println("3 - Remover Plano");
            System.out.println("4 - Exibir Planos de Saúde");
            System.out.println("0 - Finalizar Gerenciamento\n");

            System.out.print("Digite a opção desejada: ");
            opcao = leitor.nextInt();

            leitor.nextLine(); //limpar o buffer
    
            switch (opcao) {
                case 1:
                    cadastrarPlano();
                    break;
                
                case 2:
                    editarPlano();
                    break;
    
                case 3:
                    excluirPlano();
                    break;

                case 4:
                    System.out.println(exibirPlanos());
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

    public void cadastrarPlano() {
        System.out.println("\n\nCadastro de Planos de Saúde\n");
        
        System.out.print("Insira o nome do Plano: ");
        String nomePlano = leitor.nextLine();
        System.out.print("Insira a cobertura: ");
        String cobertura = leitor.nextLine();
        System.out.print("Insira o valor: ");
        double valor = leitor.nextDouble();

        leitor.nextLine(); //limparBuffer

        PlanoDeSaude novoPlanoDeSaude = new PlanoDeSaude(nomePlano, cobertura, valor);

        if(this.inicial == null) {
            this.inicial = novoPlanoDeSaude;
        } else {
            PlanoDeSaude atual = this.inicial;

            while(atual.obterProximo() != null) {
                atual = atual.obterProximo();
            }
            atual.definirProximo(novoPlanoDeSaude);
        }
        this.totalDePlanos++;
        System.out.println("\nCadastro realizado com êxito\n\n");
    }

    public void editarPlano() {
        System.out.println("\n\nEditar Plano de Saúde\n");

        System.out.print("Insira o nome do Plano que deseja editar: ");
        String planoBuscado = leitor.nextLine();

        PlanoDeSaude atual = this.inicial;

        while(atual != null && !atual.getNomePlano().equals(planoBuscado)) {
            atual = atual.obterProximo();
        }

        if(atual != null && atual.getNomePlano().equals(planoBuscado)) {
            int opcao = -1;
            String troca = new String();
            double trocaValor;

            System.out.println("\nQual campo deseja modificar?\n");
            do {
                System.out.println("1 - Nome do Plano");
                System.out.println("2 - Cobertura");
                System.out.println("3 - Valor");
                System.out.println("0 - Salvar Alterações\n");

                System.out.print("Insira a opção desejada: ");
                opcao = leitor.nextInt();

                leitor.nextLine(); //limpar o buffer

                switch (opcao) {
                    case 1:
                        System.out.print("Nome do Plano: ");
                        troca = leitor.nextLine();
                        atual.setNomePlano(troca);
                        System.out.println("\nModificação realizada com êxito!");
                        System.out.println("\nDeseja modificar mais algum campo?\n");
                        break;

                    case 2:
                        System.out.print("Cobertura: ");
                        troca = leitor.nextLine();
                        atual.setCobertura(troca);
                        System.out.println("\nModificação realizada com êxito!\n");
                        System.out.println("\nDeseja modificar mais algum campo?\n");
                        break;

                    case 3:
                        System.out.print("Valor: ");
                        trocaValor = leitor.nextDouble();
                        atual.setValor(trocaValor);
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
        } else {
            System.out.println("\nPlano não encontrado! Tente novamente.\n\n");
        }
    }

    public void excluirPlano() {
        System.out.println("\n\nExcluir Plano de Saúde\n");
    
        System.out.print("\nInsira o nome do Plano que deseja excluir: ");
        String planoBuscado = leitor.nextLine();
    
        PlanoDeSaude atual = this.inicial;
        PlanoDeSaude anterior = null;

        if (this.inicial != null) {
            while (atual != null && !atual.getNomePlano().equals(planoBuscado)) {
                anterior = atual;
                atual = atual.obterProximo();
            }

            if (atual != null && atual.getNomePlano().equals(planoBuscado)) {
                System.out.print("Tem certeza que deseja excluir o Plano: " + atual.getNomePlano() + " ? (sim/não): ");
                String confirmacao = leitor.nextLine().toLowerCase();  // converte toda a string para minúscula.
                
                if (confirmacao.equals("sim") || confirmacao.equals("s")) {
                    if (anterior == null) {
                        this.inicial = atual.obterProximo();
                    } else {
                        anterior.definirProximo(atual.obterProximo());
                    }
                    System.out.println("\nPlano excluído com sucesso!\n\n");
                } else {
                    System.out.println("\nOperação cancelada.\n\n");
                }
            } else {
                System.out.println("\nEmail não encontrado!\n\n");
            }
        } else {
            System.out.println("\nNão existe nenhum Plano cadastrado no sistema\n\n");
        }
    }

    public String exibirPlanos() {
        String PlanoDeSaudes = new String();
        PlanoDeSaude atual = this.inicial;
        
        while (atual != null) {
            PlanoDeSaudes += "IdPlano: " + atual.getIdPlano() + "\n"
            + "Nome do Plano: " + atual.getNomePlano() + "\n"
            + "Cobertura: " + atual.getCobertura() + "\n"
            + "Valor: " + atual.getValor() + "\n"
            + "---------------------------\n";
            atual = atual.obterProximo();
        }

        return "Planos de Saúde Cadastrados: \n\n"+ PlanoDeSaudes + "\n";
    }
}
