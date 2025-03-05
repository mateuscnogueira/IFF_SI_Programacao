package ProjetoOO.STeleMed;

import ProjetoOO.STeleMed.Administradores.*;
import ProjetoOO.STeleMed.Medicos.*;
import ProjetoOO.STeleMed.Pacientes.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Administrador administrador = new Administrador("Adm Geral", "", "", "", "adm@gmail.com", "admin@", "Administrador Mestre");

        /* Cadastro do ADM Mestre na Lista Encadeada
        primeira forma de cadastrar o admMestre é na classe Administrador -> (linha 22)
        
        outra forma de cadastrar o admMestre, só q na Main:
        administrador.getListaAdministradores().cadastrarPrimeiroAdm(administrador);
        */
        //administrador.realizarLogin();
        administrador.visualizarMenu();
        

        /* Medico medTeste = new Medico(null, null, null, null, null, null, null, null);

        medTeste.visualizarMenu(); */
    }
}
