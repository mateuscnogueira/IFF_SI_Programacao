package Recursao.Estudo.Estudo_Recursao;

public class SomaDigitosNumero {
    public static void main(String[] args) {
        
        int numero = 123, somaDigitos;
    
        somaDigitos = somarDigitos(numero);
        System.out.println(somaDigitos);
    }
    
    public static int somarDigitos(int numero) {
        
        if(numero < 10) {
            return numero;
        }

        return numero %10 + somarDigitos(numero /10); // Passo recursivo: soma o último dígito com a soma dos demais dígitos.

        /* Passo recursivo: A função pega o último dígito (numero % 10) e soma com o resultado da chamada recursiva da função,
        dividindo o número por 10 para remover o último dígito. Isso continua até restar apenas um dígito. */
    }
}
