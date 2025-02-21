package ProjetoOO.SistemaTelemedicina;

public class Main {
    public static void main(String[] args) {
        Administrador adm = new Administrador(null, null, null, null, null, null);

        adm.gerenciarAdministrador();
        System.out.println(adm.visualizarCadastros());
        
        /*
        adm.cadastrarAdministrador();
        adm.editarAdministrador();
        System.out.println(adm);
        */

    }
}
