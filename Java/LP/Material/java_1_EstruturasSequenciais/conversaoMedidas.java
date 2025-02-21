package LP.Material.java_1_EstruturasSequenciais;

import java.util.Scanner;

class conversaoMedidas {

    public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);
    Double m, cm; //metros e centimetros

    System.out.println("****CONVERSÃO METROS PARA CENTIMETROS****");
    System.out.println("Insira um valor em metros: ");
    m = leitor.nextDouble();
    cm = m*100;

    System.out.println(m + " metros equivale à " + cm + " centimetros");
    }
}