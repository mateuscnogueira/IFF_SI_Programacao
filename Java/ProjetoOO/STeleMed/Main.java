package ProjetoOO.STeleMed;

import ProjetoOO.STeleMed.Administradores.*;
import ProjetoOO.STeleMed.Medicos.ListaMedicos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Administrador admMestre = new Administrador("Administrador", null, null, null, "adm@gmail.com", "@admin", "Administrador Mestre");

        //Melhor utilizar assim:
        ListaAdministradores listaAdministradores = new ListaAdministradores();
        listaAdministradores.cadastrarPrimeiroAdm(admMestre);
        
        Porém também pode utilizar assim:
        ColecaoDeUsuarios listaMedicos = new ListaMedicos();
        ColecaoDeUsuarios listaAdministradores = new ListaAdministradores();
        ((ListaAdministradores) listaAdministradores).cadastrarPrimeiroAdm(admMestre);
        
        System.out.println(listaAdministradores.visualizarCadastros());
        
        admMestre.visualizarMenu();
        System.out.println(listaMedicos.visualizarCadastros());
        */
    
        Administrador administrador = new Administrador(null, null, null, null, null, null, null);

        /*
        primeira forma de cadastrar o admMestre -> (Administrador - linha 22)

        outra forma de cadastrar o admMestre:
        administrador.getListaAdministradores().cadastrarPrimeiroAdm(administrador);
        */
        
        administrador.visualizarMenu();
    }
}
