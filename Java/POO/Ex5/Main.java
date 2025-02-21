package POO.Ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Mateus Nogueira");

        Administrativo a1 = new Administrativo(2000, "Noite", "008", "Romilton", "Administrativo");
        Tecnico t1 = new Tecnico(2000, "007", "Leandro", "Técnico");

        System.out.println(g1.exibirDados());

        System.out.println(a1.exibirDados());
        System.out.println(t1.exibirDados());


        System.out.println("\n\n-------------/-------------\n");


        Cachorro c1 = new Cachorro("Spoke", "Pitbull");
        Gato ga1 = new Gato("Garfield", "Laranja");

        System.out.println(c1.late());
        System.out.println(ga1.mia());


        System.out.println("\n\n-------------/-------------\n");


        Rica r1 = new Rica(1000000000.00, "Cela", 22);
        Pobre p1 = new Pobre("Cleiton", 40);
        Miseravel m1 = new Miseravel("Jurandi", 36);

        r1.fazCompras();
        p1.trabalha();
        m1.mendiga();


        System.out.println("\n\n-------------/-------------\n");
        

        Normal n1 = new Normal(100);
        Vip v1 = new Vip(50, 100);
        CamaroteInferior ci1 = new CamaroteInferior("Inferior", 50, 50, 100);
        CamaroteSuperior cs1 = new CamaroteSuperior(100, 50, 100);

        Scanner leitor = new Scanner(System.in);
        int n;
        double valorTotal = 0;

        do {
            System.out.println("\n*MENU*");
            System.out.println("1 - Normal" + "\n2 - VIP" + "\n3 - Camarote Inferior" + "\n4 - Camarote Superior" + "\n0 - Finalizar Compra");
            System.out.print("\nInsira a opção que deseja: ");
            n = leitor.nextInt();

            switch (n) {
                case 1:
                    System.out.println("\nIngresso Normal" + "\nValor: " + n1.getValor());
                    valorTotal += n1.getValor();
                    break;
            
                case 2:
                    System.out.println("\nIngresso VIP" + "\nValor: " + v1.valorIngressoVIP());
                    valorTotal += v1.valorIngressoVIP();
                    break;

                case 3:
                    System.out.println("\nIngresso Camarote Inferior" + "\nValor: " + ci1.valorIngressoCamaroteInferior());
                    valorTotal += ci1.valorIngressoCamaroteInferior();
                    break;
            
                case 4:
                    System.out.println("\nIngresso Camarote Superior" + "\nValor: " + cs1.valorIngressoCamarote());
                    valorTotal += cs1.valorIngressoCamarote();
                    break;

                case 0:
                    System.out.println("\nCompra Finalizada");
                    break;
                default:
                    System.out.println("\nO número inserido não é válido, tente novamente.");
                    break;
            }
        } while(n != 0);

        System.out.println("\nO valor total da compra foi: " + valorTotal);


        System.out.println("\n\n-------------/-------------\n");


        Novo novo1 = new Novo(100000, "Tamandaré", 100000);
        Velho velho1 = new Velho(30000, "Penha", 100000);

        System.out.println("\n*IMÓVEL*");
        System.out.println("1 - Novo" + "\n2 - Velho");
        System.out.print("\nDigite a numeração do imóvel que deseja: ");
        n = leitor.nextInt();

        if(n == 1) {
            novo1.imprimirValorImovelNovo();
        } else {
            velho1.imprimirValorImovelVelho();
        }
    }
}
