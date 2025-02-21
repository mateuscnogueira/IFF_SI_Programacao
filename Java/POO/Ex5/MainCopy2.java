package POO.Ex5;

public class MainCopy2 {
    public static void main(String[] args) {
        
        Vip v1 = new Vip(50, 100);
        Normal n1 = new Normal(100);
        CamaroteInferior ci1 = new CamaroteInferior("Inferior", 50, 50, 100);
        CamaroteSuperior cs1 = new CamaroteSuperior(100, 50, 100);

        n1.imprimirIngresso();
        v1.imprimirIngressoVIP();

        ci1.imprimirIngressoCamaroteInferior();
        cs1.imprimirIngressoCamaroteSuperior();

        Novo novo1 = new Novo(100000, "Tamandaré", 100000);
        Velho velho1 = new Velho(30000, "Penha", 100000);

        novo1.imprimirValorImovelNovo();
        velho1.imprimirValorImovelVelho();

    }
}
