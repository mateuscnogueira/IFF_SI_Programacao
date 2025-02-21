package LP.Material.java_1_EstruturasSequenciais;
import java.util.Scanner;

class calculoVolume {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Double comprimento, largura, altura, volume;

        System.out.println("****CÁLCULO VOLUME DA CAIXA D'ÁGUA****");
        System.out.println("Insira o comprimento em metros: ");
        comprimento = leitor.nextDouble();
        System.out.println("Insira a largura em metros: ");
        largura = leitor.nextDouble();
        System.out.println("Insira a altura em metros: ");
        altura = leitor.nextDouble();

        volume = comprimento*largura*altura;

        System.out.println("A caixa d'água tem " + volume + " m³");
        System.out.println();
    }
}