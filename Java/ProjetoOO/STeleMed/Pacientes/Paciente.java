package ProjetoOO.STeleMed.Pacientes;

import ProjetoOO.STeleMed.*;

public class Paciente extends Usuario {

    private static int contadorIdPaciente = 1;
    private int idPaciente;
    private String dataDeNascimento = new String();

    public Paciente(String nome, String cpf, String telefone, String endereco, String email, String senha, String dataDeNascimento) {
        super(nome, cpf, telefone, endereco, email, senha);
        this.idPaciente = contadorIdPaciente++;
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getIdPaciente() {
        return idPaciente;
    }
    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    
    @Override
    public void realizarLogin() {
    }

    @Override
    public void visualizarMenu() {
    }
    
}