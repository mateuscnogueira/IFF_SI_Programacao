package Recursao.Estudo.Estudo_Recursao;

public class Potencia {
    public static void main(String[] args) {
        int base = 2, expoente = 5;

        int potencia = calcularPotencia(base, expoente);
        System.out.println("Resultado: " + potencia);

    }

    public static int calcularPotencia(int base, int expoente) {
        
        if(expoente == 0) {
            return 1;
        }
        return base * calcularPotencia(base, expoente - 1);
    }
}
