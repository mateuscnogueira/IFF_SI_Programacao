package ProjetoOO.SistemaTelemedicina;

public class Main {
    public static void main(String[] args) {
        Administrador adm = new Administrador(null, null, null, null, null, null);
        adm.gerenciarAdministrador();
        
        Medico med = new Medico(null, null, null, null, null, null);
        med.gerenciarMedico();
        
        Paciente pac = new Paciente(null, null, null, null, null, null);
        pac.gerenciarPaciente();

        System.out.println("Cadastros do Sistema");
        System.out.println(adm.visualizarCadastros());
        System.out.println(med.visualizarCadastros());
        System.out.println(pac.visualizarCadastros());

    }
}
