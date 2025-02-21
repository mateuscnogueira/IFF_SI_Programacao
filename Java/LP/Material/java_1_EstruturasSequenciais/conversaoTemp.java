package LP.Material.java_1_EstruturasSequenciais;

import java.util.Scanner;

class conversaoTemp {

  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);
    Double c, f, k; //variavéis

    System.out.println("****CONVERSÃO DE TEMPERATURA****");
    System.out.print("Insira uma temperatura em graus celsius: ");

    c = leitor.nextDouble();
    f = (9*c+160)/5;
    k = c+273;

    System.out.println(c + "°C equivale à "+ f + " °F");
    System.out.println(c + "°C equivale à "+ k + " K");
    System.out.println();
  }
}