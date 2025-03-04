package ProjetoOO.STeleMed.Medicos;

import java.util.Scanner;

import ProjetoOO.STeleMed.*;

public class Medico extends Usuario {

    Scanner leitor = new Scanner(System.in);

    private static int contadorIdMedico = 1;
    private int idMedico;
    private String crm = new String();
    private String especialidade = new String();

    public Medico(String nome, String cpf, String telefone, String endereco, String email, String senha, String crm, String especialidade) {
        super(nome, cpf, telefone, endereco, email, senha);
        this.idMedico = contadorIdMedico++;
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public int getIdMedico() {
        return idMedico;
    }
    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getCrm() {
        return crm;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    @Override
    public void realizarLogin() {
    }

    @Override
    public void visualizarMenu() {
        int opcao = -1;

        do {
            System.out.println("Menu: "
            + "\n1 - Realizar Consulta"
            + "\n2 - Gerenciar Consulta"
            + "\n3 - Consultar Histórico Médico"
            + "\n4 - Gerenciar Exames"
            + "\n5 - Prescrever Receita"
            + "\n6 - Gerenciar Prontuário"
            + "\n0 - Finalizar Sessão");
    
            System.out.print("Digite a opção desejada: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:

                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 0:
                    System.out.println("Sessão Encerrada!");
                    break;
        
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while(opcao != 0);
    } 
}