package ProjetoOO.STeleMed.Financeiro;

import java.util.Scanner;

public class ListaPagamentos {

    Scanner leitor = new Scanner(System.in);

    private Pagamento inicial;
    private int totalDePagamentos;

    public ListaPagamentos() {
        this.inicial = null;
        this.totalDePagamentos = 0;
    }

    public Pagamento getInicial() {
        return inicial;
    }

    public int getTotalDePagamentos() {
        return totalDePagamentos;
    }

    public void gerenciarPagamento() {
        int opcao = -1;
        
        do {
            System.out.println("\n\nGerenciar Pagamentos\n");
    
            System.out.println("Opções: ");
            System.out.println("1 - Cadastrar Pagamento");
            System.out.println("2 - Atualizar Pagamento");
            System.out.println("3 - Listar Pagamentos");
            System.out.println("0 - Finalizar Gerenciamento\n");

            System.out.print("Digite a opção desejada: ");
            opcao = leitor.nextInt();

            leitor.nextLine(); //limpar o buffer
    
            switch (opcao) {
                case 1:
                    cadastrarPagamento();
                    break;
                
                case 2:
                    editarPagamento();
                    break;
    
                case 3:
                    listarPagamentos();
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

    public void cadastrarPagamento() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor do pagamento: ");
        float valor = leitor.nextFloat();
        leitor.nextLine(); // Limpar buffer

        System.out.print("Digite a data do pagamento (DD/MM/AAAA): ");
        String dataDePagamento = leitor.nextLine();

        System.out.print("Digite o status do pagamento (Pago/Pendente): ");
        String status = leitor.nextLine();

        Pagamento novoPagamento = new Pagamento(valor, dataDePagamento, status);

        if (inicial == null) {
            inicial = novoPagamento;
        } else {
            Pagamento atual = inicial;
            while (atual.obterProximo() != null) {
                atual = atual.obterProximo();
            }
            atual.definirProximo(novoPagamento);
        }

        System.out.println("\nPagamento cadastrado com sucesso!\n");
    }

    public void editarPagamento() {
        System.out.println("\n\nEditar Pagamento\n");

        System.out.print("Insira o ID do Pagamento que deseja editar: ");
        int pagamentoBuscado = leitor.nextInt();
        leitor.nextLine(); //limpar o buffer

        Pagamento atual = this.inicial;

        while(atual != null && atual.getIdPagamento() != pagamentoBuscado) {
            atual = atual.obterProximo();
        }

        if(atual != null && atual.getIdPagamento() == pagamentoBuscado) {
            int opcao = -1;
            String troca = new String();
            float trocaValor;

            System.out.println("\nQual campo deseja modificar?\n");
            do {
                System.out.println("1 - Valor do Pagamento");
                System.out.println("2 - Data do Pagamento");
                System.out.println("3 - Status");
                System.out.println("0 - Salvar Alterações\n");

                System.out.print("Insira a opção desejada: ");
                opcao = leitor.nextInt();
                leitor.nextLine(); //limpar o buffer

                switch (opcao) {
                    case 1:
                        System.out.print("Valor do Pagamento: ");
                        trocaValor = leitor.nextFloat();
                        leitor.nextLine(); //limpar o buffer
                        atual.setValor(trocaValor);
                        System.out.println("\nModificação realizada com êxito!");
                        System.out.println("\nDeseja modificar mais algum campo?\n");
                        break;

                    case 2:
                        System.out.print("Data de Pagamento: ");
                        troca = leitor.nextLine();
                        atual.setDataDePagamento(troca);
                        System.out.println("\nModificação realizada com êxito!\n");
                        System.out.println("\nDeseja modificar mais algum campo?\n");
                        break;

                    case 3:
                        System.out.print("Status: ");
                        troca = leitor.nextLine();
                        atual.setStatus(troca);
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

    public void listarPagamentos() {
        if (inicial == null) {
            System.out.println("\nNenhum pagamento cadastrado.\n");
        } else {
            Pagamento atual = inicial;
            while (atual != null) {
                System.out.println("ID: " + atual.getIdPagamento() + " | Valor: R$ " + atual.getValor() + " | Data: " + atual.getDataDePagamento() + " | Status: " + atual.getStatus());
                atual = atual.obterProximo();
            }
        }
    }
}
